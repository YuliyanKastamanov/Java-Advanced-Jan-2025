package L08_Generics.Exercise.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        //•	Print - Prints all elements in the list, each on a separate line.

        CustomList<String> customList = new CustomList<>();
        while (!command.equals("END")){
            String[] tokens = command.split("\\s+");
            switch (tokens[0]){
                //•	Add {element} - Adds the given element to the end of the list.
                case "Add" -> customList.add(tokens[1]);

                //•	Remove {index} - Removes the element at the given index.
                case "Remove" -> customList.remove(Integer.parseInt(tokens[1]));

                //•	Contains {element} - Prints if the list contains the given element (true or false).
                case "Contains" -> System.out.println(customList.contains(tokens[1]));

                //•	Swap {index1} {index2} - Swaps the elements at the given indexes.
                case "Swap" -> customList.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));

                //•	Greater {element} - Counts the elements that are greater than the given element and prints their count
                case "Greater" -> System.out.println(customList.countGreaterThan(tokens[1]));

                //•	Max - Prints the maximum element in the list.
                case "Max" -> System.out.println(customList.getMax());

                //•	Min - Prints the minimum element in the list.
                case "Min" -> System.out.println(customList.getMin());

                //•	Print - Prints all elements in the list, each on a separate line.
                case "Print" -> {
                    for (int i = 0; i < customList.size; i++) {
                        System.out.println(customList.get(i));
                    }
                }

                //•	Sort - Sort the elements in the list in ascending order
                case "Sort" -> customList.sort();

            }
            command = scanner.nextLine();

        }



    }
}
