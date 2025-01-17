package L02_Multidimensional_Arrays.Exercise;

import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);

        String [][] matrix = new String[rows][cols];
        String splitPattern = "\\s+";

        readMatrix(matrix, rows, cols, scanner, splitPattern );

        String command = scanner.nextLine();

        while (!command.equals("END")){
            String[] tokens = command.split("\\s+");
            String currentCommand = tokens[0];
            if(currentCommand.equals("swap") && tokens.length == 5){

                int currentRows1 = Integer.parseInt(tokens[1]);
                int currentCols1 = Integer.parseInt(tokens[2]);
                int currentRows2 = Integer.parseInt(tokens[3]);
                int currentCols2 = Integer.parseInt(tokens[4]);
                if (isInBounds(currentRows1, currentRows2,currentCols1, currentCols2, matrix)){

                    String stringToSwap1 = matrix[currentRows1][currentCols1];
                    String stringToSwap2 = matrix[currentRows2][currentCols2];

                    matrix[currentRows1][currentCols1] = stringToSwap2;
                    matrix[currentRows2][currentCols2] = stringToSwap1;

                    printMatrix(matrix);



                }else {
                    System.out.println("Invalid input!");
                }


            } else {
                System.out.println("Invalid input!");
            }

            command = scanner.nextLine();
        }
        System.out.println();


    }

    private static String[][] readMatrix(String [][] matrix, int rows, int cols,  Scanner scanner, String splitPattern) {

        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split(splitPattern);

            for (int col = 0; col < input.length; col++) {
                String currentString = input[col];



                matrix[row][col] = currentString;
            }

        }
        return matrix;
    }

    public static boolean isInBounds (int currentRows1, int currentRows2, int currentCols1, int currentCols2, String[][] matrix){
        return currentRows1 >=0 && currentRows1 < matrix.length && currentCols1 >= 0 && currentCols1 < matrix[currentRows1].length &&
                currentRows2 >=0 && currentRows2 < matrix.length && currentCols2 >= 0 && currentCols2 < matrix[currentRows2].length;
    }

    public static void printMatrix (String [][] matrix ){

        for (int row = 0; row < matrix.length; row++) {
            for (int cow = 0; cow < matrix[row].length; cow++) {
                System.out.print(matrix[row][cow] + " ");

            }
            System.out.println();

        }

    }

}
