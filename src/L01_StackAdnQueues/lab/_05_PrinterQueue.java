package _01_Stack_and_Queues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05_PrinterQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!"print".equals(input)) {

            if ("cancel".equals(input)) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s\n", queue.poll());
                }
            } else {
                queue.offer(input);
            }
            input = scanner.nextLine();
        }

        queue.forEach(System.out::println);
    }
}
