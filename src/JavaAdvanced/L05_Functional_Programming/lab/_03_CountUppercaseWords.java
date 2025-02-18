package JavaAdvanced.L05_Functional_Programming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class _03_CountUppercaseWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> startWithUppercase =
        someText -> Character.isUpperCase(someText.charAt(0));

        //The following example shows how to use Predicate
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+"))
                                   .filter(startWithUppercase)
                                   //.filter(someText -> Character.isUpperCase(someText.charAt(0)))
                                   .toList();

        System.out.println(words.size());
        words.forEach(System.out::println);
    }
}
