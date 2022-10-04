package j04019;

public class Triangle {
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Boolean valid() {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);
        if(a + b > c && a + c > b && c + b > a )
            return true;
        return false;
    }

    public double getPerimeter() {

        return (double) Math.round((p1.distance(p2) + p1.distance(p3) + p2.distance(p3)) * 1000) / 1000;
    }
}
