import Model.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.IOException;
import java.io.PrintWriter;


public class CodeGenerator extends JavaForBeginnersBaseVisitor {

    private Scope globalScope;

    private String jasminFilename;
    private PrintWriter jasminWriter;

    private ParseTreeProperty scopeTree;
    private ParseTreeProperty variableAndFunctionTree;
    private ParseTreeProperty expressionTypeTree;


    /**
     * Counters used to keep track of label increases
     */
    private int printExpression = 0;
    private int notBool = 0;
    private int andBool = 0;
    private int orBool = 0;

    /**
     * The previous expression
     */
    private ExpressionType previousExpression;

    /**
     * Helper variable to see if a calculation is needed
     */
    private Symbol calculationSymbol = null;


    public CodeGenerator(String fileName, ParseTreeProperty scopeTree, ParseTreeProperty variableAndFunctionTree, ParseTreeProperty expressionTypeTree, Scope globalScope) throws IOException {
        this.globalScope = globalScope;
        this.variableAndFunctionTree = variableAndFunctionTree;
        this.expressionTypeTree = expressionTypeTree;
        this.scopeTree = scopeTree;

        //instantiate the jasmin writer and start the class file
        this.jasminFilename = fileName.split("\\.")[0];
        this.jasminWriter = new PrintWriter(fileName, "UTF-8");

        if(jasminFilename.contains("/")){
            String[] split =  jasminFilename.split(("/"));
            jasminFilename = split[split.length - 1];
        }else if(jasminFilename.contains("\\")){
            String[] split =  jasminFilename.split(("\\\\"));
            jasminFilename = split[split.length - 1];
        }

        jasminWriter.println(".class public " + this.jasminFilename
                + "\r\n.super java/lang/Object" +
                "\r\n\r\n.method public <init>()V" +
                "\r\n\t.limit stack 5" +
                "\r\n\t.limit locals 1" +
                "\r\n\taload_0" +
                "\r\n\tinvokespecial java/lang/Object/<init>()V" +
                "\r\n\treturn" +
                "\r\n.end method\r\n");
    }


    @Override
    public Object visitParse(JavaForBeginnersParser.ParseContext context) {
        //create the main method (starting point of any java program)
        jasminWriter.println(".method public static main([Ljava/lang/String;)V");
        jasminWriter.println("\t.limit stack 5");
        jasminWriter.println("\t.limit locals 1");
        jasminWriter.println("\r\n\taload 0");
        jasminWriter.println("\r\n\tnew " + jasminFilename);
        jasminWriter.println("\tdup");
        //call the init and our self created main method
        jasminWriter.println("\tinvokespecial " + jasminFilename + "/<init>()V");
        jasminWriter.println("\tinvokespecial " + jasminFilename + "/main()V");
        jasminWriter.println("\r\n\treturn");
        jasminWriter.println(".end method");

        //start our own main method to which we will append the parsed language
        jasminWriter.println("\r\n.method public main()V");
        jasminWriter.println("\t.limit stack " + (globalScope.getLocalStack() + 1));
        jasminWriter.println("\t.limit locals " + (globalScope.getLocalAmount()) + "\r\n");
        //parse the code
        visitChildren(context.code_block());
        jasminWriter.println("\r\n\treturn");
        jasminWriter.println(".end method\r\n");
        //parse functionns
        if (context.function_execution() != null) {
            for (int i = 0; i < context.function_execution().size(); i++) {
                visit(context.function_execution(i));
                jasminWriter.println("");
            }
        }
        return null;
    }


    @Override
    public Object visitFunctionBlock(JavaForBeginnersParser.FunctionBlockContext context) {
        visitChildren(context);
        return null;
    }

