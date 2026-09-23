package Part2;

import Part1.Point;

public class Circle {

    private Point center;
    private double radius;

    // Constructs a Circle with the given center point and radius
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Returns this circle's center point
    public Point getCenter() {
        return center;
    }

    // Returns this circle's radius
    public double getRadius() {
        return radius;
    }

    // Returns the circumference of this circle
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Returns the area of this circle
    public double area() {
        return Math.PI * radius * radius;
    }
}