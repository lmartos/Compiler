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
     * getter for accessing the printwriter in the main class
     */
    public PrintWriter getJasminWriter() {
        return jasminWriter;
    }
}