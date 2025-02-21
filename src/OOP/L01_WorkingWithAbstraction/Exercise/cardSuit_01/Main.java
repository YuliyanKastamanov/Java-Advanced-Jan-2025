package OOP.L01_WorkingWithAbstraction.Exercise.cardSuit_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Card Suits:");



        Suits[] suits = Suits.values();

        for (Suits suit : suits){
            System.out.printf("Ordinal value: %d; Name value: %s%n", suit.ordinal(), suit.name());
        }






    }
}
