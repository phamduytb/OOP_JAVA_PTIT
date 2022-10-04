package j04006_sinhvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine()
                        ,sc.nextLine(), Float.parseFloat(sc.nextLine()));
        System.out.println(sv);
    }
}
