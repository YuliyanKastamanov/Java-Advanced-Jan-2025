package JavaAdvanced.L02_Multidimensional_Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class _06_PrintDiagonalsOfSquareMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        fillMatrix(matrix, scanner);

        printPrimaryDiagonal(matrix);
        System.out.println();
        printSecondaryDiagonal(matrix);

    }

    private static void printSecondaryDiagonal(int[][] matrix) {
        int col = 0;
        // row - 1 , col + 1
        for (int row = matrix.length - 1; row >= 0; row--) {
            System.out.print(matrix[row][col] + " ");
            col++;
        }
    }

    private static void printPrimaryDiagonal(int[][] matrix) {

        // row + 1, col +1
        for (int row = 0; row < matrix.length; row++) {
            System.out.print(matrix[row][row] + " ");
        }
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                                     .mapToInt(Integer::parseInt)
                                     .toArray();
            matrix[row] = currentRow;
        }
    }
}
