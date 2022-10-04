package j04012_tinhcong;

import java.util.Scanner;

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(sc.nextLine(),  Double.parseDouble(sc.nextLine()),
                            Double.parseDouble(sc.nextLine()), sc.nextLine() );
        System.out.println(nv);
    }
}
