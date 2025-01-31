package L08_Generics.lab.list_utils;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = List.of(12, 45, 89, 78, 100);

        System.out.println(ListUtils.getMin(list));
        System.out.println(ListUtils.getMax(list));
    }
}
