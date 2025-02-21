package OOP.L01_WorkingWithAbstraction.lab.P2PointInRectangle;

public class Rectangle {

    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
    }

    public boolean contains(Point point) {

        boolean isXInside = point.getX() >= bottomLeft.getX() &&
                            point.getX() <= topRight.getX();

        boolean isYInside = point.getY() >= bottomLeft.getY() &&
                            point.getY() <= topRight.getY();

        return isXInside && isYInside;
    }
}
