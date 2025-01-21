package L05_Functional_Programming.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _01_SortEvenNumbersImperative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                                      .map(x -> Integer.parseInt(x))
                                      .toList();

        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        for (Integer evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }

        Collections.sort(evenNumbers);
        System.out.println();

        for (Integer evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }
    }
}
