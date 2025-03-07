package OOP.L03_Inheritance.Exercise.Restaurant;

import java.math.BigDecimal;

public class MainDish extends Food{
    public MainDish(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
