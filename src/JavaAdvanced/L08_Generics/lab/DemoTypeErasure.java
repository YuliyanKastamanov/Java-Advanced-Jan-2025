package JavaAdvanced.L08_Generics.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoTypeErasure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        System.out.println(list instanceof List);
        System.out.println(list instanceof List<String>);
    }
}
