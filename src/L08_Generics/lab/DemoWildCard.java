package L08_Generics.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoWildCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Number> numbers2 = List.of(1, 2, 3, 4, 5);
        List<Double> doubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        List<String> numsFake = List.of("1");

        List<Object> objectList = new ArrayList<>();

        printPowerOf2(numbers);
        printPowerOf2(doubles);
        printPowerOf2(numbers2);
//        printPowerOf2(numsFake);

//        print(numbers);
        print(numbers2);
        print(objectList);
    }

    // Приемат се generic types които са деца на Number или самия Number
    public static void printPowerOf2(List<? extends Number> numbers) {
        numbers.forEach(n -> {
            int num = (int) n;
            System.out.println(num * num);
        });
    }
    // Приемат се generic types които родители на Number или самия Number
    public static void print(List<? super Number> numbers) {
        numbers.forEach(System.out::println);
    }

    //Принтира всички видове листове
    public static void printUnknownType(List<?> list){
        list.forEach(System.out::println);
    }
}
