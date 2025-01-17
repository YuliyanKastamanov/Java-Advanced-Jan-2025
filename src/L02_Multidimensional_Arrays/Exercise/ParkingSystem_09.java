package L02_Multidimensional_Arrays.Exercise;

import java.util.Scanner;

public class ParkingSystem_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] matrixSize = sc.nextLine().split(" ");
        boolean[][] matrix = new boolean[Integer.parseInt(matrixSize[0])][Integer.parseInt(matrixSize[1])];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = true;
        }
        while (true) {
            String input = sc.nextLine();
            if (input.equals("stop")) {
                break;
            }
            String[] inputSplit = input.split(" ");
            int z = Integer.parseInt(inputSplit[0]);
            int row = Integer.parseInt(inputSplit[1]);
            int col = Integer.parseInt(inputSplit[2]);
            int distance = Math.abs(z - row) + 1;
            int tempColLeft = 0>=col - 1 ? 1 : col-1;
            int tempColRight = col + 1>=matrix[0].length-1 ? col : col+1;
            while (matrix[row][tempColLeft]) {
                if(tempColLeft==0){
                    break;
                }
                tempColLeft--;
            }
            while (matrix[row][tempColRight]) {
                if(tempColRight==matrix[0].length-1){
                    break;
                }
                tempColRight++;
            }
            if(isRowFull(row,matrix)){
                System.out.printf("Row %d full\n",row);
                continue;
            }
            if (!matrix[row][col]) {
                matrix[row][col] = true;
                distance+=col;
                System.out.println(distance);
                continue;
            } else {
                if ((col - tempColLeft) > (Math.abs(tempColRight-col)) ){
                    col = tempColRight;
                } else {
                    col = tempColLeft;
                }
            }
            if(col<=1 && matrix[row][col]){
                col = tempColRight;
            }
            if(matrix[row][col]&&tempColRight==matrix[0].length-1){
                col = tempColLeft;
            }
            matrix[row][col] = true;
            distance += col;
            System.out.println(distance);

        }
    }
    public static boolean isRowFull(int row,boolean [][] matrix){
        for(int i=1;i<matrix[0].length;i++){
            if(!matrix[row][i]){
                return false;
            }
        }
        return true;
    }
}
