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
    public Object visitAssign_value(JavaForBeginnersParser.Assign_valueContext context) {
        scopeTree.put(context, scope);
        scope.increaseStackSize();
        Symbol s = new Symbol(context.VAR_NAME().getText(), Type.getType(context.DATATYPE().getText()));
        Type type = Type.getType(context.DATATYPE().getText());

        if (scope.addVariable(s)) {
            variableAndFunctionTree.put(context, s);
            scope.assignPosition(s);
            return null;
        }
        return null;
    }
}