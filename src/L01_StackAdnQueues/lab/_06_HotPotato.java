package _01_Stack_and_Queues.lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _06_HotPotato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
              .forEach(queue::offer);

        int n = Integer.parseInt(scanner.nextLine());
        int rotation = 0;

        while (queue.size() > 1) {
            //1. Get first kid from the queue - poll()
            String firstKid = queue.poll();
            //2. Increase rotation
            rotation++;
            //3. Check whether this is the Nth rotation
            if (rotation % n == 0) {
                // 3.1 If is the Nth rotation DO NOT add kid back to the queue
                System.out.printf("Removed %s\n", firstKid);
            } else {
                // 3.2 Else - add kid in the end of the queue
                queue.offer(firstKid);
            }
        }

        System.out.printf("Last is %s", queue.peek());

    }
}
