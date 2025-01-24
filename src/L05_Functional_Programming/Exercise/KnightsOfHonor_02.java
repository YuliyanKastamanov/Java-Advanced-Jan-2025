package L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .toList();

        Consumer<String> consumerPrint = e -> System.out.println("Sir " + e);

        names.forEach(consumerPrint);



    }
}
