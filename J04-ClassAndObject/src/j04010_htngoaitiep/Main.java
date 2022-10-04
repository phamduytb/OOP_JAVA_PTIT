package j04010_htngoaitiep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i= 0; i < t; i++) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            if(p1.check(p1, p2, p3) == false){
                System.out.println("INVALID");
            }
            else{
                System.out.println(String.format("%.3f", p1.tron(p1, p2, p3)));
            }
        }
    }
}
