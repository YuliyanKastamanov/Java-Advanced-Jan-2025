package L05_Functional_Programming.lab;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Demo {

    public static void main(String[] args) {

        UnaryOperator<List<Integer>> sortListUnary = list -> list.stream().sorted().toList();
        Function<List<Integer>, List<Integer>> sortList = list -> list.stream().sorted().toList();

        List<Integer> unsorted = List.of(5, 6, 1, 3, 2, 4, 8, 7, 10, 9);
        System.out.println(unsorted);

        List<Integer> sortedList = sortListUnary.apply(unsorted);

        System.out.println(sortedList);
    }
}
