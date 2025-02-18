package JavaAdvanced.L08_Generics.lab;

import JavaAdvanced.L08_Generics.lab.jar.Jar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List strings = new ArrayList<>();

        Box<Integer> box = new Box();

        box.add(1);
        box.add(2);
        box.add(3);
        box.add(4);
        box.add(5);

        box.printPowerOf2();

        //box.getData().forEach(System.out::println);
        //System.out.println(box.remove(3));

        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Kaloyan", "Peter", "Ivan", "Maria", "Kamelia"};

//        printArray(numbers);
//        System.out.println();
//        printArray(names);

        strings.add(box);
        strings.add(new Jar());
        strings.add("kaloyan");
        strings.add(4456);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + ", ");
        }
    }
}
