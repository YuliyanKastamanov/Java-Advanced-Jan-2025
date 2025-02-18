package JavaAdvanced.L05_Functional_Programming.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _02_SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // 4, 2, 1, 3, 5, 7, 1, 4, 2, 12

        Function<String, Integer> countNumbers = numbersString -> {

            int count = (int) Arrays.stream(numbersString.split(", "))
                                    .mapToInt(Integer::parseInt)
                                    .count();

            return count;
        };

        Function<String, Integer> sumNumbers = numbersString -> {

            int sum = Arrays.stream(numbersString.split(", "))
                            .mapToInt(Integer::parseInt)
                            .sum();

            return sum;
        };

        System.out.printf("Count = %d\n", countNumbers.apply(input));
        System.out.printf("Sum = %d", sumNumbers.apply(input));

    }
}
