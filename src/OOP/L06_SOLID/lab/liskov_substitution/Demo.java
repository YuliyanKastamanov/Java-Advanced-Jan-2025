package liskov_substitution;

public class Demo {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();

        drive(electricCar);

    }

    static void drive(Vehicle vehicle) {
        vehicle.accelerate();
    }
}
