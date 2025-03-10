package OOP.L06_SOLID.Exercise.demo.LiskovSubstitution_03;

public class ElectricCar extends Car{


    public void startEngine(){

        System.out.println("Electric motor started.");
    }

    public void drive(){
        System.out.println("Driving electric Car.");
    }

    public void stopEngine(){
        System.out.println("Electric motor stopped.");
    }
}
