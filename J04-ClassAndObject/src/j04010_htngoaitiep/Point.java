package j04010_htngoaitiep;

public class Point {
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

//    tạo đối tượng là bản sao của đối tượng trong tham số
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((this.x - p.x),2) + Math.pow((this.y - p.y),2));
    }

    public double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y),2));
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double dt(Point p1, Point p2, Point p3) {
        double a = distance(p1, p2);
        double b = distance(p1, p3);
        double c = distance(p3, p2);
        return 0.25 * Math.sqrt((a + b +c) * (a + b -c) * (c +b -a) * (a +c -b));
    }

    public double tron(Point p1, Point p2, Point p3) {
        double a = distance(p1, p2);
        double b = distance(p1, p3);
        double c = distance(p3, p2);
        double r = (a * b *c) / (4 * dt(p1, p2, p3));
        return Math.PI * r * r;
    }
     public Boolean check(Point p1, Point p2, Point p3) {
         double a = distance(p1, p2);
         double b = distance(p1, p3);
         double c = distance(p3, p2);
         if(a +b > c && a +c > b && c + b > a) {
             return true;
         }
         return false;
     }
}
