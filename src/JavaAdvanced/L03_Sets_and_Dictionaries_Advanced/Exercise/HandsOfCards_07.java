package JavaAdvanced.L03_Sets_and_Dictionaries_Advanced.Exercise;

import java.util.*;

public class HandsOfCards_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Set<String>> players = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("JOKER")){

            //input -> "{personName}: {PT, PT, PT,… PT}"
            //Peter: 2C, 4H, 9H, AS, QS

            String playerName = input.split(": ")[0];//"personName -> "Peter"
            String cards = input.split(": ")[1];//"2C, 4H, 9H, AS, QS"
            String[] cardsArr = cards.split(", ");//["2C", "4H", "9H", "AS", "QS"]

            Set<String> cardsSet = new HashSet<>();//картите на играча
            cardsSet.addAll(Arrays.asList(cardsArr));

            if(!players.containsKey(playerName)){
                //ако не съществува такъв играч
                players.put(playerName, cardsSet);
            }else {
                //ако играча съществува, вземаме картите, които има до момента и добавяме всички нови
                Set<String> currentCards = players.get(playerName);
                currentCards.addAll(cardsSet);
                players.put(playerName, currentCards);
            }

            input = scanner.nextLine();
        }

        //name: points
        players.entrySet().forEach(entry -> {
            String name = entry.getKey();
            Set<String> cards = entry.getValue();

            int points = getCardsPoint(cards);
            System.out.printf("%s: %d%n", name, points);

        });



    }

    private static int getCardsPoint(Set<String> cards) {

        Map<Character, Integer> symbolsValue = getSymbolValue();

        int sumPoints = 0;
        for (String card: cards){
            //2C, 2-> power, C->type

            int currentPoints = 0;

            if (card.startsWith("10")){
                char type = card.charAt(2);
                currentPoints = 10 * symbolsValue.get(type);
            }else {
                char power = card.charAt(0);
                char type = card.charAt(1);
                currentPoints = symbolsValue.get(power) * symbolsValue.get(type);
            }

            sumPoints += currentPoints;


        }

        return sumPoints;

    }

    private static Map<Character, Integer> getSymbolValue() {

        Map<Character, Integer> characterValues = new HashMap<>();

        characterValues.put('2', 2);
        characterValues.put('3', 3);
        characterValues.put('4', 4);
        characterValues.put('5', 5);
        characterValues.put('6', 6);
        characterValues.put('7', 7);
        characterValues.put('8', 8);
        characterValues.put('9', 9);
        characterValues.put('J', 11);
        characterValues.put('Q', 12);
        characterValues.put('K', 13);
        characterValues.put('A', 14);
        characterValues.put('S', 4);
        characterValues.put('H', 3);
        characterValues.put('D', 2);
        characterValues.put('C', 1);

        return characterValues;
    }
}
