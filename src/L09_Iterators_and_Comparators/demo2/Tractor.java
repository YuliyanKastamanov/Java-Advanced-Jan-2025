package L09_Iterators_and_Comparators.demo2;

public class Tractor implements Cargo {

    private int loadCapacity;

    public Tractor(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "Tractor{" +
               "loadCapacity=" + loadCapacity +
               '}';
    }
}
