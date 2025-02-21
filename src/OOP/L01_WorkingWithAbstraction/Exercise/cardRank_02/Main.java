package OOP.L01_WorkingWithAbstraction.Exercise.cardRank_02;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CardRanks[] cardRanks = CardRanks.values();




        System.out.println("Card Ranks:");

        Arrays.stream(cardRanks).forEach(cardRank -> System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name()));






    }
}
