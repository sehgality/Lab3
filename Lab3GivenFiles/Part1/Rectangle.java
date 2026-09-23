package Part1;

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
}