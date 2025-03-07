package OOP.L05_Polymorphism.Exercise.VehiclesExtension_02;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
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

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public String drive(double distanceToDrive){
        String message;
        //Проверяваме дали превозното средство може да измине това разстояние
        double requiredFuel = distanceToDrive * this.getFuelConsumption();

        if(requiredFuel <= this.getFuelQuantity()){
            DecimalFormat decimalFormat = new DecimalFormat("##.##");
            message = String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distanceToDrive));
            this.fuelQuantity = this.fuelQuantity - requiredFuel;
        }else {
            message = "%s needs refueling".formatted(this.getClass().getSimpleName());
        }
        return message;
    }




    public void refuel(double fuelToRefill){
        if(fuelToRefill <= 0){
            System.out.println("Fuel must be a positive number");
            return;
        }else if(this.getFuelQuantity() + fuelToRefill > this.getTankCapacity()){
            System.out.println("Cannot fit fuel in tank");
            return;
        }

        this.setFuelQuantity(this.getFuelQuantity() + fuelToRefill);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
