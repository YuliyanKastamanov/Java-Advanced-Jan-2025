package OOP.L01_WorkingWithAbstraction.Exercise.cardsWithPower_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cardRank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        CardRankPower[] cardsRankPower = CardRankPower.values();

        System.out.println(CardRankPower.ACE);

        int rankPower = CardRankPower.valueOf(cardRank).getPower();
        int suitPower = SuitPower.valueOf(cardSuit).getPower();

        int cardPower = rankPower + suitPower;
        System.out.printf("Card name: %s of %s; Card power: %d", cardRank, cardSuit, cardPower);








    }
}
