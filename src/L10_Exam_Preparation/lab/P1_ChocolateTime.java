package L10_Exam_Preparation.lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.Map;
import java.util.Scanner;

public class P1_ChocolateTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Double> milkQueue = new ArrayDeque<>();
        Deque<Double> cacaoStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
              .map(Double::parseDouble)
              .forEach(milkQueue::offer);

        Arrays.stream(scanner.nextLine().split("\\s+"))
              .map(Double::parseDouble)
              .forEach(cacaoStack::push);

        int milkChocolate = 0;
        int darkChocolate = 0;
        int backingChocolate = 0;

        // You need to stop producing chocolates when you run out of milk or cacao powder values.
        while (!milkQueue.isEmpty() && !cacaoStack.isEmpty()) {
            double milk = milkQueue.peek();
            double cacao = cacaoStack.peek();
            // (cacao / milk + cacao) * 100
            double chocolatePercentage = cacao / (milk + cacao) * 100;

            if (chocolatePercentage == 30) {
                milkChocolate++;
                milkQueue.poll();
                cacaoStack.pop();
            } else if (chocolatePercentage == 50) {
                darkChocolate++;
                milkQueue.poll();
                cacaoStack.pop();
            } else if (chocolatePercentage == 100) {
                backingChocolate++;
                milkQueue.poll();
                cacaoStack.pop();
            } else {
                cacaoStack.pop();
                milk += 10;
                milkQueue.poll();
                milkQueue.offer(milk);
            }
        }

        Map<String, Integer> chocolatesMap = Map.of("Milk Chocolate", milkChocolate,
                                                    "Dark Chocolate", darkChocolate,
                                                    "Baking Chocolate", backingChocolate);

        if (milkChocolate > 0 && darkChocolate > 0 && backingChocolate > 0) {
            System.out.print("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.print("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        chocolatesMap.entrySet()
                     .stream()
                     .filter(entry -> entry.getValue() != 0)
                     .sorted(Comparator.comparing(Map.Entry::getKey))
                     .forEach(entry -> {
                         System.out.println();
                         System.out.printf("# %s --> %d", entry.getKey(), entry.getValue());
                     });

    }
}
