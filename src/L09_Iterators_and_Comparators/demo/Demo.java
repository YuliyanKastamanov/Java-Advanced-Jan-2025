package L09_Iterators_and_Comparators.demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {

        Car bmw = new Car("BMW", 300);
        Car audi = new Car("Audi", 105);
        Car opel = new Car("OPEL", 150);

        Car mazda = new Car("Mazda", 200);
        Car kia = new Car("KIA", 75);
        Car honda = new Car("Honda", 185);

        System.out.println(bmw.compareTo(audi));

        List<Car> cars = List.of(bmw, audi, opel, mazda, kia, honda);

        cars.stream()
            .sorted(Comparator.naturalOrder())
            .forEach(System.out::println);

        CarComparator carComparator = new CarComparator();
        TreeSet<Car> treeSetCars = new TreeSet<>(carComparator);
        treeSetCars.addAll(cars);

        //        treeSetCars.forEach(System.out::println);

        //        System.out.println(carComparator.compare(mazda, audi));
        //        System.out.println(CarComparator.carComparator.compare(bmw, audi));


        Spliterator<Car> spliterator = cars.spliterator();
        Spliterator<Car> carSpliterator = spliterator.trySplit();

        //        spliterator.forEachRemaining(System.out::println);
        //        System.out.println("=================");
        //        carSpliterator.forEachRemaining(System.out::println);

        Garage garage = new Garage(bmw, audi, opel, mazda, kia, honda);

        Iterator<Car> carIterator = garage.iterator();

        //        while (carIterator.hasNext()) {
        //            System.out.println(carIterator.next());
        //        }

        System.out.println();
        Iterator<Car> descendingCarIterator = garage.descendingIterator();

        //        while (descendingCarIterator.hasNext()) {
        //            System.out.println(descendingCarIterator.next());
        //        }

        //        for (Car car : garage) {
        //            System.out.println(car);
        //        }

    }

    static int sumNumbers(int a, int b, int... nums) {
        int sum = a + b;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
