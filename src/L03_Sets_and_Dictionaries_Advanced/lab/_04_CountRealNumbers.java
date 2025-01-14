package L03_Sets_and_Dictionaries_Advanced.lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_CountRealNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double[] realNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                     .mapToDouble(Double::parseDouble)
                                     .toArray();

        Map<Double, Integer> map = new LinkedHashMap<>();

        for (double realNumber : realNumbers) {

            if (map.containsKey(realNumber)) {
                Integer currentValue = map.get(realNumber);
                map.put(realNumber, currentValue + 1);
            } else {
                map.put(realNumber, 1);
            }

            //            map.putIfAbsent(realNumber, 0);
            //            map.put(realNumber, map.get(realNumber) + 1);
        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.1f -> %d\n", entry.getKey(), entry.getValue());
        }

        //        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
