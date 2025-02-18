package JavaAdvanced.L02_Multidimensional_Arrays.lab;

import java.util.Scanner;

public class _03_IntersectionOfTwoMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrixA = new char[rows][cols];
        char[][] matrixB = new char[rows][cols];

        fillMatrix(matrixA, scanner);
        fillMatrix(matrixB, scanner);

        printMatrix(rows, cols, matrixA, matrixB);
    }

    private static void printMatrix(int rows, int cols, char[][] matrixA, char[][] matrixB) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if (matrixA[row][col] == matrixB[row][col]) {
                    System.out.print(matrixA[row][col] + " ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }

    private static void fillMatrix(char[][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            String currentLine = scanner.nextLine().replace(" ", "");
            char[] currentRow = currentLine.toCharArray();

            matrix[row] = currentRow;
        }
    }
}
