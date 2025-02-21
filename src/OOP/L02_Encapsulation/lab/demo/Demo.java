package demo;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("Kaloyan", 45);
        Person person1 = new Person();

        person.getCourses().forEach(System.out::println);
        person.getCourses().remove(0);
        person.getCourses().forEach(System.out::println);

        //        System.out.println(person.getName());
        //        System.out.println(person.getAge());

        System.out.println();
    }
}
