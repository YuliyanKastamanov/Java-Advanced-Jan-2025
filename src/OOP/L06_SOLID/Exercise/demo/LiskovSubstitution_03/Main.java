package OOP.L06_SOLID.Exercise.demo.LiskovSubstitution_03;

public class Main {

    public static void main(String[] args) {

        //Car car = new Car();
        ElectricCar electricCar = new ElectricCar();
        Karutsa karutsa = new Karutsa();

        Person yuli = new Person();

        //yuli.driveCar(car);
        yuli.driveCar(electricCar);
        yuli.driveCar(karutsa);
    }
}
