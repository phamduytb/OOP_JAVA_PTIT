package demo;

import java.util.*;
public class LamTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double c = (a+b)/2;
            System.out.println((double) Math.round(c * 10) / 10);
        }
    }
}
