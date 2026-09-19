package Part2;

import Part1.Point;
import Part1.Circle;
import Part1.Rectangle;

import java.util.ArrayList;

public class Part2ShapeDriver {

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(0, 0), 2.0);
        circles[1] = new Circle(new Point(1, 1), 5.0);
        circles[2] = new Circle(new Point(-3, 4), 1.5);

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(new Point(0, 5), new Point(4, 0));
        rectangles[1] = new Rectangle(new Point(-2, 3), new Point(2, -1));
        rectangles[2] = new Rectangle(new Point(1, 1), new Point(6, -4));

        ArrayList<Double> computedList = new ArrayList<>();

        for (Circle c : circles) {
            computedList.add(c.perimeter());
            computedList.add(c.area());
        }

        for (Rectangle r : rectangles) {
            computedList.add(r.perimeter());
            computedList.add(r.area());
        }

        double[] result = smallLarge(computedList);
        System.out.println("Smallest computed value: " + result[0]);
        System.out.println("Largest computed value: " + result[1]);
    }

    public static double[] smallLarge(ArrayList<Double> computedList) {
        double smallest = computedList.get(0);
        double largest = computedList.get(0);

        for (double value : computedList) {
            if (value < smallest) {
                smallest = value;
            }
            if (value > largest) {
                largest = value;
            }
        }

        return new double[] {smallest, largest};
    }
}