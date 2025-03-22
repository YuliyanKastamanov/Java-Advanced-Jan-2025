import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import p04_BubbleSortTest.Bubble;

public class BubbleSortUnitTest {

    @Test
    public void whenProvideUnSortedArrayOfNumbers_thenOrderTheArray(){

        int[] numbers = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

        Bubble.sort(numbers);

        int[] sortedNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Assertions.assertArrayEquals(numbers, sortedNumbers);



    }



}