    /**
     * Visitor -- and ++. will load the given variable and either increase or decrease it by 1 and then store it.
     **/
    @Override
    public Object visitMinminPlusPlusExpression(JavaForBeginnersParser.MinminPlusPlusExpressionContext context) {
        Symbol s = (Symbol) variableAndFunctionTree.get(context);
        if (context.op.getText().equals("--")) {
            if (s.getType() == Type.INT) {
                jasminWriter.println("\tiinc " + s.getPosition() + " -1");
            } else {
                jasminWriter.println("\tfload " + s.getPosition());
                jasminWriter.println("\tfconst_1");
                jasminWriter.println("\tfsub");
            }
        } else if (context.op.getText().equals("++")){
            if (s.getType() == Type.INT) {
                jasminWriter.println("\tiinc " + s.getPosition() + " 1");
            } else {
                jasminWriter.println("\tfload " + s.getPosition());
                jasminWriter.println("\tfconst_1");
                jasminWriter.println("\tfadd");
                jasminWriter.println("\tfstore " + s.getPosition());
            }
        }
        return null;
    }

    /**
     * visitor for + and -, will perform the operator on an expression
     */
    @Override
    public Object visitPlusMinExpression(JavaForBeginnersParser.PlusMinExpressionContext context) {
        this.previousExpression = (ExpressionType) expressionTypeTree.get(context);
        Type leftExpression = (Type) visitChildren(context.leftExpression);
        // if there is a calculation chain and the last result was a float, convert any ints to floats
        Type previousExpressionType = this.previousExpression.getExpressionType();
        if (previousExpressionType == Type.FLOAT && leftExpression == Type.INT) {
            jasminWriter.println("\ti2f");
        }
        Type rightExpression = (Type) visitChildren(context.rightExpression);
        if (previousExpressionType == Type.FLOAT && previousExpressionType == Type.INT) {
            jasminWriter.println("\ti2f");
        }
        if (context.op.getText().equals("-")) {
            if (previousExpressionType == Type.FLOAT) {
                jasminWriter.println("\tfsub");
            } else {
                jasminWriter.println("\tisub");
            }
        } else if (context.op.getText().equals("+")) {
            if (previousExpressionType == Type.FLOAT) {
                jasminWriter.println("\tfadd");
            } else {
                jasminWriter.println("\tiadd");
            }
        }
        return null;
    }


    @Override
    public Object visitMultDivModExpression(JavaForBeginnersParser.MultDivModExpressionContext context) {
        this.previousExpression = (ExpressionType) expressionTypeTree.get(context);
        Type leftExpression = (Type) visitChildren(context.leftExpression);
        // if there is a calculation chain and the last result was a float, convert any ints to floats
        Type previousExpressionType = this.previousExpression.getExpressionType();
        if (previousExpressionType == Type.FLOAT && leftExpression == Type.INT) {
            jasminWriter.println("\ti2f");
        }
        Type rightExpression = (Type) visitChildren(context.rightExpression);
        if (previousExpressionType == Type.FLOAT && rightExpression == Type.INT) {
            jasminWriter.println("\ti2f");
        }
        if (context.op.getText().equals("*")) {
            if (previousExpressionType == Type.FLOAT) {
                jasminWriter.println("\tfmul");
            } else {
                jasminWriter.println("\timul");
            }
        } else if (context.op.getText().equals("/")) {
            if (previousExpressionType == Type.FLOAT) {
                jasminWriter.println("\tfdiv");
            } else {
                jasminWriter.println("\tidiv");
            }
        } else {
            if (previousExpressionType == Type.FLOAT) {
                jasminWriter.println("\tfrem");
            } else {
                jasminWriter.println("\tirem");
            }
        }
        return null;
    }

