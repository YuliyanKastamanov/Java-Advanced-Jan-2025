package L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(number -> Integer.parseInt(number))
                .collect(Collectors.toList());

        // 1 2 1 5 8 10 1 23 1
        //numbers.lastIndexOf(10); -> връща последния индекс, на който срещаме елемента
        //numbers.indexOf(10); -> връща първия индекс, на който срещаме елемента

        Function<List<Integer>, Integer> indexOfSmallestNumber = index -> index.lastIndexOf(Collections.min(numbers));
        System.out.println(indexOfSmallestNumber.apply(numbers));


        //int number = mapToInt("10");



    }

    private static int customMapToInt(String number) {

        return Integer.parseInt(number);
    }


}
