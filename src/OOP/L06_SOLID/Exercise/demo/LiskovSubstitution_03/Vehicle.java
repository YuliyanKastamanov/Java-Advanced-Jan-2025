package OOP.L06_SOLID.Exercise.demo.LiskovSubstitution_03;

public class Vehicle {

    public void startEngine(){

        System.out.println("Engine started.");
    }

    public void drive(){
        System.out.println("Driving car.");
    }

    public void stopEngine(){
        System.out.println("Engine stopped.");
    }
}
