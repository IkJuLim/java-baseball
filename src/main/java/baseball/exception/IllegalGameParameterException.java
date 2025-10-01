package baseball.exception;

public class IllegalGameParameterException extends IllegalArgumentException {
    public IllegalGameParameterException(String message) {
        super(message);
    }
}
