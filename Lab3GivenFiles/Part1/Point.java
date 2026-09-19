package Part1;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // non-static: rotates THIS point and returns a new Point
    public Point rotate() {
        double newX = -this.y;
        double newY = this.x;
        return new Point(newX, newY);
    }
}