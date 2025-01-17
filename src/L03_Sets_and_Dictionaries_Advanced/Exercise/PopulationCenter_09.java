package L03_Sets_and_Dictionaries_Advanced.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PopulationCenter_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Map<String, Long>> countries = new LinkedHashMap<>();

        while (true) {
            String input = reader.readLine();
            if (input.equals("report")) {
                break;
            }

            String[] tokens = input.split("\\|");
            String country = tokens[1];
            String city = tokens[0];
            int population = Integer.parseInt(tokens[2]);

            countries.putIfAbsent(country, new LinkedHashMap<>());

            countries.get(country).putIfAbsent(city, 0L);

            countries.get(country).put(city, countries.get(country).get(city) + population);

        }

        countries.entrySet().stream().sorted((e1, e2) -> {
            long total1 = e2.getValue().values().stream().reduce((m1, m2) -> m1 + m2).get();
            long total2 = e1.getValue().values().stream().reduce((m1, m2) -> m1 + m2).get();
            return Long.compare(total1, total2);
        }).forEach(e -> {
            System.out.println(e.getKey() + " (total population: " + e.getValue()
                    .values().stream().reduce((m1,m2) -> m1 + m2).get() + ")");
            e.getValue().entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(city -> {
                        System.out.printf("=>%s: %d%n",city.getKey(),city.getValue());
                    });
        });


    }
}
