package L08_Generics.Exercise.CustomListIterator_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    private List<T> list;
    public int size;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.size++;
        list.add(element);
    }

    public T remove(int index) {
        if (isNotInRange(index)) {
            return null;
        }
        this.size--;
        return list.remove(index);
    }

    public boolean contains(T element) {
        return list.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        if (isNotInRange(firstIndex) || isNotInRange(secondIndex)) {
            System.out.println("FirstIndex/SecondIndex is not a valid index!");
        } else {
            T firstElement = list.get(firstIndex);
            T secondElement = list.get(secondIndex);

            this.list.set(firstIndex, secondElement);
            this.list.set(secondIndex, firstElement);
        }
    }

    public int countGreaterThen(T element) {
        int count = 0;
        for (T t : list) {
            if (t.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        T max = this.list.get(0);

        for (T current : this.list) {
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }

    public T getMin() {
        T min = this.list.get(0);

        for (T current : this.list) {
            if (current.compareTo(min) < 0) {
                min = current;
            }
        }
        return min;
    }

    public T get(int index) {
        if (isNotInRange(index)) {
            System.out.println("Index is not valid");
            return null;
        }
        return this.list.get(index);
    }

    private boolean isNotInRange(int index) {
        return index < 0 || index >= this.list.size();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                //referira kym nov obekt
                return index < list.size();
            }

            @Override
            public T next() {
                return list.get(index++);
            }
        };
    }
}
