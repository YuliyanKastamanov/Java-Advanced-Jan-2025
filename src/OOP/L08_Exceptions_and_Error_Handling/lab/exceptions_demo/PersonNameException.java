package exceptions_demo;

public class PersonNameException extends RuntimeException {

    public PersonNameException() {
    }

    public PersonNameException(String message) {
        super(message);
    }
}
