package OOP.L05_Polymorphism.Exercise.Vehicles_01;

import java.text.DecimalFormat;

public class Vehicle {

    protected double fuelQuantity;
    protected double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }


    public String drive(double distance){
        //Car or Truck
        double neededFuel = distance * fuelConsumption;

        //проверяваме дали можем да изминем разстоянието
        if(neededFuel > fuelQuantity){
            //връщаме съобщение, че не можем да изминем разстоянието
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }

        //можем да изминем разстоянието
        this.fuelQuantity = this.fuelQuantity - neededFuel;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance));
    }

    public void refuel(double liters){
        this.fuelQuantity += liters;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
