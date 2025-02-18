package JavaAdvanced.L06_Defining_Classes.Exercise.CarSalesman_05;

public class Engine {

    private String engineModel;
    private int enginePower;

    private int engineDisplacement; //optional
    private String engineEfficiency; //optional

    public Engine(String engineModel, int enginePower, int engineDisplacement, String engineEfficiency) {
        this(engineModel, enginePower);
        this.engineDisplacement = engineDisplacement;
        this.engineEfficiency = engineEfficiency;
    }

    public Engine(String engineModel, int enginePower) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineDisplacement = 0;
        this.engineEfficiency = "n/a";
    }

    public Engine(String engineModel, int enginePower, int engineDisplacement) {
        this(engineModel, enginePower);
        this.engineDisplacement = engineDisplacement;
        this.engineEfficiency = "n/a";

    }

    public Engine(String engineModel, int enginePower, String engineEfficiency) {
        this(engineModel, enginePower);
        this.engineEfficiency = engineEfficiency;
        this.engineDisplacement = 0;

    }

    public String getEngineModel() {
        return engineModel;
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Power: " + this.enginePower + "\n");
        if(this.engineDisplacement == 0) {
            stringBuilder.append("Displacement: n/a" + "\n");
        } else {
            stringBuilder.append("Displacement: " + this.engineDisplacement + "\n");
        }
        stringBuilder.append("Efficiency: " + this.engineEfficiency);
        return stringBuilder.toString();
    }
}