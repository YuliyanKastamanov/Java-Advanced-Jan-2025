package JavaAdvanced.L02_Multidimensional_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        
        int counter = 1;

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                matrix[row][col] = counter;
                counter++;
                
            }
        }

        for (int col = 0; col < matrix.length; col++) {

            for (int row = 0; row < matrix[col].length; row++) {
                System.out.print(matrix[row][col] + " ");

            }

            System.out.println();

        }

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] example2 = new int[rows][];

        fillMatrixExample(rows, matrix, scanner);


    }

    public static void fillMatrixExample(int rows, int[][] matrix, Scanner scanner) {
        for (int row = 0; row < rows; row++) {

            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }
    }

    private static boolean isInRange(int row, int cow, int [][] matrix){

        // matrix.length -> броя на редовете
        return row >= 0 && row < matrix.length && cow >= 0 && cow < matrix[row].length;
    }
}