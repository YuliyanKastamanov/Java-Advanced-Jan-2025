package OOP.L03_Inheritance.Exercise.NeedForSpeed;

public class Vehicle {

    private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;

    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void drive(double kilometers){

        //пресметнем колко гориво сме изхарчили
        double neededFuel = kilometers * this.fuelConsumption;

        //проверяваме дали горивото ни е достатъчно
        if(this.getFuel() >= neededFuel){
            this.setFuel(this.getFuel() - neededFuel);
        }
    }
}
