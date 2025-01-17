package L03_Sets_and_Dictionaries_Advanced.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();

        Map<Character, Integer> resultOfCharacters = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {

            char currentSymbol = input.charAt(i);

            //проверяваме дали currentSymbol не се съдържа в нашия мап
            if(!resultOfCharacters.containsKey(currentSymbol)){
                //ако не се съдържа го добавяме cont 1
                resultOfCharacters.put(currentSymbol, 1);
            }else {
                int currentCount = resultOfCharacters.get(currentSymbol);
                currentCount++;
                resultOfCharacters.put(currentSymbol, currentCount);
            }
            
        }

        resultOfCharacters.entrySet().forEach(element -> System.out.printf("%c: %d time/s%n", element.getKey(), element.getValue()));


    }
}