    /**
     * Visitor for assign calculations, these expressions will perform the operator and immediately store the result in the given variable
     */
    @Override
    public Object visitAssignCalculationExpression(JavaForBeginnersParser.AssignCalculationExpressionContext context) {
        this.previousExpression = (ExpressionType) expressionTypeTree.get(context);
        Type leftExpression = (Type) visitChildren(context.leftExpression);
        // if there is a calculation chain and the last result was a float, convert any ints to floats
        this.calculationSymbol = (Symbol) variableAndFunctionTree.get(context);
        if (this.previousExpression.getExpressionType() == Type.FLOAT && leftExpression == Type.INT) {
            jasminWriter.println("\ti2f");
        }
        Type rightExpression = (Type) visitChildren(context.rightExpression);
        if (this.previousExpression.getExpressionType() == Type.FLOAT && rightExpression == Type.INT) {
            jasminWriter.println("\ti2f");
        }

        if (context.op.getText().equals("*=") || context.op.getText().equals("=*")) {
            if (this.previousExpression.getExpressionType() == Type.FLOAT) {
                jasminWriter.println("\tfmul");
            } else {
                jasminWriter.println("\timul");
            }
        } else if (context.op.getText().equals("/=") || context.op.getText().equals("=/")) {
            if (this.previousExpression.getExpressionType() == Type.FLOAT) {
                jasminWriter.println("\tfdiv");
            } else {
                jasminWriter.println("\tidiv");
            }
        } else if (context.op.getText().equals("-=") || context.op.getText().equals("=-")) {
            if (this.previousExpression.getExpressionType() == Type.FLOAT) {
                jasminWriter.println("\tfsub");
            } else {
                jasminWriter.println("\tisub");
            }
        } else {
            if (this.previousExpression.getExpressionType() == Type.FLOAT) {
                jasminWriter.println("\tfadd");
            } else {
                jasminWriter.println("\tiadd");
            }
        }
        storeVariableHelper(this.calculationSymbol.getType(), this.calculationSymbol.getPosition());
        return null;
    }

    /**
     * Visitor for voor statement
     *
     * @param context context
     * @return null
     */
    @Override
    public Object visitFor_statement(JavaForBeginnersParser.For_statementContext context) {
        Scope forScope = (Scope) scopeTree.get(context);
        Symbol symbol = (Symbol) variableAndFunctionTree.get(context);
        if (context.verand != null) {
            int pos = symbol.getPosition();
            loadSymbolHelper(symbol.getType(), pos);

            visitChildren(context.verand.variable_expression());

            storeVariableHelper(symbol.getType(), pos);
        } else if (context.token != null) {
            visitChildren(context.assign_value().variable_expression());

            int pos = symbol.getPosition();
            storeVariableHelper(symbol.getType(), pos);
        }
        jasminWriter.println("\t" + forScope.getScopeName() + ":");

        visit(context.boolean_expression());
        jasminWriter.println(forScope.getScopeName() + "_end");
        visitChildren(context.function_block());
        visit(context.variable_expression());
        jasminWriter.println("\tgoto " + forScope.getScopeName());
        jasminWriter.println("\t" + forScope.getScopeName() + "_end:");
        return null;
    }


    @Override
    public Object visitFunction_execution(JavaForBeginnersParser.Function_executionContext context) {
        if (context.argument_execution() != null) {
            Function function = (Function) variableAndFunctionTree.get(context);
            jasminWriter.print(".method public " + context.VAR_NAME().getText() + "(" + parameterHelper(function).toString() + ")");
        } else {
            jasminWriter.print(".method public " + context.VAR_NAME().getText() + "()");
        }
        Type type = Type.getType(context.DATATYPE().getText());
        jasminWriter.println(type.getJasminType());

        visitFunctionHelper(context.function(), type, context.VAR_NAME().getText());
        jasminWriter.println(".end method");
        return null;
    }

