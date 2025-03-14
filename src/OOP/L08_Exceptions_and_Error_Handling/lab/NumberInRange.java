import java.util.Arrays;
import java.util.Scanner;

public class NumberInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        int start = range[0];
        int end = range[1];

        System.out.printf("Range: [%d...%d]\n", start, end);

        boolean isValid = false;
        int validNumber = 0;

        while (!isValid) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                validNumber = number;
                isValid = validateNumber(number, start, end);
            } catch (NumberFormatException | IndexOutOfBoundsException ex) {
                System.out.println("Invalid number: " + input);
            }

        }

        System.out.println("Valid number: " + validNumber);
    }

    private static boolean validateNumber(int number, int start, int end) {
        boolean isValid = number >= start && number <= end;
        if (!isValid) {
            throw new IndexOutOfBoundsException();
        }
        return true;
    }
}
