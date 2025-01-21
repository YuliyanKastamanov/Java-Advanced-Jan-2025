package L05_Functional_Programming.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _02_SumNumbersBiFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int sum = Integer.parseInt(input[0]);

        if (input.length >= 2) {

            BiFunction<Integer, String, Integer> parser = (x, y) -> x + Integer.parseInt(y);

            for (int i = 1; i < input.length; i++) {
                sum = parser.apply(sum, input[i]);
            }

        }

        System.out.printf("Count = %d\n", input.length);
        System.out.printf("Sum = %d", sum);

    }
}
