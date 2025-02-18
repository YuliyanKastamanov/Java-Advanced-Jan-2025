package JavaAdvanced.L03_Sets_and_Dictionaries_Advanced.lab;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {

        String a = "Siblings";
        String b = "Teheran";

        Person kaloyan = new Person("Kaloyan");
        Person peter = new Person("Peter");

        HashSet<Person> set = new HashSet<>();
        set.add(null);
        set.add(kaloyan);
        set.add(peter);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Peter");
        map.put(4, "Kaloyan");
        map.put(null, "Ivan");


        Map<String, Integer> vehicles = new HashMap<>();
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 5);

        vehicles.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    // 1 , 0 , -1
                    // if sorted return 0 then object are equal
                    //if values are equal then compare by keys
                    int res = e1.getValue().compareTo(e2.getValue());

                    if (res == 0) {
                        res = e2.getKey().compareTo(e1.getKey());
                    }
                    return res;
                })
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
        System.out.println();
        vehicles.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
//                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

        //        for (String key : vehicles.keySet()) {
        //            System.out.println(key + " - " + vehicles.get(key));
        //        }

        //        for (Map.Entry<String, Integer> entry : vehicles.entrySet()) {
        //            System.out.println(entry.getKey() + " - " + entry.getValue());
        //        }

        //        vehicles.forEach((k, v) -> System.out.println(k + " - " + v));

        ;

        System.out.println();

        //        // SORTING
        //        List<Integer> numbers = List.of(5, 3, 1, 4, 2);
        //        // Ascending order (Natural order)
        //        numbers.stream()
        //               .sorted((n1, n2) -> n1.compareTo(n2))
        //               .forEach(System.out::println);
        //
        //        System.out.println();
        //
        //        // Descending order
        //        numbers.stream()
        //               .sorted((n1, n2) -> n2.compareTo(n1))
        //               .forEach(System.out::println);
    }
}