    @Override
    public Object visitCall_function(JavaForBeginnersParser.Call_functionContext context) {
        Scope scope = (Scope) scopeTree.get(context);
        FunctionScope functionScope = ((Scope) scopeTree.get(context)).findFunction(context.VAR_NAME().getText());
        Function function = functionScope.getFunction();

        jasminWriter.println("\taload 0");
        if (context.argument() != null) {
            for (int i = 0; i < context.argument().argument_type().size(); i++) {
                functionExecutionHelper(context.argument().argument_type().get(i), scope);
            }
            jasminWriter.println("\tinvokevirtual " + jasminFilename + "/" + function.getFunctionName() + "(" + parameterHelper(function).toString() + ")" + function.getReturnType().getJasminType());
        } else {
            jasminWriter.println("\tinvokevirtual " + jasminFilename + "/" + function.getFunctionName() + "()" + function.getReturnType().getJasminType());

        }

        return null;
    }

    @Override
    public Type visitAtomInt(JavaForBeginnersParser.AtomIntContext context) {
        Integer integer = new Integer(context.INT().getText());
        if (integer >= 0 && integer < 128) {
            jasminWriter.println("\tbipush " + integer);
        } else if (integer >= 128 && integer < 32768) {
            jasminWriter.println("\tsipush " + integer);
        } else {
            jasminWriter.println("\tldc " + integer);
        }
        return Type.INT;
    }

    @Override
    public Type visitAtomBoolean(JavaForBeginnersParser.AtomBooleanContext context) {
        if (context.BOOLEAN().getText().equals("true")) {
            jasminWriter.println("\ticonst_1");
        } else {
            jasminWriter.println("\ticonst_0");
        }
        return Type.BOOL;
    }

    @Override
    public Type visitAtomFloat(JavaForBeginnersParser.AtomFloatContext context) {
        jasminWriter.println("\tldc " + new Float(context.FLOAT().getText()));
        return Type.FLOAT;
    }

    @Override
    public Type visitAtomString(JavaForBeginnersParser.AtomStringContext context) {
        jasminWriter.println("\tldc " + context.STRING().getText());
        return Type.STRING;
    }

    @Override
    public Type visitAtomVar(JavaForBeginnersParser.AtomVarContext context) {
        Symbol var = ((Scope) scopeTree.get(context)).findVariable(context.VAR_NAME().getText());
        loadSymbolHelper(var.getType(), var.getPosition());
        return var.getType();
    }

    @Override
    public Object visitIf_statement(JavaForBeginnersParser.If_statementContext context) {
        Scope scope = (Scope) scopeTree.get(context);
        String endIf = scope.getScopeName() + "_end";

        for (int i = 0; i < context.condition_block().size(); i++) {
            JavaForBeginnersParser.Condition_blockContext condition_blockContext = context.condition_block(i);
            Scope scope1 = scope.getChildScopes().get(i);

            Scope next = null;
            if (context.function_block() != null) {
                if (i + 1 <= context.condition_block().size()) {
                    next = scope.getChildScopes().get(i + 1);
                }
            } else {
                if (i + 1 <= context.condition_block().size() - 1) {
                    next = scope.getChildScopes().get(i + 1);
                }
            }

            jasminWriter.println("\t" + scope1.getScopeName() + ":");
            visitChildren(condition_blockContext.boolean_expression());
            if (next != null) {
                jasminWriter.println(next.getScopeName());
            } else {
                jasminWriter.println(endIf);
            }
            visitChildren(condition_blockContext.function_block());

            jasminWriter.println("\tgoto " + scope.getScopeName() + "_end");
        }
        if (context.function_block() != null) {
            Scope lastScope = scope.getChildScopes().get(scope.getChildScopes().size() - 1);
            jasminWriter.println("\t" + lastScope.getScopeName() + ":");
            visitChildren(context.function_block());
        }
        jasminWriter.println("\t" + scope.getScopeName() + "_end:");
        return null;
    }

    @Override
    public Object visitWhile_statement(JavaForBeginnersParser.While_statementContext context) {
        Scope scope = (Scope) scopeTree.get(context.function_block());
        jasminWriter.println("\t" + scope.getScopeName() + ":");
        visitChildren(context.boolean_expression());
        jasminWriter.println(scope.getScopeName() + "_end");
        visitChildren(context.function_block());
        jasminWriter.println("\tgoto " + scope.getScopeName());
        jasminWriter.println("\t" + scope.getScopeName() + "_end:");
        return null;
    }


