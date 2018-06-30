package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Data class for storing function data
 */
public class Function {

    private List<Symbol> parameters;
    private String functionName;
    private Type returnType;

    public Function(String functionName, Type returnType) {
        this.functionName = functionName;
        this.returnType = returnType;
        this.parameters = new ArrayList<>();
    }

    public String getFunctionName() {
        return functionName;
    }
    public Type getReturnType() {
        return returnType;
    }
    public List<Symbol> getParameters() {
        return parameters;
    }
    public boolean addParameter(Symbol parameter) {
        return parameters.add(parameter);
    }
}