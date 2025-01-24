package L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(number -> Integer.parseInt(number))
                .collect(Collectors.toList());

        //comparator -> function приема 2 елемента и връща цяло число -> (0, 1, -1)
        //0 -> първия елемент == втория елемент
        //1 -> първия елемент > втория елемент
        //-1 > първия елемент < втория елемент

        //sorted(0) -> не разменя местата на елементите
        //sorted(1) -> разменя елементите
        //sorted(-1) -> не разменя местата

        //2 0 3 5 4
        // comparator(2, 0) -> 1 sorted(1) -> разменя 2 и 0 -> 0 2 3 5 4
        // comparator(2, 3) -> -1 sorted(-1) -> не разменя 2 и 3 -> 0 2 3 5 4
        // comparator(3, 5) -> -1 sorted(-1) -> не разменя 3 и 5 -> 0 2 3 5 4
        // comparator(5, 5) -> 1 sorted(1) -> разменя 5 и 4 -> 0 2 3 4 5

        //ляво -> четно, дясно -> нечетно
        Comparator<Integer> customComparator = ((first, second) -> {

            //(2, 3)
            //първо четно, второ нечетно -> не разменяме
            if(first % 2 == 0 && second % 2 != 0){
                return  -1;
            }
            //първо нечетно, второ четно -> разменяме: (3, 2)
            else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            }
            //първо четно, второ четно -> (2, 4), (4, 2)
            //първо нечетно, второ нечетно -> (1, 3), (3, 1)
            else {
                return first.compareTo(second);

            }


        });

        numbers.stream().sorted(customComparator).forEach(number -> System.out.print(number + " "));










    }
}
