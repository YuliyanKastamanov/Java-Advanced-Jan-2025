package say_hello;

public interface Person {

    public abstract String getName();

    default String sayHello() {
        return "Hello";
    }
}
