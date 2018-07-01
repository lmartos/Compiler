import Model.Exceptions.*;
import Model.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class CodeChecker extends JavaForBeginnersBaseVisitor {
    /**
     * Scope counters
     */
    private static int IF_NAME = 0;
    private static int IF_ELSE_SCOPE_NAME = 0;
    private static int METHOD_SCOPE_NAME = 0;
    private static int WHILE_SCOPE_NAME = 0;
    private static int FOR_SCOPE_NAME = 0;

    /**
     * All parse trees needed for code generation
     */
    private ParseTreeProperty expressionTypeTree;
    private ParseTreeProperty scopeTree;
    private ParseTreeProperty variableAndFunctionTree;

    /**
     * Current scope and method scope
     */
    private Scope scope;
    private FunctionScope functionScope;

    /**
     * Name for the scope
     */
    private String latestname;

    public CodeChecker() {
        scopeTree = new ParseTreeProperty();
        variableAndFunctionTree = new ParseTreeProperty();
        expressionTypeTree = new ParseTreeProperty();

        METHOD_SCOPE_NAME += 1;
        scope = new Scope(null, "method_" + METHOD_SCOPE_NAME);

        Symbol symbol = new Symbol("args", Type.STRING);
        scope.addVariable(symbol);
        scope.assignPosition(symbol);

    }

    @Override
    public Object visitFunctionBlock(JavaForBeginnersParser.FunctionBlockContext context) {
        scopeTree.put(context, this.scope);
        Scope scope = this.scope.createChild(latestname);
        this.scope = scope;

        this.scope.getParent().addChildScope(this.scope);

        visitChildren(context);
        this.scope = this.scope.closeChild();

        return null;
    }

    @Override
    public Object visitAssign_value(JavaForBeginnersParser.Assign_valueContext context) {
        scopeTree.put(context, scope);
        scope.increaseStackSize();
        Symbol s = new Symbol(context.VAR_NAME().getText(), Type.getType(context.DATATYPE().getText()));
        Type type = Type.getType(context.DATATYPE().getText());

        if (type == Type.INVALID || visit(context.variable_expression()) != type) {
            throw new InvalidDataTypeException("Variable " + context.VAR_NAME().getText() + " has incorrect type");
        }

        if (scope.addVariable(s)) {
            variableAndFunctionTree.put(context, s);
            scope.assignPosition(s);
            return null;
        } else {
            throw new VariableAlreadyExistsException("Variable " + context.VAR_NAME().getText() + " already exists!");
        }
    }

    @Override
    public Object visitDeclare(JavaForBeginnersParser.DeclareContext context) {
        scopeTree.put(context, scope);
        scope.increaseStackSize();
        Symbol s = new Symbol(context.VAR_NAME().getText(), Type.getType(context.DATATYPE().getText()));
        Type type = Type.getType(context.DATATYPE().getText());

        if (type == Type.INVALID) {
            throw new InvalidDataTypeException("Variable " + context.VAR_NAME().getText() + " has incorrect type");
        }
        if (scope.addVariable(s)) {
            variableAndFunctionTree.put(context, s);
            scope.assignPosition(s);
            return null;
        } else {
            throw new VariableAlreadyExistsException("Variable " + context.VAR_NAME().getText() + " already exists!");
        }
    }

    @Override
    public Object visitAssign_value_by_method(JavaForBeginnersParser.Assign_value_by_methodContext context) {
        scopeTree.put(context, scope);
        scope.increaseStackSize();
        visitCall_function(context.call_function());
        FunctionScope functionScope = scope.findFunction(context.call_function().VAR_NAME().getText());
        Function function = null;
        if (functionScope != null) {
            function = functionScope.getFunction();
        } else {
            throw new VariableDoesNotExistException("Function " + context.call_function().VAR_NAME().getText() + " does not exist");
        }
        Symbol s = new Symbol(context.VAR_NAME().getText(), Type.getType(context.DATATYPE().getText()));

        Type returnType = Type.getType(context.DATATYPE().getText());

        if (returnType == function.getReturnType()) {
            if (scope.addVariable(s)) {
                variableAndFunctionTree.put(context, s);
                scope.assignPosition(s);
                return null;
            } else {
                throw new VariableAlreadyExistsException("Variable " + context.VAR_NAME().getText() + " already exists!");
            }
        } else {
            throw new InvalidDataTypeException("Return types do not match for " + context.VAR_NAME().getText());
        }

    }

    @Override
    public Object visitOperator_with_method(JavaForBeginnersParser.Operator_with_methodContext context) {
        scopeTree.put(context, scope);
        visitCall_function(context.call_function());
        FunctionScope functionScope = scope.findFunction(context.call_function().VAR_NAME().getText());
        Function function = null;
        if (functionScope != null) {
            function = functionScope.getFunction();
        } else {
            throw new VariableDoesNotExistException("Function " + context.call_function().VAR_NAME().getText() + " does not exist");
        }
        Symbol var = scope.findVariable(context.VAR_NAME().getText());

        variableAndFunctionTree.put(context, var);

        if (function != null) {
            if (var != null) {
                if (var.getType() == function.getReturnType()) {
                    return null;
                } else {
                    throw new InvalidDataTypeException("Datatypes do not match for " + context.VAR_NAME().getText());
                }
            } else {
                throw new VariableDoesNotExistException("Variable " + context.VAR_NAME().getText() + " does not exist!");
            }
        }
        throw new VariableDoesNotExistException("Function " + context.call_function().VAR_NAME().getText() + " does not exist");
    }

    @Override
    public Object visitOperator(JavaForBeginnersParser.OperatorContext context) {
        scopeTree.put(context, scope);
        Symbol var = scope.findVariable(context.id.getText());
        variableAndFunctionTree.put(context, var);
        if (var != null) {
            if (visit(context.Expression) == var.getType()) {
                return null;
            } else {
                throw new DataTypeMismatchException("Datatypes do not match for " + context.id.getText());
            }
        }
        throw new VariableDoesNotExistException("Variable " + context.id.getText() + " does not exist");
    }

    @Override
    public Object visitCall_function(JavaForBeginnersParser.Call_functionContext context) {
        scopeTree.put(context, scope);
        FunctionScope functionScope = scope.findFunction(context.VAR_NAME().getText());
        Function function = null;
        if (functionScope != null) {
            function = functionScope.getFunction();
        } else {
            throw new VariableDoesNotExistException("Function " + context.VAR_NAME().getText() + " does not exist");
        }
        if (context.argument() == null && function.getParameters().size() > 0) {
            throw new MissingParamatersException("Function " + context.VAR_NAME().getText() + " is missing parameters");
        } else if (context.argument().argument_type() == null && function.getParameters().size() > 0) {
            throw new MissingParamatersException("Function " + context.VAR_NAME().getText() + " is missing parameters");
        } else if (context.argument().argument_type().size() < function.getParameters().size()) {
            throw new MissingParamatersException("Function " + context.VAR_NAME().getText() + " is missing parameters");
        } else if (context.argument().argument_type().size() > function.getParameters().size()) {
            throw new InvalidParametersException("Function " + context.VAR_NAME().getText() + " has too many parameters");
        }
        for (int i = 0; i < function.getParameters().size(); i++) {
            Symbol p = function.getParameters().get(i);
            Type type = Type.INVALID;
            scope.increaseStackSize();
            if (context.argument().argument_type(i).BOOLEAN() != null) {
                type = Type.BOOL;
            } else if (context.argument().argument_type(i).STRING() != null) {
                type = Type.STRING;
            } else if (context.argument().argument_type(i).INT() != null) {
                type = Type.INT;
            } else if (context.argument().argument_type(i).FLOAT() != null) {
                type = Type.FLOAT;
            } else if (context.argument().argument_type(i).VAR_NAME() != null) {
                Symbol var = scope.findVariable(context.argument().argument_type(i).getText());
                if (var != null) {
                    type = var.getType();
                } else {
                    throw new VariableDoesNotExistException("Variable " + context.argument().argument_type(i).getText() + " does not exist");
                }
            }
            if (p.getType() != type) {
                throw new DataTypeMismatchException("Datatypes do not match");
            }
        }

        return null;
    }

    @Override
    public Object visitFunction_execution(JavaForBeginnersParser.Function_executionContext context) {
        scopeTree.put(context, scope);

        if (scope.findFunction(context.VAR_NAME().getText()) == null) {
            JavaForBeginnersParser.Argument_executionContext apc = context.argument_execution();
            Type type2 = Type.getType(context.DATATYPE().getText());

            Function function = new Function(context.VAR_NAME().getText(), type2);

            if (apc != null) {
                for (int i = 0; i < apc.argument_type().size(); i++) {
                    JavaForBeginnersParser.Argument_typeContext e = apc.argument_type(i);
                    Type type = Type.getType(apc.DATATYPE(i).getText());
                    Symbol s = new Symbol(e.getText(), type);
                    boolean exists = false;
                    if (function.getParameters().size() > 0) {
                        for (int j = 0; j < function.getParameters().size(); j++) {
                            if (function.getParameters().get(j).getName().equals(s.getName())) {
                                exists = true;
                            }
                        }
                    }
                    if (!exists) {
                        function.addParameter(new Symbol(e.getText(), type));
                    } else {
                        throw new VariableAlreadyExistsException("Function " + function.getFunctionName() + " already has parameter " + s.getName());
                    }
                }
            }

            scope.addFunction(function);
            this.scope = scope.findFunction(function.getFunctionName());

            variableAndFunctionTree.put(context, function);
        } else {
            throw new VariableAlreadyExistsException("Function " + context.VAR_NAME().getText() + " already exists");
        }

        visit(context.function());
        return null;
    }

    @Override
    public Object visitFunction(JavaForBeginnersParser.FunctionContext context) {
        METHOD_SCOPE_NAME += 1;
        latestname = "method_" + METHOD_SCOPE_NAME;
        Scope scope = this.scope.createChild(latestname, 0);

        this.functionScope = (FunctionScope) this.scope;
        this.functionScope.setScopeName(latestname);
        scopeTree.put(context, this.scope);
        visitChildren(context.code_block());


        if (this.functionScope.getFunction().getReturnType() != Type.VOID) {
            if (context.RETURN() != null && context.VAR_NAME() != null && context.SEMICOLON() != null) {
                Symbol s = scope.findVariable(context.VAR_NAME().getText());
                if (s != null) {
                    if (this.functionScope.getFunction().getReturnType() != s.getType()) {
                        throw new InvalidReturnTypeException("Return types not matching");
                    }
                } else {
                    throw new VariableDoesNotExistException("Variable " + context.VAR_NAME().getText() + " does not exist!");
                }
            } else {
                throw new InvalidReturnTypeException("No return type found for method " + this.functionScope.getFunction().getFunctionName());
            }
        } else {
            if (context.RETURN() != null && context.VAR_NAME().getText().length() > 0) {
                throw new InvalidReturnTypeException("No return type allowed for void");
            }
        }
        this.scope = this.scope.closeChild();

        functionScope = null;

        return null;
    }

    @Override
    public Object visitRead_statement(JavaForBeginnersParser.Read_statementContext context) {
        scopeTree.put(context, scope);
        scope.increaseStackSize();
        if (!context.DATATYPE().getText().equals("leegte")) {
            Symbol var = scope.findVariable(context.VAR_NAME().getText());
            variableAndFunctionTree.put(context, var);
            visit(context.VAR_NAME());
            if (var != null) {
                if (var.getType() == Type.getType(context.DATATYPE().getText())) {
                    return null;
                } else {
                    throw new DataTypeMismatchException("Datatypes dont match for " + context.VAR_NAME().getText());
                }
            } else {
                throw new VariableDoesNotExistException("Variable " + context.VAR_NAME().getText() + " doesn't exist!");
            }
        } else {
            throw new InvalidDataTypeException("Datatype is void for " + context.VAR_NAME().getText());
        }
    }

    @Override
    public Object visitPrintVar(JavaForBeginnersParser.PrintVarContext context) {
        Symbol s = scope.findVariable(context.VAR_NAME().getText());
        scope.increaseStackSize();
        if (s != null) {
            scopeTree.put(context, scope);
            scope.increaseStackSize();
            return null;
        }
        throw new VariableDoesNotExistException("Variable " + context.VAR_NAME().getText() + " does not exist");
    }

    @Override
    public Object visitPrintText(JavaForBeginnersParser.PrintTextContext context) {
        scopeTree.put(context, scope);
        scope.increaseStackSize();
        return super.visitPrintText(context);
    }

    @Override
    public Object visitFor_statement(JavaForBeginnersParser.For_statementContext context) {
        FOR_SCOPE_NAME++;
        latestname = "for_loop_" + FOR_SCOPE_NAME;
        Scope scope = this.scope.createChild(latestname);
        this.scope = scope;

        this.scope.getParent().addChildScope(this.scope);

        scopeTree.put(context, this.scope);

        if (context.verand != null) {
            visitChildren(context.verand);
            Symbol var = scope.findVariable(context.verand.id.getText());
            if (var == null) {
                throw new VariableDoesNotExistException("Variable " + context.token.VAR_NAME().getText() + " doesn't exist!");
            }

            variableAndFunctionTree.put(context, var);
        } else if (context.token != null) {
            if (this.scope.findVariable(context.assign_value().VAR_NAME().getText()) == null) {
                Symbol var = new Symbol(context.assign_value().VAR_NAME().getText(), Type.getType(context.assign_value().DATATYPE().getText()));
                this.scope.addVariable(var);
                this.scope.assignPosition(var);
                variableAndFunctionTree.put(context, var);
            } else {
                throw new VariableAlreadyExistsException("Variable " + context.token.VAR_NAME().getText() + " already exists");
            }
        }
        if (visit(context.boolean_expression()) != Type.BOOL) {
            throw new InvalidDataTypeException("expression is not a boolean");
        }
        visit(context.variable_expression());
        visitChildren(context.function_block());
        this.scope = this.scope.closeChild();
        return null;
    }

    @Override
    public Type visitWhile_statement(JavaForBeginnersParser.While_statementContext context) {
        WHILE_SCOPE_NAME++;
        latestname = "zolang_" + WHILE_SCOPE_NAME;
        Scope scope = this.scope.createChild(latestname);
        this.scope = scope;

        this.scope.getParent().addChildScope(this.scope);

        scopeTree.put(context, this.scope);
        if (visit(context.boolean_expression()) == Type.BOOL) {
            visit(context.function_block());
            this.scope = this.scope.closeChild();
            return Type.BOOL;
        }
        throw new InvalidDataTypeException("While does not contain a boolean");
    }

    @Override
    public Object visitIf_statement(JavaForBeginnersParser.If_statementContext context) {
        IF_NAME++;
        latestname = "if_" + IF_NAME;
        Scope scope = this.scope.createChild(latestname);
        this.scope = scope;

        this.scope.getParent().addChildScope(this.scope);

        scopeTree.put(context, this.scope);
        for (int i = 0; i < context.condition_block().size(); i++) {
            IF_ELSE_SCOPE_NAME++;
            latestname = "if_statement_" + IF_ELSE_SCOPE_NAME;
            if (visit(context.condition_block(i)) != Type.BOOL) {
                throw new InvalidDataTypeException("If statement does not contain a boolean");
            }
        }
        if (context.function_block() != null) {
            IF_ELSE_SCOPE_NAME++;
            latestname = "if_statement_" + IF_ELSE_SCOPE_NAME;
            visit(context.function_block());
        }
        this.scope = this.scope.closeChild();
        return Type.BOOL;
    }

    @Override
    public Type visitCondition_block(JavaForBeginnersParser.Condition_blockContext context) {
        scopeTree.put(context, scope);

        if (visit(context.boolean_expression()) == Type.BOOL) {
            visit(context.function_block());
            return Type.BOOL;
        }
        throw new InvalidDataTypeException(context.Expression.getText() + " condition does not result in a boolean");

    }

    @Override
    public Object visitAtomexpression(JavaForBeginnersParser.AtomexpressionContext context) {
        scopeTree.put(context, scope);
        if (context.variable_expression() != null) {
            return visit(context.variable_expression());
        }
        return visit(context.boolean_expression());
    }

    @Override
    public Type visitComparisonExpression(JavaForBeginnersParser.ComparisonExpressionContext context) {
        scopeTree.put(context, scope);
        return expressionHelper(visitChildren(context.leftExpression), visitChildren(context.rightExpression));
    }

    @Override
    public Type visitEqualityExpression(JavaForBeginnersParser.EqualityExpressionContext context) {
        scopeTree.put(context, scope);
        return expressionHelper(visitChildren(context.leftExpression), visitChildren(context.rightExpression));
    }

    private Type expressionHelper(Object leftType, Object rightType) {
        Type l = (Type) leftType;
        Type r = (Type) rightType;

        if ((l == Type.BOOL || l == Type.FLOAT || l == Type.INT) &&
                (r == Type.BOOL || r == Type.FLOAT || r == Type.INT)) {
            return Type.BOOL;
        }
        throw new InvalidDataTypeException("expression is not a boolean");
    }

    @Override
    public Type visitAtomVar(JavaForBeginnersParser.AtomVarContext context) {
        scopeTree.put(context, scope);
        Symbol s = scope.findVariable(context.VAR_NAME().getText());
        if (s != null) {
            return s.getType();
        }
        throw new VariableDoesNotExistException("Variable " + context.VAR_NAME().getText() + " does not exist!");
    }

    @Override
    public Type visitPlusMinExpression(JavaForBeginnersParser.PlusMinExpressionContext context) {
        scopeTree.put(context, scope);
        if (context.op.getText().equals("+") || context.op.getText().equals("-")) {
            if (visit(context.leftExpression) == Type.INT && visit(context.rightExpression) == Type.INT) {
                ExpressionType ExpressionType = new ExpressionType(Type.INT);
                expressionTypeTree.put(context, ExpressionType);
                return Type.INT;
            } else if ((visit(context.leftExpression) == Type.INT && visit(context.rightExpression) == Type.FLOAT) ||
                    (visit(context.leftExpression) == Type.FLOAT && visit(context.rightExpression) == Type.INT) ||
                    (visit(context.leftExpression) == Type.FLOAT && visit(context.rightExpression) == Type.FLOAT)) {
                ExpressionType ExpressionType = new ExpressionType(Type.FLOAT);
                expressionTypeTree.put(context, ExpressionType);
                return Type.FLOAT;
            }
        }
        throw new IllegalArgumentException("Unsupported expression");
    }

    @Override
    public Type visitMultDivModExpression(JavaForBeginnersParser.MultDivModExpressionContext context) {
        scopeTree.put(context, scope);
        if (context.op.getText().equals("%") || context.op.getText().equals("*") || context.op.getText().equals("/")) {
            if (visit(context.leftExpression) == Type.INT && visit(context.rightExpression) == Type.INT) {
                ExpressionType ExpressionType = new ExpressionType(Type.INT);
                expressionTypeTree.put(context, ExpressionType);
                return Type.INT;
            } else if ((visit(context.leftExpression) == Type.INT && visit(context.rightExpression) == Type.FLOAT) ||
                    (visit(context.leftExpression) == Type.FLOAT && visit(context.rightExpression) == Type.INT) ||
                    (visit(context.leftExpression) == Type.FLOAT && visit(context.rightExpression) == Type.FLOAT)) {
                ExpressionType ExpressionType = new ExpressionType(Type.FLOAT);
                expressionTypeTree.put(context, ExpressionType);
                return Type.FLOAT;
            }
        }
        throw new IllegalArgumentException("Unsupported expression");
    }

    @Override
    public Type visitAssignCalculationExpression(JavaForBeginnersParser.AssignCalculationExpressionContext context) {
        Symbol symbol = scope.findVariable(context.leftExpression.getText());
        scopeTree.put(context, scope);
        if (symbol != null) {
            if (visit(context.leftExpression) == Type.INT && visit(context.rightExpression) == Type.INT) {
                ExpressionType ExpressionType = new ExpressionType(Type.INT);
                expressionTypeTree.put(context, ExpressionType);
                variableAndFunctionTree.put(context, symbol);
                return Type.INT;
            } else if ((visit(context.leftExpression) == Type.INT && visit(context.rightExpression) == Type.FLOAT) ||
                    (visit(context.leftExpression) == Type.FLOAT && visit(context.rightExpression) == Type.INT) ||
                    (visit(context.leftExpression) == Type.FLOAT && visit(context.rightExpression) == Type.FLOAT)) {
                ExpressionType ExpressionType = new ExpressionType(Type.FLOAT);
                expressionTypeTree.put(context, ExpressionType);
                variableAndFunctionTree.put(context, symbol);
                return Type.FLOAT;
            } else {
                throw new IllegalArgumentException("Unsupported expression");
            }
        } else {
            throw new VariableDoesNotExistException("Variable " + context.leftExpression.getText() + " does not exist!");
        }
    }

    @Override
    public Type visitMinminPlusPlusExpression(JavaForBeginnersParser.MinminPlusPlusExpressionContext context) {
        scopeTree.put(context, scope);
        Symbol var = scope.findVariable(context.leftExpression.getText());
        variableAndFunctionTree.put(context, var);
        if (var != null) {
            if (visit(context.leftExpression) == Type.FLOAT) {
                scope.increaseStackSize();
                ExpressionType ExpressionType = new ExpressionType(Type.FLOAT);
                expressionTypeTree.put(context, ExpressionType);
                return Type.FLOAT;
            } else if (visit(context.leftExpression) == Type.INT) {
                ExpressionType ExpressionType = new ExpressionType(Type.INT);
                expressionTypeTree.put(context, ExpressionType);
                return Type.INT;
            }
            throw new InvalidDataTypeException(context.leftExpression.getText() + " expression has incorrect type");
        } else {
            throw new VariableDoesNotExistException("Variable " + context.leftExpression.getText() + " does not exist!");
        }
    }

    @Override
    public Type visitAtomInt(JavaForBeginnersParser.AtomIntContext context) {
        scopeTree.put(context, scope);
        scope.increaseStackSize();
        return Type.INT;
    }

    @Override
    public Type visitAtomString(JavaForBeginnersParser.AtomStringContext context) {
        scopeTree.put(context, scope);
        scope.increaseStackSize();
        return Type.STRING;
    }

    @Override
    public Type visitAtomFloat(JavaForBeginnersParser.AtomFloatContext context) {
        scopeTree.put(context, scope);
        scope.increaseStackSize();
        return Type.FLOAT;
    }

    @Override
    public Type visitAtomBoolean(JavaForBeginnersParser.AtomBooleanContext context) {
        scopeTree.put(context, scope);
        scope.increaseStackSize();
        return Type.BOOL;
    }

    public ParseTreeProperty getScopeTree() {
        return scopeTree;
    }

    public Scope getGlobalScope() {
        return scope.getGlobalScope();
    }

    public ParseTreeProperty getVariableAndFunctionTree() {
        return variableAndFunctionTree;
    }

    public ParseTreeProperty getExpressionTypeTree() {
        return expressionTypeTree;
    }
}