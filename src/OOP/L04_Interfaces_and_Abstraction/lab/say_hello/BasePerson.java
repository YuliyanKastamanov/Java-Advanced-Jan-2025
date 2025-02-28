package say_hello;

public abstract class BasePerson {

    private String name;

    protected BasePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
