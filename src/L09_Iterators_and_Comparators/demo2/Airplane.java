package L09_Iterators_and_Comparators.demo2;

public class Airplane implements Cargo {

    //TODO add other fields

    private int loadCapacity;

    public Airplane(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "Airplane{" +
               "loadCapacity=" + loadCapacity +
               '}';
    }
}
