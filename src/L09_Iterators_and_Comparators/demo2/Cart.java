package L09_Iterators_and_Comparators.demo2;

// каруца
public class Cart implements Cargo {

    private int loadCapacity;

    public Cart(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "Cart{" +
               "loadCapacity=" + loadCapacity +
               '}';
    }
}
