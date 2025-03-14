package exceptions_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private List<String> courses;

    public Person() {
        this("Default", 0);
    }

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.courses = new ArrayList<>();
    }

    public List<String> getCourses() {
        return Collections.unmodifiableList(this.courses);
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 3 || name.isBlank()) {

           throw new PersonNameException("Name can't be empty!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {

        if (age < 0) {

           throw new PersonAgeException("Age can't be negative!");
        }

        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", courses=" + courses +
               '}';
    }
}
