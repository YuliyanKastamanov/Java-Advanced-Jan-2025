package L06_Defining_Classes.Exercise.RawData_04;

import java.util.List;

public class Car {
    private String carModel;
    private Engine engine;
    private Cargo cargo;
    private List<Tyre> tyres;

    public Car(String carModel, Engine engine, Cargo cargo, List<Tyre> tyres) {
        this.carModel = carModel;
        this.engine = engine;
        this.cargo = cargo;
        this.tyres = tyres;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public List<Tyre> getTires() {
        return tyres;
    }
}
