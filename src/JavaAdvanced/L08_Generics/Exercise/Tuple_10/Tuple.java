package JavaAdvanced.L08_Generics.Exercise.Tuple_10;

public class Tuple<T, K> {

    private T item1;
    private K item2;

    public Tuple(T element1, K element2) {

        this.item1 = element1;
        this.item2 = element2;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s%n",item1.toString(),item2.toString());
    }
}
