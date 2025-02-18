package JavaAdvanced.L02_Multidimensional_Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class _02_PositionsOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Създаваме матрицата
        String[] dimension = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimension[0]);
        int cols = Integer.parseInt(dimension[1]);

        int[][] matrix = new int[rows][cols];

        //Пълним матрицата
        fillMatrix(scanner, matrix);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                //Търсим даденото число в матрицата
                if (matrix[row][col] == n) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
    }

    private static void fillMatrix(Scanner scanner, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                                     .mapToInt(Integer::parseInt)
                                     .toArray();

            matrix[row] = currentRow;
            // for (int col = 0; col < matrix[row].length; col++) {
            //     matrix[row][col] = currentRow[col];
            // }
        }
    }
}
