package exceptions_demo;

public class DemoException extends RuntimeException {

    public DemoException() {
    }

    public DemoException(String message) {
        super(message);
    }

    public DemoException(String message, Throwable cause) {
        super(message, cause);
    }
}
