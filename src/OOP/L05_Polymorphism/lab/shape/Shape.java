package shape;

public abstract class Shape {

    private double perimeter;
    private double area;

    public double getPerimeter() {
        return perimeter;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    protected abstract void calculatePerimeter();
    protected abstract void calculateArea();
}
