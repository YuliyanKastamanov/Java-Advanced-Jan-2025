package OOP.L01_WorkingWithAbstraction.lab.P1RhombusOfStars;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n = 3
        int n = Integer.parseInt(scanner.nextLine());
        //  *
        // * *
        //* * *
        // * *
        //  *
        printRhombusOfStars(n);
    }

    private static void printRhombusOfStars(int n) {

        if (n == 1) {
            System.out.println("*");
            return;
        }

        // Принтираме горната част на ромба
        for (int row = 1; row <= n; row++) {
            printRow(row, n);
        }
        // Принитираме долната част на ромба
        for (int row = n - 1; row >= 1; row--) {
            printRow(row, n);
        }
    }

    private static void printRow(int row, int n) {
        int whiteSpace = n - row;
        for (int i = 0; i < whiteSpace; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < row; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
