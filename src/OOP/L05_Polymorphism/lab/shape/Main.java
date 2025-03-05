package shape;

public class Main {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 7);
        Shape circle = new Circle(5);

        System.out.println("Rectangle");
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println();

        System.out.println("Circle");
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
