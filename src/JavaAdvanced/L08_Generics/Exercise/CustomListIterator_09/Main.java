package JavaAdvanced.L08_Generics.Exercise.CustomListIterator_09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> list = new CustomList<>();

        String line = "" ;
        while (!(line = scanner.nextLine()).equals("END")) {
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "Add":
                    list.add(tokens[1]);
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(list.contains(tokens[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThen(tokens[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    for (String s : list) {
                        System.out.println(s);
                    }
                    break;
                case "Sort":
                    Sorter.sort(list);
                    break;
            }
        }
    }
}