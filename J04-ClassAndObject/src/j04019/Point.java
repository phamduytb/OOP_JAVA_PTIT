package j04019;

import java.util.Scanner;

public class Point {
    private double x, y;

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

    public static Point nextPoint(Scanner sc) {
       return new Point(sc.nextDouble(), sc.nextDouble());
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((x - p.x),2) + Math.pow((y - p.y),2));
    }
}
