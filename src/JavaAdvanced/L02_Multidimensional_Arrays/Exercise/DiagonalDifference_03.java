package JavaAdvanced.L02_Multidimensional_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsAndCols = Integer.parseInt(scanner.nextLine());

        String splitPattern = "\\s+";

        int [][] matrix = readMatrix(rowsAndCols, scanner, splitPattern);

        int rowIndex = 0;
        int colIndex = 0;
        int firstDiagonalSum = 0;

        for (int row = 0; row < rowsAndCols; row++) {

            int currentNumber = matrix[rowIndex][colIndex];
            firstDiagonalSum += currentNumber;
            colIndex++;
            rowIndex++;

        }

        rowIndex = 0;
        colIndex = rowsAndCols - 1;
        int secondDiagonalSum = 0;

        for (int row = 0; row < rowsAndCols; row++) {

            int currentNumber = matrix[rowIndex][colIndex];
            secondDiagonalSum += currentNumber;
            rowIndex++;
            colIndex--;

        }
        System.out.println(Math.abs(firstDiagonalSum - secondDiagonalSum));

    }

    private static int[][] readMatrix(int rowsAndCols, Scanner scanner, String splitPattern) {

        int [][] matrix = new int[rowsAndCols][];

        for (int row = 0; row < rowsAndCols; row++) {

            int [] currentRow = Arrays.stream(scanner.nextLine().split(splitPattern)).mapToInt(Integer::parseInt).toArray();

            matrix[row] = currentRow;

        }
        return matrix;
    }
}
