package JavaAdvanced.L09_Iterators_and_Comparators.demo2;

import java.util.Comparator;

public class CargoComparator implements Comparator<Cargo> {

    @Override
    public int compare(Cargo cargo1, Cargo cargo2) {
        return Integer.compare(cargo1.getLoadCapacity(), cargo2.getLoadCapacity());
    }
}
