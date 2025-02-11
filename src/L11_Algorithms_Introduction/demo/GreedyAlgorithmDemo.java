package L11_Algorithms_Introduction.demo;

import java.util.Arrays;

public class GreedyAlgorithmDemo {

    public static void main(String[] args) {

        int[] coins = {200, 100, 50, 20, 10, 5, 4, 2, 1};

        int amount = 18;

        int[] result = findMinCoins(coins, amount);
        System.out.println(Arrays.toString(result));


    }

    private static int[] findMinCoins(int[] coins, int amount) {

        Arrays.sort(coins);

        int[] selectedCoins = new int[amount];
        int index = 0;

        for (int i = coins.length - 1; i >= 0; i--) {

            while (amount >= coins[i]) {
                selectedCoins[index] = coins[i];
                index++;
                amount -= coins[i];
            }

        }

        return Arrays.copyOf(selectedCoins, index);
    }
}
