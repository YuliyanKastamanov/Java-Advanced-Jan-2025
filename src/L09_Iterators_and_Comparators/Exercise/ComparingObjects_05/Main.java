package L09_Iterators_and_Comparators.Exercise.ComparingObjects_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")){

            //"{name} {age} {town}
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);
            String town = input.split(" ")[2];

            Person currentPerson = new Person(name, age, town);
            people.add(currentPerson);
            input = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine()) - 1;

        //намираме нашия специален човек, с който ще сравняваме
        Person specialPerson = people.get(index);

        int equalPeople = 0;

        for (Person person : people){
            if(person.compareTo(specialPerson) == 0){
                equalPeople++;
            }
        }

        if(equalPeople == 1){
            System.out.println("No matches");
        }else {
            System.out.printf("%d %d %d", equalPeople, people.size() - equalPeople, people.size());

        }




    }
}
