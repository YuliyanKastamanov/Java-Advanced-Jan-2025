package JavaAdvanced.Exam_Examples.halloween;

public class Kid {

    private String name;
    private int age;
    private String street;

    public Kid(String name, int age, String street) {
        this.name = name;
        this.age = age;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        // "{name}, {age} years old, from {street}"
        return "%s, %d years old, from %s".formatted(this.name,
                                                     this.age,
                                                     this.street);
    }
}
