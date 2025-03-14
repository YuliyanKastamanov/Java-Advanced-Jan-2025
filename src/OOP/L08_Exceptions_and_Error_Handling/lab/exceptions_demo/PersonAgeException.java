package exceptions_demo;

public class PersonAgeException extends RuntimeException{

    public PersonAgeException() {
    }

    public PersonAgeException(String message) {
        super(message);
    }
}
