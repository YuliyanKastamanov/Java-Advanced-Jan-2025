package JavaAdvanced.L01_StackAdnQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _04_MatchingBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        ArrayDeque<Integer> indexesStack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);

            // (2 + 3) - (2 + 3)
            if (symbol == '(') {
                indexesStack.push(i);
            } else if (symbol == ')') {
                int startIndex = indexesStack.pop();
                String subExpression = expression.substring(startIndex, i + 1);
                System.out.println(subExpression);
            }
        }
    }
}
