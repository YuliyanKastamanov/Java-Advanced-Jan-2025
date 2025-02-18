package JavaAdvanced.L08_Generics.Exercise.Tuple_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] nameAndCity = reader.readLine().split("\\s+");
        String name = nameAndCity[0] + " " + nameAndCity[1];
        String city = nameAndCity[2];

        Tuple<String, String> nameAndTown = new Tuple<>(name, city);
        System.out.print(nameAndTown);

        String[] nameAndLiters = reader.readLine().split("\\s+");
        Integer liters = Integer.parseInt(nameAndLiters[1]);
        Tuple<String, Integer> nameAndBeer = new Tuple<>(nameAndLiters[0], liters);
        System.out.print(nameAndBeer);

        String[] numbersAsStr = reader.readLine().split("\\s+");
        Tuple<Integer, Double> numbers = new Tuple<>(Integer.parseInt(numbersAsStr[0]), Double.parseDouble(numbersAsStr[1]));
        System.out.print(numbers);


    }
}
