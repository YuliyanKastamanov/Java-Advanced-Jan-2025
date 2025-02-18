package JavaAdvanced.L02_Multidimensional_Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class _05_MaximumSumOfSubmatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        fillMatrix(matrix, scanner);

        int maxSumSubMatrixElements = 0;
        int startRow = 0;
        int startCol = 0;

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {

                int sumOfSubMatrix = matrix[row][col] + matrix[row][col + 1] +
                                     matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (sumOfSubMatrix > maxSumSubMatrixElements) {
                    maxSumSubMatrixElements = sumOfSubMatrix;
                    startRow = row;
                    startCol = col;
                }
            }
        }

        printSubMatrix(matrix, startRow, startCol);

        System.out.println(maxSumSubMatrixElements);

    }

    private static void printSubMatrix(int[][] matrix, int startRow, int startCol) {
        for (int row = startRow; row < startRow + 2; row++) {
            for (int col = startCol; col < startCol + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(", "))
                                     .mapToInt(Integer::parseInt)
                                     .toArray();

            matrix[row] = currentRow;
        }
    }
}
