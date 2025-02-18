package JavaAdvanced.L02_Multidimensional_Arrays.lab;

import java.util.Scanner;

public class _07_FindTheRealQueen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];
        fillMatrix(matrix, scanner);


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (matrix[row][col] == 'q') {
                    // ако пред царицата няма изпречена друга царица
                    // ( по диагоналите и по вертика  и хоризонтала ) то тогава
                    //прекъсваме търсенето и принтирам координатите на царицата

                    boolean upPrimaryDiagonal = isUpPrimaryDiagonal(matrix, row - 1, col - 1);
                    boolean downPrimaryDiagonal = isDownPrimaryDiagonal(matrix, row + 1, col + 1);
                    boolean upSecondaryDiagonal = isUpSecondaryDiagonal(matrix, row - 1, col + 1);
                    boolean downSecondaryDiagonal = isDownSecondaryDiagonal(matrix, row + 1, col - 1);
                    boolean rowClear = isRowClear(matrix, row);
                    boolean colClear = isColClear(matrix, col);

                    boolean isFound = upPrimaryDiagonal && downPrimaryDiagonal &&
                                      upSecondaryDiagonal && downSecondaryDiagonal &&
                                      rowClear && colClear;

                    if (isFound) {
                        System.out.println(row + " " + col);
                        return;
                    }
                }
            }
        }
    }

    private static boolean isColClear(char[][] matrix, int col) {
        int queenCount = 0;
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] == 'q') {
                queenCount++;
            }
        }
        return queenCount == 1;
    }

    private static boolean isRowClear(char[][] matrix, int row) {
        int queenCount = 0;
        for (int col = 0; col < matrix.length; col++) {
            if (matrix[row][col] == 'q') {
                queenCount++;
            }
        }
        return queenCount == 1;
    }

    private static boolean isDownSecondaryDiagonal(char[][] matrix, int row, int col) {

        while (row <= 7 && col >= 0) {
            if (matrix[row][col] == 'q') {
                return false;
            }

            row++;
            col--;
        }

        return true;
    }

    private static boolean isUpSecondaryDiagonal(char[][] matrix, int row, int col) {

        while (row >= 0 && col <= 7) {
            if (matrix[row][col] == 'q') {
                return false;
            }
            row--;
            col++;
        }
        return true;
    }

    private static boolean isDownPrimaryDiagonal(char[][] matrix, int row, int col) {

        while (row <= 7 && col <= 7) {
            if (matrix[row][col] == 'q') {
                return false;
            }
            row++;
            col++;
        }
        return true;
    }

    private static boolean isUpPrimaryDiagonal(char[][] matrix, int row, int col) {

        while (row >= 0 && col >= 0) {
            if (matrix[row][col] == 'q') {
                return false;
            }
            row--;
            col--;
        }

        return true;
    }

    private static void fillMatrix(char[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().replace(" ", "").toCharArray();
        }
    }
}
