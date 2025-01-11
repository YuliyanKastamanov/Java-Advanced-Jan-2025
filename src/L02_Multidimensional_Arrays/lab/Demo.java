package L02_Multidimensional_Arrays.lab;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[][] matrix = new int[5][5];

        // matrix.length - Броя на редовете
        // matrix[ROW].length - Броя на колоните на текущия ред

        int count = 1;

        // Външният for loop итерира по редовете
        for (int row = 0; row < matrix.length; row++) {
            // Вътрешният for loop итерира по колоните
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = count++;
            }
        }

        //Принтиране
        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
