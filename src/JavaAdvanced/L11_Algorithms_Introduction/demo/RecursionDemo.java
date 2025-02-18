package JavaAdvanced.L11_Algorithms_Introduction.demo;

import java.util.Scanner;

public class RecursionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        recursion(n);

    }

    private static void recursion(int n) {
        System.out.println("Recursion invoked. n -> " + n);

        if (n == 0) {
            return;
        }
        recursion(n - 1);
    }
}
