package shape;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculatePerimeter();
        calculateArea();
    }

    public final double getRadius() {
        return radius;
    }

    @Override
    protected void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        super.setPerimeter(perimeter);
    }

    @Override
    protected void calculateArea() {
        double area = Math.PI * radius * radius;
        super.setArea(area);
    }
}
