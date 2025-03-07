package OOP.L05_Polymorphism.Exercise.VehiclesExtension_02;


public class Truck extends Vehicle {

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.6, tankCapacity);
    }

    @Override
    public void refuel(double liters) {

        liters = liters * 0.95;
        super.refuel(liters);
    }
}
