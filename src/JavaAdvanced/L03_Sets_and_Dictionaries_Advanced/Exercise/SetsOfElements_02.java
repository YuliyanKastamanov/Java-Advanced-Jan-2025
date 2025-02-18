package JavaAdvanced.L03_Sets_and_Dictionaries_Advanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] data = scanner.nextLine().split("\\s+");

        int firstNum = Integer.parseInt(data[0]);
        int secondNum = Integer.parseInt(data[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 1; i <= firstNum ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            firstSet.add(currentNumber);

        }

        for (int i = 1; i <= secondNum ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            secondSet.add(currentNumber);
        }

        for (int number : firstSet){
            if(secondSet.contains(number)){
                System.out.print(number + " ");
            }
        }





        
    }
}
