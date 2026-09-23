package Part1;

public class Point {

    private double x;
    private double y;

    // Constructs a Point with the given x and y coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Returns this point's x coordinate
    public double getX() {
        return x;
    }

    // Returns this point's y coordinate
    public double getY() {
        return y;
    }

    // Sets this point's x coordinate
    public void setX(double x) {
        this.x = x;
    }

    // Sets this point's y coordinate
    public void setY(double y) {
        this.y = y;
    }

    // Returns a new Point rotated 90 degrees from this one (x becomes -y, y becomes x)
    public Point rotate() {
        double newX = -this.y;
        double newY = this.x;
        return new Point(newX, newY);
    }
}