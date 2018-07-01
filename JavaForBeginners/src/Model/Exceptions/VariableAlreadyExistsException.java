package Model.Exceptions;

public class VariableAlreadyExistsException extends RuntimeException {
    public VariableAlreadyExistsException(String message) {
        super(message);
    }
}
