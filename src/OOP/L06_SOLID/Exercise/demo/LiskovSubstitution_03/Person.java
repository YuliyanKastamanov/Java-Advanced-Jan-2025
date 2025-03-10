package OOP.L06_SOLID.Exercise.demo.LiskovSubstitution_03;

public class Person {

    public void driveCar(Vehicle vehicle){
        vehicle.startEngine();
        vehicle.drive();
        vehicle.stopEngine();
    }
}
