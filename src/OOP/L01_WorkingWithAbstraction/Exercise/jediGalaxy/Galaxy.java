package OOP.L01_WorkingWithAbstraction.Exercise.jediGalaxy;

public class Galaxy {


    private Filed filed;

    public Galaxy(Filed filed) {
        this.filed = filed;
    }

    public void moveEvil(int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0){
            if(filed.isInBounds(evilRow, evilCol)){
                filed.setValue(evilRow, evilCol, 0);
            }
            evilRow--;
            evilCol--;
        }
    }

    public long moveJedi(int jediRow, int jediCol) {

        int collectedPower = 0;
        while (jediRow >= 0 && jediCol < this.filed.getColLength(1)){
            if(this.filed.isInBounds(jediRow, jediCol)){
                collectedPower += this.filed.getValue(jediRow, jediCol);
            }

            jediRow--;
            jediCol++;
        }

        return collectedPower;
    }
}
