package open_closed;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public final double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }
}
