package L10_Exam_Preparation.lab;

import java.util.Scanner;

public class P2_CollectingStarsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[n][n];

        fillMatrix(scanner, field);
        int[] coordinates = findStartPosition(field);
        int row = coordinates[0];
        int col = coordinates[1];
        field[row][col] = '.';

        int stars = 2;

        while (stars != 10 && stars != 0) {
            String command = scanner.nextLine();

            move(coordinates, command);

            if (isOut(coordinates[0], coordinates[1], n)) {
                coordinates[0] = 0;
                coordinates[1] = 0;
            }

            if (isObstacle(coordinates[0], coordinates[1], field)) {
                moveOneStepBack(command, coordinates);
                stars--;
            }

            if (field[coordinates[0]][coordinates[1]] == '*') {
                field[coordinates[0]][coordinates[1]] = '.';
                stars++;
            }
        }

        field[coordinates[0]][coordinates[1]] = 'P';

        if (stars == 0) {
            System.out.println("Game over! You are out of any stars.");
        } else {
            System.out.println("You won! You have collected 10 stars.");
        }
        System.out.printf("Your final position is [%d, %d]\n", coordinates[0], coordinates[1]);
        printMatrix(field);
    }

    private static void moveOneStepBack(String command, int[] coordinates) {

        switch (command) {
            case "up":
                coordinates[0]++;
                break;
            case "down":
                coordinates[0]--;
                break;
            case "left":
                coordinates[1]++;
                break;
            case "right":
                coordinates[1]--;
                break;
        }

    }

    private static void move(int[] coordinates, String command) {
        switch (command) {
            case "up":
                coordinates[0]--;
                break;
            case "down":
                coordinates[0]++;
                break;
            case "left":
                coordinates[1]--;
                break;
            case "right":
                coordinates[1]++;
                break;
        }
    }

    private static boolean isObstacle(int row, int col, char[][] field) {
        return field[row][col] == '#';
    }

    private static boolean isOut(int row, int col, int n) {
        return row < 0 || row >= n || col < 0 || col >= n;
    }

    private static int[] findStartPosition(char[][] field) {
        int[] coordinates = new int[2];
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'P') {
                    coordinates[0] = row;
                    coordinates[1] = col;
                    break;
                }
            }
        }
        return coordinates;
    }

    private static void printMatrix(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print(field[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(Scanner scanner, char[][] field) {
        for (int row = 0; row < field.length; row++) {
            char[] currentRow = scanner.nextLine()
                                       .replaceAll("\\s+", "")
                                       .toCharArray();

            field[row] = currentRow;
        }
    }
}
