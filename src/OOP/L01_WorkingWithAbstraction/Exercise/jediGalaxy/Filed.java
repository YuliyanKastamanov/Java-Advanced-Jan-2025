package OOP.L01_WorkingWithAbstraction.Exercise.jediGalaxy;

public class Filed {


    private int[][] matrix;

    public Filed(int rows, int cols){
        this(rows, cols, 0);
    }

    public Filed(int rows, int cols, int beginFillValue){
        this.matrix =  new int[rows][cols];
        this.fillValues(beginFillValue);
    }

    private void fillValues(int beginFillValue) {
        for (int row = 0; row < this.matrix.length; row++) {
            for (int col = 0; col < this.matrix[row].length; col++) {
                this.matrix[row][col] = beginFillValue++;
            }

        }
    }


    public boolean isInBounds(int evilRow, int evilCol) {

        return evilRow >= 0 && evilRow < this.matrix.length && evilCol >= 0 && evilCol < this.matrix[evilRow].length;
    }

    public void setValue(int evilRow, int evilCol, int newValue) {
        this.matrix[evilRow][evilCol] = newValue;
    }

    public int getColLength(int row) {

        return this.matrix[row].length;
    }

    public int getValue(int jediRow, int jediCol) {

        return this.matrix[jediRow][jediCol];
    }
}
