package Model;

public class ExpressionType {

    private Type expressionType;

    /**
     * Class responsible for holding the type of an expression, this can be checked in visitors
     */
    public ExpressionType(Type expressionType) {
        this.expressionType = expressionType;
    }

    public Type getExpressionType() {
        return expressionType;
    }

}
