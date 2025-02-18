package JavaAdvanced.L05_Functional_Programming.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class _04_AddVAT {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // UnaryOperator<Double>
        // Represents an operation on a single operand that produces a result of the same type as its operand.
        // This is a specialization of Function for the case where the operand and result are of the same type.
        UnaryOperator<Double> addVatUnaryFunc = price -> price * 1.2;

        Function<Double, Double> addVatFunc = price -> price * 1.2;
        Consumer<Double> printPrice = price -> System.out.printf("%.2f\n", price);

        String input = scanner.nextLine();

        System.out.println("Prices with VAT:");

        Arrays.stream(input.split(", "))
              .map(Double::parseDouble)
              .map(addVatUnaryFunc)
              .forEach(printPrice);
    }
}
