package JavaAdvanced.L08_Generics.lab.array_creator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nones = ArrayCreator.create(10, "none");
        Integer[] numbers = ArrayCreator.create(Integer.class, 10, 7);

        System.out.println();
    }
}
