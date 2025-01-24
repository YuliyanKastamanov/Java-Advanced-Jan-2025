package L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomMinFunction_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(number -> Integer.parseInt(number))
                .collect(Collectors.toList());

        System.out.println(Collections.min(numbers));




    }
}
