package Model.Exceptions;

public class DataTypeMismatchException extends RuntimeException {
    public DataTypeMismatchException(String message) {
        super(message);
    }
}
