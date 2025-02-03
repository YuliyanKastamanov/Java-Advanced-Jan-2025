package L08_Generics.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product<String> productNames = new Product<>();

        productNames.printProductInfo("Orange", "Banana");

        Product<Double> productPrice = new Product<>();

        productPrice.printProductInfo(5.50, 4.30);


        List<Integer> numbers = new ArrayList<>();





    }
}
