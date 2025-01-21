package L05_Functional_Programming.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class _05_FilterByAge {

    public static void main(String[] args) {

        Map<String, Integer> people = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(", ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            people.put(name, age);
        }

        //•	Condition - "younger" or "older"
        //•	Age - Integer
        //•	Format - "name", "age" or "name age"

        String condition = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String printFormat = scanner.nextLine();

        // 2 Predicate
        //        Predicate<Integer> agePredicate;
        //        if ("younger".equals(condition)) {
        //            agePredicate = age -> age <= ageLimit;
        //        } else {
        //            agePredicate = age -> age >= ageLimit;
        //        }

        // 2 Predicate
        Predicate<Map.Entry<String, Integer>> agePredicate2;
        if ("younger".equals(condition)) {
            agePredicate2 = entry -> entry.getValue() <= ageLimit;
        } else {
            agePredicate2 = entry -> entry.getValue() >= ageLimit;
        }

        // 3 Consumer
        Consumer<Map.Entry<String, Integer>> print;
        if ("name".equals(printFormat)) {
            print = entry -> System.out.println(entry.getKey());
        } else if ("age".equals(printFormat)) {
            print = entry -> System.out.println(entry.getValue());
        } else {
            print = entry -> System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }

        people.entrySet()
              .stream()
              //.filter(entry -> agePredicate.test(entry.getValue()))
              .filter(agePredicate2)
              .forEach(print);

    }
}
