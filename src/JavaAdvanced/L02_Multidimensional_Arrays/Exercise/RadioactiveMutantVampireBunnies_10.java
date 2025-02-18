package JavaAdvanced.L02_Multidimensional_Arrays.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class RadioactiveMutantVampireBunnies_10 {
    private static int[] playerPosition = new int[2];
    private static final int[] rowMovement = {1, -1, 0, 0};
    private static final int[] colMovement = {0, 0, 1, -1};
    private static boolean isPlayerDead = false;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        char[][] matrix = new char[rows][cols];
        ArrayDeque<Integer> queueOfPositions = new ArrayDeque<>();
        for (int row = 0; row < matrix.length; row++) {
            String[] input = scan.nextLine().split("");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input[col].charAt(0);
                if (matrix[row][col] == 'B') {
                    queueOfPositions.offer(row);
                    queueOfPositions.offer(col);
                }
                if (matrix[row][col] == 'P') {
                    playerPosition[0] = row;
                    playerPosition[1] = col;
                    matrix[row][col] = '.';
                }
            }
        }

        String[] cmdArgs = scan.nextLine().split("");

        int counter = -1;
        while (++counter < cmdArgs.length && !isPlayerDead) {
            String command = cmdArgs[counter];

            moveBunnies(matrix, queueOfPositions);

            int playerRow = playerPosition[0];
            int playerCol = playerPosition[1];

            switch (command) {
                case "R":
                    playerCol += 1;
                    break;
                case "L":
                    playerCol -= 1;
                    break;
                case "U":
                    playerRow -= 1;
                    break;
                case "D":
                    playerRow += 1;
                    break;
            }

            if (!isInBounds(playerRow, playerCol, matrix)) {
                break;
            }
            playerPosition[0] = playerRow;
            playerPosition[1] = playerCol;

            if (!isCellFree(playerRow, playerCol, matrix)) {
                isPlayerDead = true;
                break;
            }
        }

        printCharMatrix(matrix);
        if (isPlayerDead) {
            System.out.print("dead: ");
        } else {
            System.out.print("won: ");
        }
        System.out.println(playerPosition[0] + " " + playerPosition[1]);
    }

    private static void printCharMatrix(char[][] finalMatrix) {
        for (char[] matrix : finalMatrix) {
            for (char symbol : matrix) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static void moveBunnies(char[][] matrix, ArrayDeque<Integer> queueOfPositions) {
        int lengthOperations = queueOfPositions.size() / 2;
        for (int i = 0; i < lengthOperations; i++) {
            int row = queueOfPositions.poll();
            int col = queueOfPositions.poll();
            for (int j = 0; j < rowMovement.length; j++) {
                int newRow = row + rowMovement[j];
                int newCol = col + colMovement[j];

                if (!isInBounds(newRow, newCol, matrix)) {
                    continue;
                }
                if (matrix[newRow][newCol] == 'B') {
                    continue;
                }
                matrix[newRow][newCol] = 'B';
                queueOfPositions.offer(newRow);
                queueOfPositions.offer(newCol);
            }
        }
    }

    private static boolean isCellFree(int row, int col, char[][] matrix) {
        return matrix[row][col] == '.';
    }

    private static boolean isInBounds(int row, int col, char[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
}

