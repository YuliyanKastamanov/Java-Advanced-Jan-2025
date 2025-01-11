package _01_Stack_and_Queues.lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class _02_SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        // 2 - 2 + 5
        String[] tokens = scanner.nextLine().split("\\s+");
        Collections.addAll(stack, tokens);

        while (stack.size() > 1) {
            // 1. Get 3 elements - first number, operator, second number
            int firstNumber = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondNumber = Integer.parseInt(stack.pop());

            // 2. Calculate
            int result = 0;
            if (operator.equals("+")) {
                result = firstNumber + secondNumber;
            } else {
                result = firstNumber - secondNumber;
            }

            // 3. Push result back to the stack
            stack.push(String.valueOf(result));
        }

        System.out.println(stack.peek());
    }
}
