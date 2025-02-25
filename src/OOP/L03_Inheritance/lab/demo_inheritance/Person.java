package demo_inheritance;

public class Person {

    private String name;
    private String address;

    protected Person(String name, String address) {
       this.setName(name);
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
