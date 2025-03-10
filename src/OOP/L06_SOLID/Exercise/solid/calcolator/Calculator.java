package OOP.L06_SOLID.Exercise.solid.calcolator;

import OOP.L06_SOLID.Exercise.solid.products.Product;

import java.util.List;

public interface Calculator {
    double sum(List<Product> products);
    double average(List<Product> products);
}