    @Override
    public Object visitAssign_value(JavaForBeginnersParser.Assign_valueContext context) {
        Symbol symbol = (Symbol) variableAndFunctionTree.get(context);
        visit(context.variable_expression());

        int pos = symbol.getPosition();
        storeVariableHelper(symbol.getType(), pos);
        return null;
    }

    /**
     * visitor for declaring a variable without setting it
     */
    @Override
    public Object visitDeclare(JavaForBeginnersParser.DeclareContext context) {
        Symbol symbol = (Symbol) variableAndFunctionTree.get(context);
        switch (symbol.getType()) {
            case FLOAT:
                jasminWriter.println("\tfconst_0");
                break;
            case INT:
                jasminWriter.println("\ticonst_0");
                break;
            case BOOL:
                jasminWriter.println("\ticonst_0");
                break;
            case STRING:
                jasminWriter.println("\tldc \"\"");
                break;
        }
        storeVariableHelper(symbol.getType(), symbol.getPosition());
        return super.visitDeclare(context);
    }

    @Override
    public Object visitAssign_value_by_method(JavaForBeginnersParser.Assign_value_by_methodContext context) {
        Symbol s = (Symbol) variableAndFunctionTree.get(context);
        Scope scope = (Scope) scopeTree.get(context);
        int pos = s.getPosition();

        FunctionScope functionScope = ((Scope) scopeTree.get(context)).findFunction(context.call_function().VAR_NAME().getText());
        Function function = functionScope.getFunction();

        jasminWriter.println("\taload 0");
        if (context.call_function().argument() != null) {
            for (int i = 0; i < context.call_function().argument().argument_type().size(); i++) {
                functionExecutionHelper(context.call_function().argument().argument_type().get(i), scope);
            }
            jasminWriter.println("\tinvokevirtual " + jasminFilename + "/" + function.getFunctionName() + "(" + parameterHelper(function).toString() + ")" + function.getReturnType().getJasminType());
        } else {
            jasminWriter.println("\tinvokevirtual " + jasminFilename + "/" + function.getFunctionName() + "()" + function.getReturnType().getJasminType());

        }
        storeVariableHelper(s.getType(), pos);

        return null;
    }


    @Override
    public Object visitOperator(JavaForBeginnersParser.OperatorContext context) {
        Symbol symbol = (Symbol) variableAndFunctionTree.get(context);
        int pos = symbol.getPosition();

        visit(context.variable_expression());

//        if (this.calculationSymbol != null) {
//            if (this.calculationSymbol.getType() == Type.INT) {
//                jasminWriter.println("\tiload " + this.calculationSymbol.getPosition());
//            } else {
//                jasminWriter.println("\tfload " + this.calculationSymbol.getPosition());
//            }
//            this.calculationSymbol = null;
//        }else{

//        }
        storeVariableHelper(symbol.getType(), pos);
        return null;
    }


    @Override
    public Object visitOperator_with_method(JavaForBeginnersParser.Operator_with_methodContext context) {
        Symbol s = (Symbol) variableAndFunctionTree.get(context);
        Scope scope = (Scope) scopeTree.get(context);
        int pos = s.getPosition();
        FunctionScope functionScope = ((Scope) scopeTree.get(context)).findFunction(context.call_function().VAR_NAME().getText());
        Function function = functionScope.getFunction();
        jasminWriter.println("\taload 0");
        if (context.call_function().argument() != null) {
            for (int i = 0; i < context.call_function().argument().argument_type().size(); i++) {
                functionExecutionHelper(context.call_function().argument().argument_type().get(i), scope);
            }
            jasminWriter.println("\tinvokevirtual " + jasminFilename + "/" + function.getFunctionName() + "(" + parameterHelper(function).toString() + ")" + function.getReturnType().getJasminType());
        } else {
            jasminWriter.println("\tinvokevirtual " + jasminFilename + "/" + function.getFunctionName() + "()" + function.getReturnType().getJasminType());

        }
        storeVariableHelper(s.getType(), pos);

        return null;
    }

