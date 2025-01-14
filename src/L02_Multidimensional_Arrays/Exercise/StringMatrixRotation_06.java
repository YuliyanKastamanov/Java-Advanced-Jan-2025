package L02_Multidimensional_Arrays.Exercise;

import java.util.*;

public class StringMatrixRotation_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine()
                .replace("Rotate(", "")
                .replace(")", ""));

        String matrixLine = scanner.nextLine();

        List<String> words = new ArrayList<>();

        while (!matrixLine.equals("END")){
            words.add(matrixLine);
            matrixLine = scanner.nextLine();
        }

        int rows = words.size();
        int cols = Collections.max(words, Comparator.comparing(String::length)).length();

        char [][] matrix = new char[rows][cols];

        fillMatrix(matrix, words);

        int countRotation = degrees / 90;

        for (int i = 1; i <= countRotation ; i++) {

            matrix = rotate90Degrees(matrix);
        }

        printMatrix(matrix);




    }

    private static void printMatrix(char[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                System.out.print(matrix[row][col]);

            }

            System.out.println();

        }
    }

    private static char[][] rotate90Degrees(char[][] matrix) {

        int rows = matrix[0].length;
        int cols = matrix.length;

        char[][] newMatrix = new char[rows][cols];

        for (int col = 0; col < matrix[0].length; col++) {

            int newColumnCounter = 0;

            for (int row = matrix.length - 1; row >= 0 ; row--) {

                char currentSymbol = matrix[row][col];

                newMatrix[col][newColumnCounter] = currentSymbol;
                newColumnCounter++;

            }

        }

        return newMatrix;




    }

    private  static void fillMatrix(char[][] matrix, List<String> words){

        for (int row = 0; row < matrix.length; row++) {

            String word = words.get(row);

            for (int col = 0; col < matrix[row].length; col++) {

                if(col <= word.length() - 1){
                    matrix[row][col] = word.charAt(col);
                }else {
                    matrix[row][col] = ' ';
                }

            }



        }
    }
}
