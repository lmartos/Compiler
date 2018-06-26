package Model;


public class Symbol {

    private String name;
    private Type type;
    private int position;

    public Symbol(String name, Type type) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Type getType() {
        return type;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
}