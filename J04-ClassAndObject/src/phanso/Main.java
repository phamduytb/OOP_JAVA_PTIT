package phanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ts = sc.nextLong();
        long ms = sc.nextLong();
        PhanSo phanSo = new PhanSo(ts, ms);
        System.out.println(phanSo.result());
    }
}
