package L05_Functional_Programming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _01_SortEvenNumbersFunctional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> evenNumbers = Arrays.stream(scanner.nextLine().split(", "))
                                          .map(Integer::parseInt)
//                                          .map(x -> Integer.parseInt(x))
                                          .filter(number -> number % 2 == 0)
                                          .toList();

//        evenNumbers.removeIf(x -> x % 2 != 0);

        System.out.println(evenNumbers.toString()
                                      .replaceAll("\\[", "")
                                      .replaceAll("\\]", ""));

        List<Integer> sortedEvenNumbers = evenNumbers.stream()
                                                     .sorted((a, b) -> a.compareTo(b))
                                                     .toList();

        System.out.println(sortedEvenNumbers.toString()
                                            .replaceAll("\\[", "")
                                            .replaceAll("\\]", ""));


    }
}
