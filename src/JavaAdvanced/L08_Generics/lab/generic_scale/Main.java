package JavaAdvanced.L08_Generics.lab.generic_scale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scale<Integer> scale = new Scale<>(7, 7);
        System.out.println(scale.getHeavier());
    }
}
