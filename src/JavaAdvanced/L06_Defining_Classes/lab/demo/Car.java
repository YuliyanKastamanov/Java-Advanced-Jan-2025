package JavaAdvanced.L06_Defining_Classes.lab.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private int horsePower;
    private List<String> parts;

    public Car() {
        this("unknown", "unknown", 0);
    }

    public Car(String brand) {
        this(brand, "unknown", 0);
    }

    public Car(String brand, String model) {
        this(brand, model, 0);
    }

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;

        // сеттер-а служи за валидация на полето да не е отрицателна стойност
        this.setHorsePower(horsePower);

        this.parts = new ArrayList<>();
    }

    public void addPart(String part) {
        this.parts.add(part);
    }

    public void printParts() {
        System.out.printf("Car %s has these parts:\n", this.brand);
        this.parts.forEach(System.out::println);
    }

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

        if (horsePower < 0) {
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
