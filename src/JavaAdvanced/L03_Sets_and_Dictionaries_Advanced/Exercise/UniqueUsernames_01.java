package JavaAdvanced.L03_Sets_and_Dictionaries_Advanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfUsernames = Integer.parseInt(scanner.nextLine());

        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 1; i <= numberOfUsernames ; i++) {

            String currentUsername = scanner.nextLine();
            usernames.add(currentUsername);
        }

        for (String name : usernames){

            System.out.println(name);
        }




    }
}
