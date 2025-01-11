package _01_Stack_and_Queues.lab;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _07_MathPotato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriorityQueue<String> kidsQueue = new PriorityQueue<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
              .forEach(kidsQueue::offer);

        int rotations = 0;

        while (kidsQueue.size() > 1) {
            String firstKid = kidsQueue.poll();
            rotations++;

            // Ако ротациите са просто число не премахваме детето а го връщаме обратно на опашката
            if (isPrime(rotations)) {
                System.out.printf("Prime %s\n", firstKid);
                kidsQueue.offer(firstKid);
            } else {
                System.out.printf("Removed %s\n", firstKid);
            }
        }

        System.out.printf("Last is %s", kidsQueue.peek());

    }

    private static boolean isPrime(int number) {

        if (number == 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
