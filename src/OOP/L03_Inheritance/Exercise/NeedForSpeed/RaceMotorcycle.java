package OOP.L03_Inheritance.Exercise.NeedForSpeed;

public class RaceMotorcycle extends Motorcycle{

    private static final double DEFAULT_FUEL_CONSUMPTION = 8;

    //private int maxSpeed;

   /* public RaceMotorcycle(double fuel, int horsePower, int maxSpeed) {
        super(fuel, horsePower);
        this.maxSpeed = maxSpeed;
    }*/

    public RaceMotorcycle(double fuel, int horsePower) {//, int maxSpeed - was set as argument
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
        //this.maxSpeed = maxSpeed;
    }
}
