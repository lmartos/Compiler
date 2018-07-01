package Model.Exceptions;

public class VariableDoesNotExistException extends RuntimeException {
    public VariableDoesNotExistException(String message) {
        super(message);
    }
}
