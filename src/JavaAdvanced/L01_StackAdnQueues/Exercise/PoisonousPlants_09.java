package JavaAdvanced.L01_StackAdnQueues.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class PoisonousPlants_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] tokens = reader.readLine().split(" ");
        int[] plants = new int[n];
        for (int i = 0; i < n; i++) {
            plants[i] = Integer.parseInt(tokens[i]);
        }
        Deque<Integer> indices = new ArrayDeque<>();
        indices.push(0);
        int[] days = new int[n];
        for (int i = 1; i < n; i++) {
            int maxDays = 0;
            while (!indices.isEmpty() && plants[indices.peek()] >= plants[i]) {
                maxDays = Math.max(maxDays, days[indices.pop()]);
            }
            if (!indices.isEmpty()) {
                days[i] = maxDays + 1;
            }
            indices.push(i);
        }
        System.out.println(getLastDay(days));
    }

    private static int getLastDay(int[] days) {
        int lastDay = 0;
        for (int day : days) {
            if (day > lastDay) {
                lastDay = day;
            }
        }
        return lastDay;
    }
}

