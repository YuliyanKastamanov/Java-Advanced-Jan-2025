package L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(number -> Integer.parseInt(number))
                .collect(Collectors.toList());


        //"add" -> adds 1; "multiply" -> multiplies by 2; "subtract" -> subtracts 1; "print"

        String command = scanner.nextLine();

        //add 1
        Function<Integer, Integer> functionAdd = number -> number + 1;

        //multiply by 2
        Function<Integer, Integer> functionMultiply = number -> number * 2;

        //subtracts 1
        Function<Integer, Integer> functionSubtract = number -> number - 1;

        //print
        Consumer<Integer> consumerPrint = number -> System.out.printf("%d ", number);

        while (!command.equals("end")){

            switch (command){
                case "add" -> numbers = numbers.stream().map(functionAdd).collect(Collectors.toList());
                case "multiply" -> numbers =  numbers.stream().map(functionMultiply).collect(Collectors.toList());
                case "subtract" -> numbers = numbers.stream().map(functionSubtract).collect(Collectors.toList());
                case "print" -> {
                    numbers.forEach(consumerPrint);
                    System.out.println();
                }
            }

            command = scanner.nextLine();
        }






    }
}
