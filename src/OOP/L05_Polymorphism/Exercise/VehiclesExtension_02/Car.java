package OOP.L05_Polymorphism.Exercise.VehiclesExtension_02;



public class Car extends Vehicle {

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 0.9, tankCapacity);
    }


}
