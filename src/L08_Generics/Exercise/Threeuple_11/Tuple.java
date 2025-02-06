public class Tuple<T1, T2> {

    protected T1 key;
    protected T2 value;

    public Tuple(T1 key, T2 value) {
        this.key = key;
        this.value = value;
    }

    public T1 getKey() {
        return key;
    }

    public void setKey(T1 key) {
        this.key = key;
    }

    public T2 getValue() {
        return value;
    }

    public void setValue(T2 value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", this.key, this.value);
    }
}