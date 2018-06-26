package Model;

import Model.Exceptions.InvalidDataTypeException;

/**
 * Class responsible for transforming data types from the custom language to java/jasmin types
 */
public enum Type {
    BOOL,
    INT,
    STRING,
    VOID,
    FLOAT,
    INVALID;

    /**
     * Get the java type resembling the given type
     */
    public static Type getType(String datatype) {
        switch (datatype) {
            case "text":
                return Type.STRING;
            case "whole_number":
                return Type.INT;
            case "condition":
                return Type.BOOL;
            case "decimal":
                return Type.FLOAT;
            case "nothing":
                return Type.VOID;
            default:
                throw new InvalidDataTypeException("Invalid type for " + datatype);
        }
    }

    /**
     * Get the jasmin name of a type
     */
    public String getJasminType() {
        switch (this) {
            case FLOAT:
                return "F";
            case INT:
                return "I";
            case BOOL:
                return "Z";
            case VOID:
                return "V";
            case STRING:
                return "Ljava/lang/String;";
            default:
                return "";
        }
    }
}
