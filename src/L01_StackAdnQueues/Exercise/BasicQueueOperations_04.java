package L01_StackAdnQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbersToPush = scanner.nextInt();
        int countNumbersToPop = scanner.nextInt();
        int numberToCheck = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= countNumbersToPush ; i++) {
            queue.offer(scanner.nextInt());
        }

        for (int i = 1; i <= countNumbersToPop ; i++) {

            queue.poll();
        }

        if(queue.contains(numberToCheck)){
            System.out.println(true);
        } else if (queue.isEmpty()) {
            System.out.println(0);
        }else {
            System.out.println(Collections.min(queue));
        }


    }
}
