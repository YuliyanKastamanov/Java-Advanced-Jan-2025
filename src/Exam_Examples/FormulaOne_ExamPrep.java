package Exam_Examples;

import java.util.Scanner;

public class FormulaOne_ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());//брой редове и брой колони
        int countCommands = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        fillMatrix(scanner, size, matrix);

        int rowPlayer = 0;
        int colPlayer = 0;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                char currentSymbol = matrix[row][col];
                if(currentSymbol == 'P'){
                    rowPlayer = row;
                    colPlayer = col;
                    break;
                }
            }
        }

        boolean hasWon = false;



        for (int i = 1; i <= countCommands; i++) {
            String direction = scanner.nextLine();

            int newRow = 0;
            int newCol = 0;
            //up, down, left or right
            switch (direction){

                case "up" ->{
                    //row -1
                    //col -1
                    newRow = getNewRowCol(rowPlayer - 1, size);
                    newCol = getNewRowCol(colPlayer, size);

                    if(matrix[newRow][newCol] == 'B'){
                        newRow = getNewRowCol(rowPlayer - 2, size);
                        newCol = getNewRowCol(colPlayer, size);// не е нужно
                    }
                }
                case "down" -> {
                    //row + 1
                    newRow = getNewRowCol(rowPlayer + 1, size);
                    newCol = getNewRowCol(colPlayer, size);

                    if(matrix[newRow][newCol] == 'B'){
                        newRow = getNewRowCol(rowPlayer + 2, size);
                        newCol = getNewRowCol(colPlayer, size);// не е нужно
                    }




                }
                case "left" -> {
                    //col - 1
                    newRow = getNewRowCol(rowPlayer, size);
                    newCol = getNewRowCol(colPlayer - 1, size);

                    if(matrix[newRow][newCol] == 'B'){
                        newRow = getNewRowCol(rowPlayer, size);
                        newCol = getNewRowCol(colPlayer - 2, size);
                    }

                }
                case "right" -> {

                    //col + 1

                    newRow = getNewRowCol(rowPlayer, size);
                    newCol = getNewRowCol(colPlayer + 1, size);

                    if(matrix[newRow][newCol] == 'B'){
                        newRow = getNewRowCol(rowPlayer, size);
                        newCol = getNewRowCol(colPlayer + 2, size);
                    }

                }
            }

            char newSymbol = matrix[newRow][newCol];

            if(matrix[newRow][newCol] == 'T'){
                //няма да имаме преместване
                newRow = rowPlayer;
                newCol = colPlayer;
            }else {
                //имаме преместване
                if (matrix[newRow][newCol] == 'F'){
                    hasWon = true;
                    break;
                }
            }

            matrix[rowPlayer][colPlayer] = '.';
            matrix[newRow][newCol] = 'P';
            rowPlayer = newRow;
            colPlayer = newCol;
        }

        //todo print matrix





    }

    private static int getNewRowCol(int value, int size) {
        //ако сме вътре в матрицата връщаме стойността -> value
        //ако сме извън матрицата връщаме size - 1

        if(value < 0){
            //на ляво и нагоре извън матрицата
            value = size - 1;
        }else if(value >= size){
            //на дясно и надолу извън матрицата
            value = 0;
        }

        return value;
    }

    private static void fillMatrix(Scanner scanner, int size, char[][] matrix) {

        for (int row = 0; row < size; row++) {

            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();

        }
    }
}
