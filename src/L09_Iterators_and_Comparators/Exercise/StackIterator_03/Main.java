package L09_Iterators_and_Comparators.Exercise.StackIterator_03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        CustomStack stack = new CustomStack();

        while (!command.equals("END")){

            //Pop
            //Push 1, 2, 3, 4, 5

            if (command.equals("Pop")){
                stack.pop();
            }else {
                int [] numbers = Arrays.stream(command.replace("Push ", "")//1, 2, 3, 4, 5
                        .split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                for (int number : numbers){
                    stack.push(number);
                }

            }

            command = scanner.nextLine();
        }

        for (Integer number : stack){
            System.out.println(number);
        }

        for (Integer number : stack){
            System.out.println(number);
        }


    }
}
