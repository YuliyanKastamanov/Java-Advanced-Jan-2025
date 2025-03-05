package polymorphism_demo.staticcc;

public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("Person name is " + this.name);
    }
}
