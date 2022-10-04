package sinhvien_2;

import sinhvien_2.SinhVien2;

import java.text.ParseException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SinhVien2 sv = new SinhVien2(sc.nextLine(), sc.nextLine()
                ,sc.nextLine(), Float.parseFloat(sc.nextLine()));
        System.out.println(sv);
    }
}
