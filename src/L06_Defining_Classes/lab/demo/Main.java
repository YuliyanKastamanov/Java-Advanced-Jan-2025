package L06_Defining_Classes.lab.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car1 = new Car("BMW", "X5", -500);
        Car car2 = new Car("KIA", "STINGER", 450);
        Car car3 = new Car("OPEL");
        Car car4 = new Car("HONDA", "ACCORD");
        Car car5 = new Car();

        car1.addPart("Brake disc");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
