package OOP.L06_SOLID.Exercise.demo.LiskovSubstitution_03;


//bad example
public class Karutsa extends Vehicle{

    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("No engine Installed!");
    }

    @Override
    public void drive() {
        System.out.println("Karutsa is moving.");
    }

    @Override
    public void stopEngine() {
       throw new UnsupportedOperationException("No engine Installed!");
    }
}
