package L09_Iterators_and_Comparators.demo;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    static Comparator<Car> carComparator = ((car1, car2) -> {
        return Integer.compare(car1.getHorsePower(), car2.getHorsePower());
    });

    static Comparator<Car> carComparator2 = ((car1, car2) -> {
        return car1.getModel().compareTo(car2.getModel());
    });

    @Override
    public int compare(Car car1, Car car2) {

//        if (car1.getHorsePower() > car2.getHorsePower()) {
//            return 1;
//        } else if (car2.getHorsePower() > car1.getHorsePower()) {
//            return -1;
//        }
//        return 0;

        return Integer.compare(car1.getHorsePower(), car2.getHorsePower());
    }
}
