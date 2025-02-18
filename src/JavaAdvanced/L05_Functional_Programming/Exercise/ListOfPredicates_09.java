package JavaAdvanced.L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ListOfPredicates_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //отпечатваме числата от 1 до n, които се деялт едновременно на всички числа в списъка
        //число, списъка
        // true (числото се дели на всички числа в списъка);
        // false (числото не се дели на всички числа в списъка)
        BiFunction<Integer, List<Integer>, Boolean> isDivisible = ((number, list) -> {
            for (int numberInList : list) {
                if (number % numberInList != 0) {
                    return false;
                }
            }
            return true;
        });

        //всички числа от 1 до n -> проверка дали се дели на всички числа в списъка -> print числото
        for (int number = 1; number <= n; number++) {
            if (isDivisible.apply(number, numbers)) {
                System.out.print(number + " ");
            }
        }
    }
}
