package JavaAdvanced.L03_Sets_and_Dictionaries_Advanced.lab;

import java.util.*;

public class _01_ParkingLot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> parking = new LinkedHashSet<>();

        Map<String, String> mapParking = new LinkedHashMap<>();

        while (!"END".equals(input)) {

            String[] tokens = input.split(", ");

            String direction = tokens[0];
            String carNumber = tokens[1];

            switch (direction) {
                case "IN":
                    parking.add(carNumber);
                    mapParking.put(carNumber, null);
                    break;
                case "OUT":
                    parking.remove(carNumber);
                    mapParking.remove(carNumber);
                    break;
            }

            input = scanner.nextLine();
        }

        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            //  for (String carNumber : parking) {
            //      System.out.println(carNumber);
            //  }
            //            parking.forEach(System.out::println);
            mapParking.forEach((k, v) -> System.out.println(k));
        }
    }
}
