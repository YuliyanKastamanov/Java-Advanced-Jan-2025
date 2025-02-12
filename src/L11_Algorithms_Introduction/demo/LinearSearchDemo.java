package L11_Algorithms_Introduction.demo;

public class LinearSearchDemo {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 78, 99, 1, 47, 100};

        int target = 100;

        int result = linearSearch(numbers, target);

        System.out.println(result);
    }

    private static int linearSearch(int[] numbers, int target) {
        for (int number : numbers) {
            if (number == target) {
                return number;
            }
        }
        return -1;
    }
}
