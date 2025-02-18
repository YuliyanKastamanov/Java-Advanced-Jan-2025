package JavaAdvanced.L01_StackAdnQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_DecimalToBinaryConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (decimal == 0) {
            System.out.println(decimal);
        } else {
            while (decimal != 0) {
                stack.push(decimal % 2);
                decimal /= 2;
            }
        }

        stack.forEach(System.out::print);

//        for (Integer num : stack) {
//            System.out.print(num);
//        }
    }
}
