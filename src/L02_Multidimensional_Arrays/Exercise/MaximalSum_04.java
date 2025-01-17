package L02_Multidimensional_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);

        int [][] matrix = new int[rows][cols];
        String splitPattern = "\\s+";

        readMatrix(matrix, rows, cols, scanner, splitPattern );
        int[][] maxMatrix = new int[3][3];
        int maxSum = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {

                int currentNumber = matrix[row][col];
                int inRight = matrix[row][col + 1];
                int inSecondRight = matrix[row][col + 2];

                int inBottom = matrix[row + 1][col];
                int inBottomRight = matrix[row + 1][col + 1];
                int inBottomSecondRight = matrix[row + 1][col + 2];

                int inSecondBottom = matrix[row + 2][col];
                int inRightSecondBottom = matrix[row + 2][col + 1];
                int inSecondBottomSecondRight = matrix[row + 2][col + 2];

                int currentSum = currentNumber + inRight + inBottom + inBottomRight + inSecondRight +
                        inSecondBottom + inBottomSecondRight + inRightSecondBottom + inSecondBottomSecondRight;

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                    maxMatrix = new int[][]{
                            {currentNumber, inRight, inSecondRight},
                            {inBottom, inBottomRight, inBottomSecondRight},
                            {inSecondBottom, inRightSecondBottom, inSecondBottomSecondRight}
                    };


                }
            }


        }
        System.out.println("Sum = " + maxSum);
        printMaxMatrix(maxMatrix);



    }



    private static int[][] readMatrix(int [][] matrix, int rows, int cols,  Scanner scanner, String splitPattern) {

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine()
                            .split(splitPattern))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }
        return matrix;

    }

    public static void printMaxMatrix (int[][] maxMatrix ){
        for (int row = 0; row < maxMatrix.length; row++) {
            for (int cow = 0; cow < maxMatrix[row].length; cow++) {
                System.out.print(maxMatrix[row][cow] + " ");

            }
            System.out.println();

        }

    }

}