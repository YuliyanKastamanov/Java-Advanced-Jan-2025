package L08_Generics.lab.generic_scale;

public class Scale<T extends Comparable<T>> {

    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        int result = left.compareTo(right);
        // 0, 1, -1
        // 0 = двата обекта са равни
        // 1 или положително число когато първият обект е по-голям от втория
        // -1 или отрицателно число когато първият вторият е по-голям от първия

        if (result == 0) {
            return null;
        } else if (result >= 1) {
            return left;
        } else {
            return right;
        }
    }
}
