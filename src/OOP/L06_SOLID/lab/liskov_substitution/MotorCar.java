package liskov_substitution;

public class MotorCar implements Vehicle {

    private Engine engine;

    public MotorCar(Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {
        engine.turnOn();
    }

    @Override
    public void accelerate() {
        engine.powerOn(500);
    }
}
