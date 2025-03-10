package OOP.L06_SOLID.Exercise.solid.calcolator;

import OOP.L06_SOLID.Exercise.solid.products.Product;

import java.util.List;

public class QuantityCalculator implements Calculator{


    @Override
    public double sum(List<Product> products) {
        double sum = 0;
        for (Product product: products){
            sum += product.getKilograms();
        }
        return sum;
    }

    @Override
    public double average(List<Product> products) {
        return sum(products) / products.size();
    }
}
