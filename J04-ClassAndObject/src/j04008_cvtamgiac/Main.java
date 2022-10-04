package j04008_cvtamgiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for (int i = 0; i < t; i++){
            Point p1 =new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 =new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 =new Point(sc.nextDouble(), sc.nextDouble());
            double a = p1.distance(p2);
            double b = p1.distance(p3);
            double c = p2.distance(p3);
            if(a + b > c && a + c > b && c + b > a ) {
                System.out.printf("%.3f\n", a+b+c);
            }
            else{
                System.out.println("INVALID");
            }
        }

    }
}
