package JavaAdvanced.L02_Multidimensional_Arrays.Exercise;

import java.util.Scanner;

public class FillTheMatrix_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();// 3, A
        int dimensions = Integer.parseInt(input.split(", ")[0]);
        String pattern = input.split(", ")[1];

        //създавеме матрица с размери спрямо прочетените от входните данни
        int[][] matrix = new int[dimensions][dimensions];

        switch (pattern){
            case "A" -> fillTheMatrixPatternA(matrix);
            case "B" -> fillTheMatrixPatternB(matrix);
        }

        printMatrix(matrix);


    }

    private static void printMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix.length; col++) {

                System.out.print(matrix[row][col] + " ");
                
            }

            System.out.println();

        }
    }

    private static void fillTheMatrixPatternB(int[][] matrix) {

        int startNumber = 1;

        for (int col = 0; col < matrix.length; col++) {

            if(col % 2 == 0){
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = startNumber;
                    startNumber++;

                }
            } else if (col % 2 == 1) {
                for (int row = matrix.length - 1 ; row >= 0 ; row--) {
                    matrix[row][col] = startNumber;
                    startNumber++;

                }
            }


        }



    }

    private static void fillTheMatrixPatternA(int[][] matrix) {

        int startNumber = 1;

        for (int col = 0; col < matrix.length ; col++) {

            for (int row = 0; row < matrix.length; row++) {

                matrix[row][col] = startNumber;
                startNumber++;

            }

        }
    }
}
