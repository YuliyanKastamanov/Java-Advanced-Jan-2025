package exceptions_demo;

import java.util.Scanner;

public class DemoFinally {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        Person person = new Person();

        try {
            person = new Person(name, age);
        } finally { // always execute the finally block nevertheless of trow or not an Exception
            System.out.println("Always print person info!");
            System.out.println(person);
        }
    }
}
