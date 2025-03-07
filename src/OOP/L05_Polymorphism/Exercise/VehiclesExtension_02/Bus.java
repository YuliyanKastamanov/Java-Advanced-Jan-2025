package OOP.L05_Polymorphism.Exercise.VehiclesExtension_02;

public class Bus extends Vehicle{

    /*private double emptyBusFuelConsumption;
    private double fullBusFuelConsumption;*/


    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        /*this.emptyBusFuelConsumption = fuelConsumption;
        this.fullBusFuelConsumption = fuelConsumption + 1.4;*/
    }

    //Карам автобус с хора! Не е празен
    @Override
    public String drive(double distanceToDrive) {

        //задава нова стойност на fuelConsumption
        this.setFuelConsumption(getFuelConsumption() + 1.4);//fullBusFuelConsumption
        //изпълни логиката/метода написан в бащиния клас
        return super.drive(distanceToDrive);
    }

    public String driveEmpty(double distance){
        //this.setFuelConsumption(emptyBusFuelConsumption);
        return super.drive(distance);
    }

}
