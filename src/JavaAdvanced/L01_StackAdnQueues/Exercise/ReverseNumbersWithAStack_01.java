package JavaAdvanced.L01_StackAdnQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithAStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String[] input = scanner.nextLine().split(" ");
        String command = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();

        Arrays.stream(command.split("\\s+")).forEach(stack::push);

       /* for (String number : input){
            stack.push(number);
        }*/

        // "5", "4", "3", "2", "1"

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }


    }
}
