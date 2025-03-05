package shape;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        calculatePerimeter();
        calculateArea();
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    protected void calculatePerimeter() {
        double perimeter = (this.height + this.width) * 2;
        super.setPerimeter(perimeter);
    }

    @Override
    protected void calculateArea() {
        double area = this.height * this.width;
        super.setArea(area);
    }
}
