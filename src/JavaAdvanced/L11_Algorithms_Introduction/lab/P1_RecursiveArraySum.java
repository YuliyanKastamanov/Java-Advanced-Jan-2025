package JavaAdvanced.L11_Algorithms_Introduction.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P1_RecursiveArraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                              .mapToInt(Integer::parseInt)
                              .toArray();

        System.out.println(sumArray(numbers, 0));
    }

    private static int sumArray(int[] numbers, int index) {

        if (index >= numbers.length) {
            return 0;
        }
        return numbers[index] + sumArray(numbers, index + 1);
    }
}
