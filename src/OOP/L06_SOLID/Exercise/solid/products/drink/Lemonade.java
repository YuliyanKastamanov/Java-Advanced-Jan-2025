package OOP.L06_SOLID.Exercise.solid.products.drink;

import OOP.L06_SOLID.Exercise.solid.products.Product;

public class Lemonade implements Drink {

    public static final double CALORIES_PER_100_GRAMS = 53.0;
    public static final double DENSITY = 0.7;

    private double milliliters;

    public Lemonade(double milliliters) {
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }

    @Override
    public double getCalories() {
        double grams = getMilliliters() * DENSITY;
        return  (CALORIES_PER_100_GRAMS / 100) * grams;
    }

    @Override
    public double getKilograms() {
        return  (milliliters / 1000) * DENSITY;
    }
}
