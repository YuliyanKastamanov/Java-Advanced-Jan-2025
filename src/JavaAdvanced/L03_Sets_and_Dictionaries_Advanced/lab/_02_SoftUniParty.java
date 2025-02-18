package JavaAdvanced.L03_Sets_and_Dictionaries_Advanced.lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _02_SoftUniParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        String input = scanner.nextLine();

        while (!"PARTY".equals(input)) {

            char symbol = input.charAt(0);

            if (Character.isDigit(symbol)) {
                vip.add(input);
            } else {
                regular.add(input);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!"END".equals(input)) {

            vip.remove(input);
            regular.remove(input);

            input = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());
        vip.forEach(System.out::println);
        regular.forEach(System.out::println);
    }
}
