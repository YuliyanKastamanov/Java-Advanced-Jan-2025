package JavaAdvanced.L05_Functional_Programming.lab;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        // Predicate<InputParam> accepts one inputParam -> returns always boolean -> use with test()
        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        System.out.println(isEvenPredicate.test(15));

        // BiPredicate<InputParam1, InputParam2> - accept 2 input param, returns always boolean
        // use with test()
        BiPredicate<Integer, Integer> areEqualsBiPredicate = (n1, n2) -> n1 == n2;
        System.out.println(areEqualsBiPredicate.test(10, 10));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean areEquals(int n1, int n2) {
        return n1 == n2;
    }
}
