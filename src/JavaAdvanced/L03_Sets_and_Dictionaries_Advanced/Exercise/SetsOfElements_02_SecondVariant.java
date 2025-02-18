package JavaAdvanced.L03_Sets_and_Dictionaries_Advanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02_SecondVariant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] data = scanner.nextLine().split("\\s+");

        int firstNum = Integer.parseInt(data[0]);
        int secondNum = Integer.parseInt(data[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 1; i <= firstNum + secondNum ; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());

            if(i <= firstNum){
                firstSet.add(currentNum);
            }else {
                secondSet.add(currentNum);
            }

        }

        firstSet.retainAll(secondSet);

        firstSet.forEach(element -> System.out.print(element + " "));








        
    }
}
