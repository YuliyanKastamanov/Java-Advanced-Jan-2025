package L08_Generics.Exercise.CustomListIterator_09;

public class Sorter{
    public static<T extends Comparable<T>> void sort(CustomList<T> list) {
        for (int i = 0; i < list.size; i++) {
            T current = list.get(i);
            for (int j = i + 1; j < list.size; j++) {
                T target = list.get(j);
                if (current.compareTo(target) > 0) {
                    list.swap(i, j);
                }
            }
        }
    }
}
