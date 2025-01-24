package L06_Defining_Classes.lab._01_defining_classes;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private int horsePower;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {

        if (horsePower <= 0) {
            System.out.println("HorsePower can't be zero or below!");
        } else {
            this.horsePower = horsePower;
        }
    }

    public String carInfo() {
        return String.format("The car is: %s %s - %d HP.",
                             this.brand,
                             this.model,
                             this.horsePower);
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                             this.brand,
                             this.model,
                             this.horsePower);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return horsePower == car.horsePower && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, horsePower);
    }
}
