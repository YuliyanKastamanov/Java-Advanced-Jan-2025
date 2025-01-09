package L01_StackAdnQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbersToPush = scanner.nextInt();
        int countNumbersToPop = scanner.nextInt();
        int numberToCheck = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= countNumbersToPush ; i++) {
            stack.push(scanner.nextInt());
        }

        for (int i = 1; i <= countNumbersToPop ; i++) {

            stack.pop();
        }

        if(stack.contains(numberToCheck)){
            System.out.println(true);
        } else if (stack.isEmpty()) {
            System.out.println(0);
        }else {
            System.out.println(Collections.min(stack));
        }


    }
}
