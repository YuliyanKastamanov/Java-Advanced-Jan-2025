package OOP.L05_Polymorphism.Exercise.VehiclesExtension_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] carDetails = scanner.nextLine().split("\\s+");
        String[] truckDetails = scanner.nextLine().split("\\s+");
        String[] busDetails = scanner.nextLine().split("\\s+");

        //Car 30 0.04 70
        double carFuelQuantity = Double.parseDouble(carDetails[1]);
        double carFuelConsumption = Double.parseDouble(carDetails[2]);
        double carTankCapacity = Double.parseDouble(carDetails[3]);

        //Truck 100 0.5 300
        double truckFuelQuantity = Double.parseDouble(truckDetails[1]);
        double truckFuelConsumption = Double.parseDouble(truckDetails[2]);
        double truckTankCapacity = Double.parseDouble(truckDetails[3]);

        //Bus 40 0.3 150
        double busFuelQuantity = Double.parseDouble(busDetails[1]);
        double busFuelConsumption = Double.parseDouble(busDetails[2]);
        double busTankCapacity = Double.parseDouble(busDetails[3]);

        Car car = new Car(carFuelQuantity, carFuelConsumption, carTankCapacity);
        Truck truck = new Truck(truckFuelQuantity, truckFuelConsumption, truckTankCapacity);
        Bus bus = new Bus(busFuelQuantity, busFuelConsumption, busTankCapacity);

        int countCommand = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=countCommand ; i++) {

            //Refuel Car -10
            //Drive Truck 10
            //DriveEmpty Bus 100
            String[] commandParts = scanner.nextLine().split("\\s+");
            String commandName = commandParts[0];
            String vehicleType = commandParts[1];
            double fuelQuantityOrDistance = Double.parseDouble(commandParts[2]);

            switch (commandName){
                case "Drive" -> {
                    if(vehicleType.equals("Car")){
                        System.out.println(car.drive(fuelQuantityOrDistance));
                    }else if(vehicleType.equals("Truck")){
                        System.out.println(truck.drive(fuelQuantityOrDistance));
                    } else if (vehicleType.equals("Bus")) {
                        System.out.println(bus.drive(fuelQuantityOrDistance));
                    }
                }
                case "DriveEmpty" -> System.out.println(bus.driveEmpty(fuelQuantityOrDistance));

                case "Refuel" ->  {
                    if(vehicleType.equals("Car")){
                        car.refuel(fuelQuantityOrDistance);
                    }else if(vehicleType.equals("Truck")){
                        truck.refuel(fuelQuantityOrDistance);
                    } else if (vehicleType.equals("Bus")) {
                        bus.refuel(fuelQuantityOrDistance);
                    }
                }
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);



    }
}
