package OOP.L12_DesignPatterns.Exercise.factoryExercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        Cake chocolateCake = CakeFactory.createCake("chocolate");
        Cake veganCake = CakeFactory.createCake("vegan");
        Cake redVelvet = CakeFactory.createCake("red-velvet");

    }
}
