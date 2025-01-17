package L02_Multidimensional_Arrays.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class TheMatrix_12 {
    private static final BufferedReader reader;
    private static String[][] maze;
    private static final int[] rowOffset = {0, 0, - 1, 1};
    private static final int[] colOffset = {- 1, 1, 0, 0};
    private static final Deque<Cell> possibleMoves = new ArrayDeque<>();

    static {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws IOException {
        readMatrix();
        String fillChar = reader.readLine();
        int[] startParams = getParams();
        int starRow = startParams[0];
        int starCol = startParams[1];

        if (! inRange(starRow, starCol)) {
            return;
        }

        String startChar = maze[starRow][starCol];

        possibleMoves.addLast(new Cell(starRow, starCol));

        while (! possibleMoves.isEmpty()) {
            Cell currentCell = possibleMoves.removeFirst();

            for (int i = 0; i < rowOffset.length; i++) {
                int row = currentCell.row + rowOffset[i];
                int col = currentCell.col + colOffset[i];

                if (inRange(row, col) && maze[row][col].equals(startChar)) {
                    possibleMoves.addLast(new Cell(row, col));
                }
            }

            maze[currentCell.row][currentCell.col] = fillChar;
        }

        printMatrix();

    }

    //    private static void printMatrix() {
//        for (String[] row : maze) {
//            System.out.println(String.join("", row));
//        }
//    }
    private static void printMatrix() {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                System.out.print(maze[row][col]);
            }
            System.out.println();
        }
    }

    private static boolean inRange(int row, int col) {
        return (row >= 0 && row < maze.length) &&
                (col >= 0 && col < maze[row].length);
    }

    private static void readMatrix() throws IOException {
        int[] size = getParams();
        int rows = size[0];
        maze = new String[rows][];
        for (int row = 0; row < size[0]; row++) {
            maze[row] = reader.readLine().split("\\s+");
        }
    }

    private static int[] getParams() throws IOException {
        return Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static class Cell {
        private int row;
        private int col;

        Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}

