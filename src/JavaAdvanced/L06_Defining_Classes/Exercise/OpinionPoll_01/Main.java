package JavaAdvanced.L06_Defining_Classes.Exercise.OpinionPoll_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            if (age > 30){
                Person person = new Person(name, age);
                people.add(person);
            }

        }

        people.sort(Comparator.comparing(entry -> entry.getName()));
        people.forEach(person -> System.out.println(person.toString()));

    }
}
