package say_hello;

public class Bulgarian extends BasePerson implements Person {

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {

        return "Здравей";
    }
}
