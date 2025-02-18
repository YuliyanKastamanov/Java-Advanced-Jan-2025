package JavaAdvanced.L08_Generics.Exercise.GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //Задача 1

        /*Box<String> box = new Box<>();
        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            box.add(input);

        }
        System.out.println(box);
        */

        //Задача 2
        /*Box<Integer> box = new Box<>();
        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            box.add(number);
        }
        System.out.println(box);*/


        //Задача 3
        /*Box<String> box = new Box<>();
        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            box.add(input);

        }
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        box.swap(index1, index2);
        System.out.println(box);*/

//Задача 4
        /*Box<Integer> box = new Box<>();
        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            box.add(number);

        }
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        box.swap(index1, index2);
        System.out.println(box);*/


        //Задача 5
        /*Box<String> box = new Box<>();
        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            box.add(input);
        }

        String elementToCompare = scanner.nextLine();
        System.out.println(box.countGreaterElements(elementToCompare));*/

        //Задача 6
        Box<Double> box = new Box<>();
        for (int i = 1; i <= n ; i++) {
            double number = Double.parseDouble(scanner.nextLine());;
            box.add(number);

        }

        double elementToCompare = Double.parseDouble(scanner.nextLine());;
        System.out.println(box.countGreaterElements(elementToCompare));


    }
}
