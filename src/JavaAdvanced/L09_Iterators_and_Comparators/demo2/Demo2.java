package JavaAdvanced.L09_Iterators_and_Comparators.demo2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Demo2 {

    public static void main(String[] args) {

        List<Object> arrayList = new ArrayList<>();
        List<Object> linkedList = new LinkedList<>();

        Cargo airplane = new Airplane(500);
        Cargo tractor = new Tractor(150);
        Cargo cart = new Cart(50);

        CargoComparator cargoComparator = new CargoComparator();

        TreeSet<Cargo> treeSet = new TreeSet<>(cargoComparator.reversed());
        treeSet.addAll(List.of(airplane, tractor, cart));

        treeSet.forEach(System.out::println);
    }
}
