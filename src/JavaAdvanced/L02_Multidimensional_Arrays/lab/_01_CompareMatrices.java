package JavaAdvanced.L02_Multidimensional_Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class _01_CompareMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int rowA = Integer.parseInt(tokens[0]);
        int colA = Integer.parseInt(tokens[1]);
        int[][] matrixA = new int[rowA][colA];

        fillMatrix(matrixA, scanner);

        tokens = scanner.nextLine().split("\\s+");
        int rowB = Integer.parseInt(tokens[0]);
        int colB = Integer.parseInt(tokens[1]);

        int[][] matrixB = new int[rowB][colB];

        fillMatrixVariant2(matrixB, scanner);

        if (isEqual(matrixA, matrixB)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

    private static boolean isEqual(int[][] matrixA, int[][] matrixB) {

        // Сравняваме матриците по броя на редовете
        if (matrixA.length != matrixB.length) {
            return false;
        }
        // Сравняваме матриците по броя на колоните
        if (matrixA[0].length != matrixB[0].length) {
            return false;
        }

        //Сравняваме матриците по елементите им
        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                if (matrixA[row][col] != matrixB[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String[] currentRow = scanner.nextLine().split("\\s+");

            for (int col = 0; col < currentRow.length; col++) {
                matrix[row][col] = Integer.parseInt(currentRow[col]);
            }
        }
    }

    private static void fillMatrixVariant2(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            //Текущият ред прочетен от конзолата
            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+"))
                                     .mapToInt(Integer::parseInt)
                                     .toArray();

            matrix[row] = currentRow;
        }
    }
}
