package ranndom_array_list;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        RandomArrayList<String> names = new RandomArrayList<>();
        names.add("Kaloyan");
        names.add("Peter");
        names.add("Martin");
        names.add("Ivan");
        names.add("Anna");

        System.out.println(names.getRandomElement());
        System.out.println(names.getRandomElement());
        System.out.println(names.getRandomElement());
        System.out.println(names.getRandomElement());
        System.out.println(names.getRandomElement());

        System.out.println(names.getRandomElement());
    }
}
