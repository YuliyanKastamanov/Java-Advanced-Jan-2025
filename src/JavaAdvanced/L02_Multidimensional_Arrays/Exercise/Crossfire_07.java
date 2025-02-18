package JavaAdvanced.L02_Multidimensional_Arrays.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crossfire_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);

        List<List<Integer>> matrix = new ArrayList<>();
        fillMatrix(rows, cols, matrix);

        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")){
            String[] tokens = command.split("\\s+");
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);

            for (int i = row - radius; i <= row + radius; i++) {
                if (isInRange(i, col, matrix) && i != row){
                    matrix.get(i).remove(col);
                }
            }

            for (int i = col + radius; i >= col - radius; i--) {
                if (isInRange(row, i, matrix)){
                    matrix.get(row).remove(i);
                }
            }

            matrix.removeIf(List::isEmpty);
            command = scanner.nextLine();
        }

        for(List<Integer> numbers : matrix){
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }



    }

    private static boolean isInRange(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }

    private static void fillMatrix(int rows, int cols, List<List<Integer>> matrix) {

        int startNumber = 1;
        for (int row = 0; row < rows; row++) {
            List<Integer> currentList = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                currentList.add(startNumber);
                startNumber++;
            }

            matrix.add(currentList);
        }
    }
}
