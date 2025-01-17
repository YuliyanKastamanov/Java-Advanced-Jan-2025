package L03_Sets_and_Dictionaries_Advanced.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        Map<String, String> phonebook = new HashMap<>();


        while (!data.equals("search")){
            String currentName = data.split("-")[0];
            String currentPhoneNumber = data.split("-")[1];

            phonebook.put(currentName, currentPhoneNumber);


            data = scanner.nextLine();
        }

        String name = scanner.nextLine();

        while (!name.equals("stop")){

            if (phonebook.containsKey(name)) {
                System.out.printf("%s -> %s%n", name, phonebook.get(name));
            }else {
                System.out.printf("Contact %s does not exist.%n", name);
            }


            name = scanner.nextLine();
        }

    }
}
