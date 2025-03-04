package OOP.L04_Interfaces_and_Abstraction.Exercise.Demo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Margaritha("my pizza", 15);
        System.out.println(pizza1.getIngredients());


        Payable payable = new CardPayment();
        payable.pay();

        List<String> list = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        Set<String> set = new TreeSet<>();
    }
}
