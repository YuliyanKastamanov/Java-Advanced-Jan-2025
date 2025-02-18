package JavaAdvanced.L01_StackAdnQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _01_BrowserHistory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> historyStack = new ArrayDeque<>();

        String input = scanner.nextLine();
        while (!"Home".equals(input)) {

            if ("back".equals(input)) {

                if (historyStack.size() > 1) {
                    // Remove current url
                    historyStack.pop();
                    // Print the current URL
                    System.out.println(historyStack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            }else {
                // Push URL to the stack
                historyStack.push(input);
                System.out.println(historyStack.peek());
            }

            input = scanner.nextLine();
        }
    }
}
