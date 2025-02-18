package JavaAdvanced.Exam_Examples;

import java.util.Scanner;

public class PawnWars_ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 8;
        char[][] chessBoard = new char[size][size];

        int whitePawnRow = 0;
        int whitePawnCol = 0;
        int blackPawnRow = 0;
        int blackPawnCol = 0;

        for (int row = 0; row < size; row++) {
            char[] currentRow = scanner.nextLine().toCharArray();

            for (int col = 0; col < size; col++) {
                chessBoard[row][col] = currentRow[col];

                //проверяваме ако текущия символ == 'w'
                if(chessBoard[row][col] == 'w'){
                    whitePawnRow = row;
                    whitePawnCol = col;
                }

                //проверяваме ако текущия символ == 'b'
                if(chessBoard[row][col] == 'b'){
                    blackPawnRow = row;
                    blackPawnCol = col;
                }
            }
        }
        System.out.println();

        //докато не приключи играта ние ще движим първо бяла после черна пешка
        while (true){

            int oldWhiteRow = whitePawnRow;
            int oldWhiteCol = whitePawnCol;
            int oldBlackRow = blackPawnRow;
            int oldBlackCol = blackPawnCol;

            whitePawnRow--;
            blackPawnRow++;

            if(isInMatrix(whitePawnRow, whitePawnCol - 1) && chessBoard[whitePawnRow][whitePawnCol - 1] == 'b'){

                String whitePawnsPosition = getPosition(whitePawnRow, whitePawnCol - 1);
                System.out.printf("Game over! White capture on %s.", whitePawnsPosition);
                break;
            } else if (isInMatrix(whitePawnRow, whitePawnCol + 1) && chessBoard[whitePawnRow][whitePawnCol + 1] == 'b') {
                String whitePawnsPosition = getPosition(whitePawnRow, whitePawnCol + 1);
                System.out.printf("Game over! White capture on %s.", whitePawnsPosition);
                break;
                
            }else {
                chessBoard[oldWhiteRow][oldWhiteCol] = '-';
                chessBoard[whitePawnRow][whitePawnCol] = 'w';

                if(whitePawnRow == 0){
                    String whitePawnPosition = getPosition(whitePawnRow, whitePawnCol);
                    System.out.printf("Game over! White pawn is promoted to a queen at %s.", whitePawnPosition);
                    break;
                }

            }


            if(isInMatrix(blackPawnRow, blackPawnCol - 1) && chessBoard[blackPawnRow][blackPawnCol - 1] == 'w'){
                String blackPawnsPosition = getPosition(blackPawnRow, blackPawnCol - 1);
                System.out.printf("Game over! Black capture on %s.", blackPawnsPosition);
                break;
            }else if(isInMatrix(blackPawnRow, blackPawnCol + 1) && chessBoard[blackPawnRow][blackPawnCol + 1] == 'w'){
                String blackPawnsPosition = getPosition(blackPawnRow, blackPawnCol + 1);
                System.out.printf("Game over! Black capture on %s.", blackPawnsPosition);
                break;
            }else {
                chessBoard[oldBlackRow][oldBlackCol] = '-';
                chessBoard[blackPawnRow][blackPawnCol] = 'b';

                if(blackPawnRow == 7){
                    String blackPawnPosition = getPosition(blackPawnRow, blackPawnCol);//Вместо blackPawnCol беше написано whitePawnCol и задачата получаваше 80/100
                    System.out.printf("Game over! Black pawn is promoted to a queen at %s.", blackPawnPosition);
                    break;
                }

            }


        }





    }

    private static String getPosition(int currentRow, int currentCol) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int col = 0; col < 8; col++) {

            if(col == currentCol){
                stringBuilder.append((char) (col + 97));
            }

        }

        int count = 8;

        for (int row = 0; row < 8; row++) {

            if(row == currentRow){
                stringBuilder.append(count);
            }
            count--;
        }

        return stringBuilder.toString();
    }

    private static boolean isInMatrix(int row, int col) {

        //ако не знаме размера -> приемаме като аргумент size
        //int size = ?

        return row >= 0 && row <= 7 && col >= 0 && col <= 7;
        //return row >= 0 && row < size && col >= 0 && col < size;
    }
}


