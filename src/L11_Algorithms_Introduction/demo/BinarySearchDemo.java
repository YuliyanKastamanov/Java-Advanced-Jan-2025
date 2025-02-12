package L11_Algorithms_Introduction.demo;


public class BinarySearchDemo {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 23, 33, 64, 77, 90};

        int target = 90;

        int index = binarrySearch(numbers, target);

        System.out.println(numbers[index]);

    }

    private static int binarrySearch(int[] numbers, int target) {

        int low = 0;
        int high = numbers.length - 1;
        int step = 0;
        while (low <= high) {
            System.out.println(step++);
            int mid = low + (high - low) / 2;

            if (numbers[mid] == target) {
                return mid;
            }

            if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