    /**
     * Visitor for comparison expression, only used  in if statements
     */
    @Override
    public Object visitComparisonExpression(JavaForBeginnersParser.ComparisonExpressionContext context) {
        Type type = (Type) visitChildren(context.leftExpression);
        if (type == Type.FLOAT) {
            jasminWriter.println("\tf2i");
        }
        Type type2 = (Type) visitChildren(context.rightExpression);
        if (type2 == Type.FLOAT) {
            jasminWriter.println("\tf2i");
        }
        if (context.op.getText().equals("<=")) {
            jasminWriter.print("\tif_icmpgt ");
        } else if (context.op.getText().equals(">=")) {
            jasminWriter.print("\tif_icmplt ");
        } else if (context.op.getText().equals("<")) {
            jasminWriter.print("\tif_icmpge ");
        } else if (context.op.getText().equals(">")) {
            jasminWriter.print("\tif_icmple ");
        }
        return null;
    }

    /**
     * Visitor for equality expression only used in if statements
     */
    @Override
    public Object visitEqualityExpression(JavaForBeginnersParser.EqualityExpressionContext context) {
        visitChildren(context.leftExpression);
        visitChildren(context.rightExpression);
        //check for not equals
        if (context.op.getText().equals("!=")) {
            jasminWriter.print("\tif_icmpeq ");
        } else {
            jasminWriter.print("\tif_icmpne ");
        }
        return null;
    }

    @Override
    public Object visitNotBool(JavaForBeginnersParser.NotBoolContext context){
        notBool++;
        jasminWriter.println("\tnot_bool_" + notBool  + ":");
        visit(context.boolean_expression());
        notBool++;
        jasminWriter.println("not_bool_" + notBool);
        jasminWriter.println("\ticonst_1");
        jasminWriter.println("\ticonst_0");
        jasminWriter.println("\tgoto not_bool_" + (notBool - 1) + "_end");
        jasminWriter.println("\tnot_bool_" + notBool  + ":");
        jasminWriter.println("\ticonst_1");
        jasminWriter.println("\ticonst_1");
        jasminWriter.println("\tgoto not_bool_" + (notBool - 1) + "_end");
        jasminWriter.println("\tnot_bool_" + (notBool - 1) + "_end:");
        jasminWriter.print("\tif_icmpne ");
        return null;
    }


