package j04008v2;

public class TamGiac {
    private double a, b, a1, b1, a2, b2;

    public TamGiac(double a, double b, double a1, double b1, double a2, double b2) {
        this.a = a;
        this.b = b;
        this.a1 = a1;
        this.b1 = b1;
        this.a2 = a2;
        this.b2 = b2;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getA1() {
        return a1;
    }

    public double getB1() {
        return b1;
    }

    public double getA2() {
        return a2;
    }

    public double getB2() {
        return b2;
    }

    public double distance(double a, double b, double c, double d) {
        return Math.sqrt(Math.pow((a-c),2)+Math.pow((b-d),2));
     }
    public double chuVi() {
        double m = distance(a, b, a1, b1);
        double n = distance(a, b, a2, b2);
        double g = distance(a2, b2, a1, b1);
        if(m +n > g && m +g > n && g +n > m){
            System.out.printf("%.3f", m+n+g);
        }
        else{
            System.out.println("INVALID");
        }
        return  0;
    }
}
