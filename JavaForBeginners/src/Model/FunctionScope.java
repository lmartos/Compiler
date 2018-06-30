package Model;

public class FunctionScope extends Scope {

    private Function function;

    /**
     * Child class for placing functions into the scope
     */
    public FunctionScope(Scope parent, String name, Function function) {
        super(parent, name);
        this.function = function;
        for (Symbol s : function.getParameters()) {
            addVariable(s);
            assignPosition(s);
        }
    }

    public Function getFunction() {
        return function;
    }
}