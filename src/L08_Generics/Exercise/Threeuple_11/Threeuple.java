public class Threeuple<T1, T2, T3> extends Tuple {

    private T3 threeUple;

    public Threeuple(T1 key, T2 value, T3 threeUple) {
        super(key, value);
        this.threeUple = threeUple;
    }

    public T3 getThreeUple() {
        return threeUple;
    }

    public void setThreeUple(T3 threeUple) {
        this.threeUple = threeUple;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", this.key, this.value, this.threeUple);
    }
}
