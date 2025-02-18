package JavaAdvanced.L09_Iterators_and_Comparators.demo;

public class Car implements Comparable<Car> {

    private String model;
    private int horsePower;

    public Car(String model, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
               "model='" + model + '\'' +
               ", horsePower=" + horsePower +
               '}';
    }

    @Override
    public int compareTo(Car car) {
        //        return Integer.compare(this.getHorsePower(), car.getHorsePower());
        return this.getModel().compareTo(car.getModel());
    }
}
