package L08_Generics.lab;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number> implements BoxInterface<T> {

    private List<T> data;
    private T someField;


    public Box() {
        this.data = new ArrayList<>();
    }

    public void add(T item) {
        this.data.add(item);
    }

    public List<T> getData() {
        return data;
    }

    public void printPowerOf2() {
        this.data.forEach(n -> System.out.println(n.intValue() * n.intValue()));
    }

    @Override
    public T remove(T element) {
        T elementToReturn = this.data.stream()
                                     .filter(e -> e.equals(element))
                                     .findFirst()
                                     .orElse(null);

        this.data.remove(element);

        return elementToReturn;
    }
}
