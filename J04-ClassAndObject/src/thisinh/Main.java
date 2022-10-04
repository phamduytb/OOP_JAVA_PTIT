package thisinh;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh  thiSinh = new ThiSinh(sc.nextLine(),sc.nextLine() , Float.parseFloat(sc.nextLine()),
                Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()));
        System.out.print(thiSinh.getTen() + " " + thiSinh.getNs() + " ");
        System.out.printf("%.1f\n", thiSinh.tong());
    }
}
