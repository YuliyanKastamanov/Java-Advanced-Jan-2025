package JavaAdvanced.L02_Multidimensional_Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class _04_SumMatrixElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        fillMatrix(matrix, scanner);
        int sumMatrixElements = sumMatrixElements(matrix);

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sumMatrixElements);
    }

    private static int sumMatrixElements(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }

        return sum;
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
