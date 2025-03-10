package OOP.L06_SOLID.Exercise.solid;

import OOP.L06_SOLID.Exercise.solid.calcolator.Calculator;
import OOP.L06_SOLID.Exercise.solid.calcolator.CalorieCalculator;
import OOP.L06_SOLID.Exercise.solid.calcolator.QuantityCalculator;
import OOP.L06_SOLID.Exercise.solid.printer.Printer;

public class Main {

    public static void main(String[] args) {

        Calculator calorieCalculator = new CalorieCalculator();
        Calculator quantityCalculator = new QuantityCalculator();

        Printer printCalories = new Printer(calorieCalculator);
        Printer printQuantity = new Printer(quantityCalculator);


        /*printer.printAverage();
        printer.printSum();*/



    }
}
