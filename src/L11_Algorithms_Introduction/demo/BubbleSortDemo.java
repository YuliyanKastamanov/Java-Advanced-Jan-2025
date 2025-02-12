package L11_Algorithms_Introduction.demo;

import java.util.Arrays;

public class BubbleSortDemo {

    public static void main(String[] args) {

        int[] array = {64, 33, 23, 10, 77, 90, 5};

        bubbleSort(array);

        System.out.println(Arrays.toString(array));

    }

    private static void bubbleSort(int[] array) {

        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }


    }
}
