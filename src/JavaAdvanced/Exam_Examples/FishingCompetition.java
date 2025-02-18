package JavaAdvanced.Exam_Examples;

import java.util.Scanner;

public class FishingCompetition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[n][n];
        // 1. Fill matrix
        fillMatrix(field, scanner);
        // 2. Get coordinates
        int[] coordinates = getCoordinates(field);

        int quota = 0;
        boolean isWhirlpool = false;

        String line = scanner.nextLine();

        while (!"collect the nets".equals(line)) {
            field[coordinates[0]][coordinates[1]] = '-';
            // move directly by reference manipulates (updates) the coordinates array
            move(line, coordinates, n);

            int row = coordinates[0];
            int col = coordinates[1];
            char currentSymbol = field[row][col];

            if (Character.isDigit(currentSymbol)) {
                quota += Character.getNumericValue(currentSymbol);
            } else if (currentSymbol == 'W') {
                quota = 0;
                isWhirlpool = true;
                break;
            }
            field[row][col] = 'S';

            line = scanner.nextLine();
        }

        if (isWhirlpool) {
            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                              " Last coordinates of the ship: [%d,%d]", coordinates[0], coordinates[1]);
        } else if (quota >= 20) {
            System.out.println("Success! You managed to reach the quota!");
            System.out.printf("Amount of fish caught: %d tons.\n", quota);
            printMatrix(field);
        } else {
            System.out.printf("You didn't catch enough fish and didn't" +
                              " reach the quota! You need %d tons of fish more.\n", 20 - quota);
            if (quota > 0) {
                System.out.printf("Amount of fish caught: %d tons.\n", quota);
            }
            printMatrix(field);
        }
    }

    private static void printMatrix(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print(field[row][col]);
            }
            System.out.println();
        }
    }

    private static void move(String command, int[] coordinates, int n) {

        int row = coordinates[0];
        int col = coordinates[1];

        switch (command) {
            case "up":
                row--;
                if (row < 0) {
                    row = n - 1;
                }
                break;
            case "down":
                row++;
                if (row >= n) {
                    row = 0;
                }
                break;
            case "left":
                col--;
                if (col < 0) {
                    col = n - 1;
                }
                break;
            case "right":
                col++;
                if (col >= n) {
                    col = 0;
                }
                break;
        }
        // update coordinates
        coordinates[0] = row;
        coordinates[1] = col;
    }

    private static int[] getCoordinates(char[][] field) {
        int[] coordinates = new int[2];

        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {

                if (field[row][col] == 'S') {
                    coordinates[0] = row;
                    coordinates[1] = col;
                }
            }
        }
        return coordinates;
    }

    private static void fillMatrix(char[][] field, Scanner scanner) {
        // field.length => rows
        for (int i = 0; i < field.length; i++) {
            char[] currentRow = scanner.nextLine().toCharArray();
            field[i] = currentRow;
        }
    }
}
