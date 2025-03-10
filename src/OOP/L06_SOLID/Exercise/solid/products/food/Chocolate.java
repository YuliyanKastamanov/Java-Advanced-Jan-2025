package OOP.L06_SOLID.Exercise.solid.products.food;

import OOP.L06_SOLID.Exercise.solid.products.Product;

public class Chocolate implements Food {

    public static final double CALORIES_PER_100_GRAMS = 575.0;

    private double grams;

    public Chocolate(double grams) {
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }

    @Override
    public double getCalories() {
        return (CALORIES_PER_100_GRAMS / 100) * getGrams();
    }

    @Override
    public double getKilograms() {
        return grams / 1000;
    }
}
