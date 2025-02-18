package JavaAdvanced.L10_Exam_Preparation.Exercise;

import java.util.Scanner;

public class ClearSkies_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];

        //fillMatrix(scanner, size, matrix)
        //запазваме координатите на нашия изтребител
        int jetFighterRow = 0;
        int jetFighterCol = 0;

        //попълваме патрицата
        for (int row = 0; row < size; row++) {
            char[] inputRow = scanner.nextLine().toCharArray();

            for (int col = 0; col < size; col++) {
                matrix[row][col] = inputRow[col];
                if (matrix[row][col] == 'J') {
                    jetFighterRow = row;
                    jetFighterCol = col;
                }
            }

        }

        int armourUnits = 300;
        int countEnemies = 4;

        boolean isJetFighterWin = true;

        while (countEnemies > 0) {
            String command = scanner.nextLine();
            //"up", "down", "left" and "right".

            switch (command) {
                case "up" -> {
                    int jetFighterNewRow = jetFighterRow - 1;
                    char currentChar = matrix[jetFighterNewRow][jetFighterCol];
                    if (currentChar == 'R') {
                        armourUnits = 300;
                    } else if (currentChar == 'E') {
                        armourUnits -= 100;
                        countEnemies--;

                    }

                    matrix[jetFighterRow][jetFighterCol] = '-';
                    matrix[jetFighterNewRow][jetFighterCol] = 'J';
                    jetFighterRow = jetFighterNewRow;


                }
                case "down" -> {
                    int jetFighterNewRow = jetFighterRow + 1;
                    char currentChar = matrix[jetFighterNewRow][jetFighterCol];
                    if (currentChar == 'R') {
                        armourUnits = 300;
                    } else if (currentChar == 'E') {
                        armourUnits -= 100;
                        countEnemies--;
                    }

                    matrix[jetFighterRow][jetFighterCol] = '-';
                    matrix[jetFighterNewRow][jetFighterCol] = 'J';
                    jetFighterRow = jetFighterNewRow;

                }
                case "left" -> {
                    int jetFighterNewCol = jetFighterCol - 1;
                    char currentChar = matrix[jetFighterRow][jetFighterNewCol];
                    if (currentChar == 'R') {
                        armourUnits = 300;
                    } else if (currentChar == 'E') {
                        armourUnits -= 100;
                        countEnemies--;
                    }

                    matrix[jetFighterRow][jetFighterCol] = '-';
                    matrix[jetFighterRow][jetFighterNewCol] = 'J';
                    jetFighterCol = jetFighterNewCol;

                }

                case "right" -> {
                    int jetFighterNewCol = jetFighterCol + 1;
                    char currentChar = matrix[jetFighterRow][jetFighterNewCol];
                    if (currentChar == 'R') {
                        armourUnits = 300;
                    } else if (currentChar == 'E') {
                        armourUnits -= 100;
                        countEnemies--;
                    }
                    matrix[jetFighterRow][jetFighterCol] = '-';
                    matrix[jetFighterRow][jetFighterNewCol] = 'J';
                    jetFighterCol = jetFighterNewCol;

                }
            }

            if (armourUnits == 0) {
                isJetFighterWin = false;
                break;
            }

        }

        if (isJetFighterWin) {
            System.out.println("Mission accomplished, you neutralized the aerial threat!");
        } else {
            System.out.printf("Mission failed, your jetfighter was shot down! Last coordinates [%d, %d]!%n", jetFighterRow, jetFighterCol);

        }
        printMatrix(matrix);

    }

    private static void printMatrix(char[][] matrix){
        for (char[] chars : matrix) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(chars[col]);
            }
            System.out.println();
        }
    }

}