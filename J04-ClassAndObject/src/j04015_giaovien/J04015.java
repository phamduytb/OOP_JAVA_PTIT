package j04015_giaovien;

import java.util.Scanner;

public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println(gv);
    }
}