    /**
     * Visitor for printing variables
     */
    @Override
    public Object visitPrintVar(JavaForBeginnersParser.PrintVarContext context) {
        Scope scope = (Scope) scopeTree.get(context);
        Symbol s = scope.findVariable(context.VAR_NAME().getText());
        jasminWriter.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
        loadSymbolHelper(s.getType(), s.getPosition());
        switch (s.getType()) {
            case STRING:
                jasminWriter.println("\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
                break;
            case INT:
                jasminWriter.println("\tinvokevirtual java/io/PrintStream/println(I)V");
                break;
            case FLOAT:
                jasminWriter.println("\tinvokevirtual java/io/PrintStream/println(F)V");
                break;
            case BOOL:
                jasminWriter.println("\tinvokevirtual java/io/PrintStream/println(Z)V");
                break;
        }
        return super.visitPrintVar(context);
    }

    /**
     * Visitor for printing direct input
     */
    @Override
    public Object visitPrintText(JavaForBeginnersParser.PrintTextContext context) {
        jasminWriter.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
        jasminWriter.println("\tldc " + context.STRING().getText());
        jasminWriter.println("\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        return null;
    }

    @Override
    public Object visitPrintInt(JavaForBeginnersParser.PrintIntContext context){
        jasminWriter.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
        jasminWriter.println("\tbipush " + context.INT().getText());
        jasminWriter.println("\tinvokevirtual java/io/PrintStream/println(I)V");
        return null;
    }

    @Override
    public Object visitPrintFloat(JavaForBeginnersParser.PrintFloatContext context){
        jasminWriter.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
        jasminWriter.println("\tldc " + context.FLOAT().getText());
        jasminWriter.println("\tinvokevirtual java/io/PrintStream/println(F)V");
        return null;
    }

    /**
     * Visitor for printing direct input bools
     */
    @Override
    public Object visitPrintBool(JavaForBeginnersParser.PrintBoolContext context) {
        printExpression++;

        visit(context.boolean_expression());
        jasminWriter.println("printExpression_" + printExpression + "_else");
        jasminWriter.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
        jasminWriter.println("\ticonst_1");
        jasminWriter.println("\tinvokevirtual java/io/PrintStream/println(Z)V");

        jasminWriter.println("\tgoto printExpression_" + printExpression + "_end");

        jasminWriter.println("\tprintExpression_" + printExpression + "_else:");
        jasminWriter.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
        jasminWriter.println("\ticonst_0");
        jasminWriter.println("\tinvokevirtual java/io/PrintStream/println(Z)V");

        jasminWriter.println("\tgoto printExpression_" + printExpression + "_end");
        jasminWriter.println("\tprintExpression_" + printExpression + "_end:");

        return null;
    }

    /**
     * Visitor for printing direct input calculations
     */
    @Override
    public Object visitPrintCalc(JavaForBeginnersParser.PrintCalcContext context) {
        jasminWriter.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
        visit(context.variable_expression());
        if (this.calculationSymbol != null) {
            if (this.calculationSymbol.getType() == Type.INT) {
                jasminWriter.println("\tiload " + this.calculationSymbol.getPosition());
            } else {
                jasminWriter.println("\tfload " + this.calculationSymbol.getPosition());
            }
            this.calculationSymbol = null;
        }
        if (this.previousExpression.getExpressionType() == Type.INT) {
            jasminWriter.println("\tinvokevirtual java/io/PrintStream/println(I)V");

        } else {
            jasminWriter.println("\tinvokevirtual java/io/PrintStream/println(F)V");
        }
        return null;
    }

    /**
     * Visitor for reading user input, accepts the datatypes text, whole_number, decimal and condition
     */
    @Override
    public Object visitRead_statement(JavaForBeginnersParser.Read_statementContext context) {
        Scope scope = (Scope) scopeTree.get(context);
        int i = scope.findVariable(context.VAR_NAME().getText()).getPosition();
        Symbol var = (Symbol) variableAndFunctionTree.get(context);
        loadSymbolHelper(var.getType(), i);

        jasminWriter.println("\tnew java/util/Scanner");
        jasminWriter.println("\tdup");
        jasminWriter.println("\tgetstatic java/lang/System/in Ljava/io/InputStream;");
        jasminWriter.println("\tinvokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V");
        switch (context.DATATYPE().getText()) {
            case "text":
                jasminWriter.println("\tinvokevirtual java/util/Scanner/nextLine()Ljava/lang/String;");
                jasminWriter.println("\tastore " + i);
                break;
            case "whole_number":
                jasminWriter.println("\tinvokevirtual java/util/Scanner/nextInt()I");
                jasminWriter.println("\tistore " + i);
                break;
            case "decimal":
                jasminWriter.println("\tinvokevirtual java/util/Scanner/nextFloat()F");
                jasminWriter.println("\tfstore " + i);
                break;
            case "condition":
                jasminWriter.println("\tinvokevirtual java/util/Scanner/nextBoolean()Z");
                jasminWriter.println("\tistore" + i);
                break;
        }
        return super.visitRead_statement(context);
    }

    /**
     * Helper function for visiting a function block
     */
    private void visitFunctionHelper(JavaForBeginnersParser.FunctionContext context, Type returnType, String name) {
        Scope scope = ((Scope) scopeTree.get(context));
        jasminWriter.println("\t.limit stack " + (scope.getLocalStack() + 1));
        jasminWriter.println("\t.limit locals " + (scope.getLocalAmount() + 1) + "\r\n");
        visitChildren(context.code_block());
        if (context.RETURN() != null) {
            visit(context.VAR_NAME());
            Symbol symbol = scope.findVariable(context.VAR_NAME().getText());
            loadSymbolHelper(symbol.getType(), symbol.getPosition());
            switch (returnType) {
                case STRING:
                    jasminWriter.println("\r\n\tareturn");
                    break;
                case INT:
                    jasminWriter.println("\n\tireturn");
                    break;
                case FLOAT:
                    jasminWriter.println("\r\n\tfreturn");
                    break;
                case BOOL:
                    jasminWriter.println("\r\n\tireturn");
                    break;
            }
        } else {
            jasminWriter.println("\r\n\treturn");
        }
    }

    /**
     * Helper method for method calling
     */
    private void functionExecutionHelper(JavaForBeginnersParser.Argument_typeContext argument_typeContext, Scope scope) {
        if (argument_typeContext.BOOLEAN() != null) {
            visit(argument_typeContext.BOOLEAN());
            if (argument_typeContext.BOOLEAN().getText().equals("true")) {
                jasminWriter.println("\ticonst_1");
            } else {
                jasminWriter.println("\ticonst_0");
            }
        } else if (argument_typeContext.VAR_NAME() != null) {
            Symbol var = scope.findVariable(argument_typeContext.VAR_NAME().getText());
            loadSymbolHelper(var.getType(), var.getPosition());
        } else if (argument_typeContext.FLOAT() != null) {
            jasminWriter.println("\tldc " + new Float(argument_typeContext.FLOAT().getText()));
        } else if (argument_typeContext.INT() != null) {
            Integer integer = new Integer(argument_typeContext.INT().getText());
            if (integer >= 0 && integer < 128) {
                jasminWriter.println("\tbipush " + integer);
            } else if (integer >= 128 && integer < 32768) {
                jasminWriter.println("\tsipush " + integer);
            } else {
                jasminWriter.println("\tldc " + integer);
            }
        } else if (argument_typeContext.STRING() != null) {
            jasminWriter.println("\tldc " + argument_typeContext.STRING().getText());
        }
    }

    /**
     * Helper method for loading variables
     */
    private int loadSymbolHelper(Type type, int pos) {
        switch (type) {
            case FLOAT:
                jasminWriter.println("\tfload " + pos);
                break;
            case INT:
                jasminWriter.println("\tiload " + pos);
                break;
            case BOOL:
                jasminWriter.println("\tiload " + pos);
                break;
            case STRING:
                jasminWriter.println("\taload " + pos);
                break;
        }
        return pos;
    }

    /**
     * Helper method for storing variables
     */
    private void storeVariableHelper(Type type, int pos) {
        switch (type) {
            case STRING:
                jasminWriter.println("\tastore " + pos);
                break;
            case BOOL:
                jasminWriter.println("\tistore " + pos);
                break;
            case INT:
                jasminWriter.println("\tistore " + pos);
                break;
            case FLOAT:
                jasminWriter.println("\tfstore " + pos);
                break;
        }
    }

    /**
     * Helper method for building parameters
     */
    private StringBuilder parameterHelper(Function function) {
        StringBuilder builder = new StringBuilder();
        for (Symbol var : function.getParameters()) {
            Type type = var.getType();
            builder.append(type.getJasminType());
        }
        return builder;
    }

    /**
     * getter for accessing the printwriter in the main class
     */
    public PrintWriter getJasminWriter() {
        return jasminWriter;
    }
}