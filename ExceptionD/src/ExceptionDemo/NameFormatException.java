package ExceptionDemo;

public class NameFormatException extends RuntimeException{

    public NameFormatException(String message) {
        super(message);
    }

    public NameFormatException() {
    }
}
