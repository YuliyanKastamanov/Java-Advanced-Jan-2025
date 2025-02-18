package JavaAdvanced.L06_Defining_Classes.Exercise.RawData_04;

public class Tyre {

    private int tyreAge;
    private double tyrePressure;

    public Tyre(int tyreAge, double tyrePressure) {
        this.tyreAge = tyreAge;
        this.tyrePressure = tyrePressure;
    }

    public double getTyrePressure() {
        return tyrePressure;
    }
}
