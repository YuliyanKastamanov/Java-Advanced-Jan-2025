package JavaAdvanced.L09_Iterators_and_Comparators.demo;

import java.util.Iterator;

public class Garage implements Iterable<Car> {

    private Car[] cars;

    public Garage(Car... cars) {
        this.cars = cars;
    }

    @Override
    public Iterator<Car> iterator() {
        return new CarIterator();
    }

    class CarIterator implements Iterator<Car> {
                int index = 0;

                @Override
                public boolean hasNext() {
                    return index < cars.length;
                }

                @Override
                public Car next() {
                    return cars[index++];
                }
    }

    public Iterator<Car> descendingIterator() {
        return new Iterator<Car>() {

            int index = cars.length - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Car next() {
                return cars[index--];
            }
        };
    }

    class DescendingCarIterator implements Iterator<Car>{

        int index = cars.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Car next() {
            return cars[index--];
        }
    }

}
