package Part2;

import Part1.Point;

public class Rectangle {

    private Point topLeft;
    private Point bottomRight;

    // Constructs a Rectangle with the given top-left and bottom-right corners
    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Returns this rectangle's top-left corner
    public Point getTopLeft() {
        return topLeft;
    }

    // Returns this rectangle's bottom-right corner
    public Point getBottomRight() {
        return bottomRight;
    }

    // Returns the perimeter of this rectangle
    public double perimeter() {
        double width = Math.abs(bottomRight.getX() - topLeft.getX());
        double height = Math.abs(bottomRight.getY() - topLeft.getY());
        return 2 * (width + height);
    }

    // Returns the area of this rectangle
    public double area() {
        double width = Math.abs(bottomRight.getX() - topLeft.getX());
        double height = Math.abs(bottomRight.getY() - topLeft.getY());
        return width * height;
    }
}