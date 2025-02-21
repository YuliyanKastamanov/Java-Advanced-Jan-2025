package task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            try {
                people.add(new Person(input[0],
                                      input[1],
                                      Integer.parseInt(input[2]),
                                      Double.parseDouble(input[3])));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
//        double bonus = Double.parseDouble(reader.readLine());
//        for (Person person : people) {
//            person.increaseSalary(bonus);
//            System.out.println(person.toString());
//        }

        Team team = new Team("Black Eagles");

        people.forEach(team::addPlayer);

        System.out.printf("First team have %d players\n" +
                          "Reserve team have %d players\n",
                          team.getFirstTeam().size(),
                          team.getReserveTeam().size());
    }

}
