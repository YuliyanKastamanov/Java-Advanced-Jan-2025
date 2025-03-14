package exceptions_demo;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        //TODO handle exception
        Demo.getDemoPerson(scanner, name, age);

        // RuntimeException -> unchecked exceptions
        // Exception -> checked exceptions
    }
}












