package L04_Streams_Files_and_Directories.lab;

import java.io.Serializable;

public class Car implements Serializable {

    private String model;
    private long mileage;
    private int horsePower;

    public Car(String model, long mileage, int horsePower) {
        this.model = model;
        this.mileage = mileage;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
               "model='" + model + '\'' +
               ", mileage=" + mileage +
               ", horsePower=" + horsePower +
               '}';
    }
}
