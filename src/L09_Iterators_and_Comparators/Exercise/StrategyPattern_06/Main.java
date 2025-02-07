package L09_Iterators_and_Comparators.Exercise.StrategyPattern_06;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<Person> orderedByName = new TreeSet<>(new ComparatorByName());
        Set<Person> orderedByAge = new TreeSet<>(new ComparatorByAge());


        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
           /* String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);
            Person currentPerson = new Person(name, age);*/

            Person currentPerson = new Person(input.split(" ")[0], Integer.parseInt(input.split(" ")[1]));
            orderedByName.add(currentPerson);
            orderedByAge.add(currentPerson);
        }

        orderedByName.forEach(System.out::println);
        orderedByAge.forEach(System.out::println);
    }
}
