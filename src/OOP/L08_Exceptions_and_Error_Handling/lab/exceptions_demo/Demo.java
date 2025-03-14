package exceptions_demo;

import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> names = new ArrayList<>();
        names.add("Peter");

        //  int index = Integer.parseInt(scanner.nextLine());

        //        try {
        //            System.out.println(names.get(index));
        //            //some other logic or methods
        //            //they can trow some other exceptions
        //            throw new IllegalArgumentException("Hey I am IlleagalArgumentException!");
        //        } catch (IndexOutOfBoundsException ex) {
        //            System.out.println(ex.getMessage());
        //            System.out.println("Please enter a valid index!");
        //            index = Integer.parseInt(scanner.nextLine());
        //            System.out.println(names.get(index));
        //        } catch (IllegalArgumentException ex) {
        //            System.out.println(ex.getMessage());
        //        } catch (Exception ex) {
        //            System.out.println("Unexpected exception: " + ex.getMessage());
        //        }


        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        try {
            Person person = getDemoPerson(scanner, name, age);

        } catch (Exception ex) {
            throw new DemoException(ex.getMessage(), ex);
        }

        // System.out.println(person);
    }

    public static Person getDemoPerson(Scanner scanner, String name, int age) throws Exception {
        try {

            return getPerson(scanner, name, age);
        } catch (Exception ex) {
            // can have some logic
            throw new DemoException(ex.getMessage() , ex);
        }

    }

    private static Person getPerson(Scanner scanner, String name, int age) {
        Person person;

//        try {
//            person = new Person(name, age);
//
//        } catch (PersonNameException ex) {
//
//            System.out.println(ex.getMessage());
//
//            System.out.print("Please enter your name: ");
//            name = scanner.nextLine();
//
//        } catch (PersonAgeException ex) {
//            System.out.println(ex.getMessage());
//
//            System.out.print("Please enter your age: ");
//            age = Integer.parseInt(scanner.nextLine());
//        }


        person = new Person(name, age);
        return person;
    }
}
















