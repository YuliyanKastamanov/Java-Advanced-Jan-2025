package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private final String name;
    private int age;
    private List<String> courses;

    public Person() {
        this("Default", 0);
    }

    public Person(String name, int age) {
        this.name = name;
//        this.setName(name);
        this.setAge(age);
        this.courses = new ArrayList<>();
        this.courses.add("Java Advanced");
    }

    public List<String> getCourses() {
        return Collections.unmodifiableList(this.courses);
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name can't be empty!");
        }
//        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age can't be negative!");
        }

        this.age = age;
    }
}
