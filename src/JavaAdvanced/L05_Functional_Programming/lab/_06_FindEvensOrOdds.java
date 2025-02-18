package JavaAdvanced.L05_Functional_Programming.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class _06_FindEvensOrOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bounds = Arrays.stream(scanner.nextLine().split("\\s+"))
                             .mapToInt(Integer::parseInt).toArray();

        String condition = scanner.nextLine();

        if ("odd".equals(condition)) {
            // invoke print numbers with odd condition
            printNumbers(bounds, number -> number % 2 != 0);
        } else {
            // invoke print numbers with even condition
            printNumbers(bounds, number -> number % 2 == 0);
        }

    }

    private static void printNumbers(int[] bounds, Predicate<Integer> condition) {
        int lower = bounds[0];
        int upper = bounds[1];

        for (int number = lower; number <= upper; number++) {

            if (condition.test(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
