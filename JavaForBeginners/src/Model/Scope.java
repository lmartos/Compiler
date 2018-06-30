package Model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Scope {
    /**
     * Parent for the current scope
     */
    private Scope parent;
    private LinkedHashMap<String, Symbol> variableTable = new LinkedHashMap<>();
    private LinkedHashMap<String, FunctionScope> functieTable = new LinkedHashMap<>();
    private List<Scope> childScopes = new ArrayList<>();
    private String name;
    private int position;
    //the stack size
    private int stack;

    public Scope(Scope parent, String name) {
        this.parent = parent;
        this.name = name;
        this.position = parent == null ? 0 : parent.position;
        this.stack = parent == null ? 0 : parent.stack;
    }

    public Scope(Scope parent, String name,int stack) {
        this.parent = parent;
        this.name = name;
        this.position = parent == null ? 0 : parent.position;
        this.stack = stack;
    }
    public Scope createChild(String naam) {
        return new Scope(this, naam);
    }
    public Scope createChild(String naam, int stack) {
        return new Scope(this, naam,stack);
    }
    public Scope closeChild() {
        return parent;
    }
    public boolean addChildScope(Scope scope) {
        return childScopes.add(scope);
    }
    public boolean addFunction(Function function) {
        FunctionScope mt = findFunction(function.getFunctionName());
        if (mt == null) {
            FunctionScope functionScope = new FunctionScope(this, function.getFunctionName(), function);
            functieTable.put(function.getFunctionName(), functionScope);
            childScopes.add(functionScope);
            return true;
        }
        return false;
    }

    public boolean addVariable(Symbol variable) {
        Symbol s = findVariable(variable.getName());
        if (s == null) {

            variableTable.put(variable.getName(), variable);
            return true;
        }
        return false;
    }

    public Symbol findVariable(String name) {

        if (parent != null) {
            if (variableTable.get(name) != null) {
                return variableTable.get(name);
            } else {
                return parent.findVariable(name);
            }
        } else {
            return variableTable.get(name);
        }
    }

    public FunctionScope findFunction(String name) {
        FunctionScope mt = functieTable.get(name);
        if (parent != null) {
            if (mt != null) {
                return mt;
            } else {
                return parent.findFunction(name);
            }
        } else {
            return mt;
        }
    }

    /**
     * determine stack size by checking the current scope and child scopes
     */
    public int getLocalAmount() {

        int max = 0;
        int temp = 0;
        for (Scope scope : childScopes) {
            if (scope instanceof FunctionScope) {
                continue;
            }

            temp = scope.getLocalAmount();
            if (temp > max) {
                max = temp;
            }
        }
        return max + variableTable.size();
    }

    /**
     * Determine stack size based on the current scope
     */
    public int getLocalStack() {
        int max = 0;
        int temp = 0;
        for (Scope scope : childScopes) {
            if (scope instanceof FunctionScope) {
                continue;
            }

            temp = scope.getLocalStack();
            if (temp > max) {
                max = temp;
            }
        }
        return max + stack;
    }

    /**
     * Get the global scope
     */
    public Scope getGlobalScope() {
        if (parent != null) {
            return parent.getGlobalScope();
        }
        return this;
    }

    public void assignPosition(Symbol symbol) {
        symbol.setPosition(position++);
    }
    public void increaseStackSize() {
        stack++;
    }
    public String getScopeName() {
        return name;
    }
    public void setScopeName(String name) {
        this.name = name;
    }
    public List<Scope> getChildScopes() {
        return childScopes;
    }
    public Scope getParent() {
        return parent;
    }
}