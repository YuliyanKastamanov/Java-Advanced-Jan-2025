package JavaAdvanced.L08_Generics.lab.array_creator;

import java.lang.reflect.Array;

public class ArrayCreator {

    // static T[] create(int length, T item)
    // static T[] create(Class<T> class, int length, T item)

    public static <T> T[] create(int length, T item) {

        T[] array = (T[]) Array.newInstance(item.getClass(), length);

        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }

        return array;
    }

    public static <T> T[] create(Class<T> clazz, int length, T item) {

        T[] array = (T[]) Array.newInstance(clazz, length);

        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }

        return array;
    }
}
