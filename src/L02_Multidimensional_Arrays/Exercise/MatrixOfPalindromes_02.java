package L02_Multidimensional_Arrays.Exercise;

import java.util.Scanner;

public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String [][] matrix = new String[rows][cols];

        fillMatrix(matrix, rows, cols);

        printMatrix(matrix);

    }

    private static void fillMatrix(String[][] matrix, int rows, int cols) {

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char char1And3 = (char) (97 + row);
                char char2 = (char) (97 + row + col);

                String stringToFill = new StringBuilder().append(char1And3).append(char2).append(char1And3).toString();

                matrix[row][col] = stringToFill;



            }
        }
    }

    private static void printMatrix(String[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                System.out.print(matrix[row][col] + " ");

            }

            System.out.println();

        }
    }
}
