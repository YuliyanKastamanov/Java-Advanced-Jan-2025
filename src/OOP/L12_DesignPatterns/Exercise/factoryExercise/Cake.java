package OOP.L12_DesignPatterns.Exercise.factoryExercise;


public class Cake implements CakeInterface {
    public double diameter;
    public double price;
    public int pieces;

    public Cake(double diameter, double price, int pieces) {
        this.diameter = diameter;
        this.price = price;
        this.pieces = pieces;
    }

    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void box() {

    }
}