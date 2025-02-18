package JavaAdvanced.L06_Defining_Classes.Exercise.SpeedRacing_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCars = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 1; i <= countCars ; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            double fuel = Double.parseDouble(data[1]);
            double consumptionPerKm = Double.parseDouble(data[2]);
            int distance = 0;

            Car currentCar = new Car(model, fuel, consumptionPerKm, distance);

            cars.add(currentCar);

        }

        String command = scanner.nextLine();

        while (!command.equals("End")){

            String currentCarModel = command.split("\\s+")[1];
            int distance = Integer.parseInt(command.split("\\s+")[2]);

            boolean isMoving = getCurrentCar(currentCarModel, cars).isMoving(distance);

            if(isMoving){
                //колата може да се движи
                Car currentCar = getCurrentCar(currentCarModel, cars);

                double restFuel = currentCar.getRestFuel(distance);
                currentCar.setFuelAmount(restFuel);

                int currentDistance = currentCar.getDistanceTraveled();
                currentCar.setDistanceTraveled(currentDistance + distance);

                //този метод работи защото не използваме външна база от данни
                //int currentIndex = getIndexAndDeleteCar(currentCar, cars);
                //cars.add(currentIndex, currentCar);

            }else {
                //колата не може да се движи
                System.out.println("Insufficient fuel for the drive");
            }

            command = scanner.nextLine();
        }

        cars.forEach(car -> {
            System.out.printf("%s %.2f %d%n", car.getModel(), car.getFuelAmount(), car.getDistanceTraveled());
        });

    }

    private static int getIndexAndDeleteCar(Car currentCar, List<Car> cars) {

        int index = 0;
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if(car.getModel().equals(currentCar.getModel())){
                index = i;
                cars.remove(i);
            }
        }

        return index;

    }

    private static Car getCurrentCar(String currentCarModel, List<Car> cars) {


        Car currentCar = null;
        for (Car car : cars){
            if(car.getModel().equals(currentCarModel)){
               currentCar = car;
            }
        }

        return currentCar;
    }
}
