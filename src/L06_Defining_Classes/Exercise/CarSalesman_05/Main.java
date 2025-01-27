package L06_Defining_Classes.Exercise.CarSalesman_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Engine> engines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] engineData = scanner.nextLine().split("\\s+");
            String engineModel = engineData[0];
            int enginePower = Integer.parseInt(engineData[1]);
            Engine currentEngine;
            if (engineData.length == 4){
                int engineDisplacement = Integer.parseInt(engineData[2]);
                String engineEfficiency = engineData[3];
                currentEngine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);
            }else if(engineData.length == 2){
                currentEngine = new Engine(engineModel, enginePower);
            }else{
                try {
                    int engineDisplacement = Integer.parseInt(engineData[2]);
                    currentEngine = new Engine(engineModel, enginePower, engineDisplacement);
                } catch (NumberFormatException e) {
                    String engineEfficiency = engineData[2];
                    currentEngine = new Engine(engineModel, enginePower, engineEfficiency);
                }
            }

            engines.add(currentEngine);


        }

        int m = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            Car currentCar;

            String[] carData = scanner.nextLine().split("\\s+");

            String carModel = carData[0];
            String carEngine = carData[1];

            if (carData.length == 2){

                currentCar = new Car(carModel, carEngine);

            } else if (carData.length == 4) {

                int weight = Integer.parseInt(carData[2]);
                String color = carData[3];

                currentCar = new Car(carModel, carEngine, weight, color);

            }else {
                try {
                    int weight = Integer.parseInt(carData[2]);
                    currentCar = new Car(carModel, carEngine, weight);
                } catch (NumberFormatException e) {
                    String color = carData[2];
                    currentCar = new Car(carModel, carEngine, color);
                }
            }

            cars.add(currentCar);

        }

        System.out.println();

        for (Car car : cars) {
            System.out.println(car.getModel() + ":");
            System.out.println(car.getEngine() + ":");
            engines.forEach(engine -> {
                        if (engine.getEngineModel().equals(car.getEngine())) {
                            System.out.println(engine.toString());
                        }
                    }
            );
            if(car.getWeight() == 0) {
                System.out.println("Weight: n/a");
            } else {
                System.out.println("Weight: " + car.getWeight());
            }
            System.out.println("Color: " + car.getColor());
        }



    }
}
