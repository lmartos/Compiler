package Model.Exceptions;

public class InvalidDataTypeException extends RuntimeException {
    public InvalidDataTypeException(String message) {
        super(message);
    }
}
