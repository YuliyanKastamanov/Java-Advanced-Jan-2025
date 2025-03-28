package composite;

public class Demo {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        CompositeGraphic compositeGraphic = new CompositeGraphic();

        compositeGraphic.addGraphic(circle);
        compositeGraphic.addGraphic(rectangle);

        compositeGraphic.draw();
    }
}
