package liskov_substitution;

public class ElectricCar implements ElectricVehicle {

    @Override
    public void accelerate() {
        // accelerate
    }

    @Override
    public int batteryLife() {
        return 75;
    }
}
