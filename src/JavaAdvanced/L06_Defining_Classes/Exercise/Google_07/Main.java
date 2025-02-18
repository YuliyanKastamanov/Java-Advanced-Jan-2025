package JavaAdvanced.L06_Defining_Classes.Exercise.Google_07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        HashMap<String, Person> people = new HashMap<>();

        while (!input.equals("End")){
            String[] tokens = input.split("\\s+");

            String name = tokens[0];
            String command = tokens[1];

            if(!people.containsKey(name)){
                people.put(name, new Person(name));
            }

            switch (command){
                case "company":
                    Company company = initCompany(Arrays.asList(tokens).subList(2, 5));
                    people.get(name).setCompany(company);
                    break;
                case "pokemon":
                    people.get(name).addPokemon(
                            new Pokemon(tokens[2], tokens[3])
                    );
                    break;
                case "parents":
                    people.get(name).addParent(
                            new Parent(tokens[2], tokens[3])
                    );
                    break;
                case "children":
                    people.get(name).addChild(
                            new Child(tokens[2], tokens[3])
                    );
                    break;
                case "car":
                    people.get(name).setCar(new Car(tokens[2], Integer.parseInt(tokens[3])));
                    break;
            }

            input = scanner.nextLine();
        }

        String name = scanner.nextLine();

        System.out.println(people.get(name).toString());

    }

    private static Company initCompany(List<String> data) {
        return
                new Company(data.get(0),
                        data.get(1),
                        Double.parseDouble(data.get(2)));
    }
}
