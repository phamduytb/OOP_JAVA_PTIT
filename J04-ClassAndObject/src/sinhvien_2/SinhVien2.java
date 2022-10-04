package sinhvien_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien2 {
    private String ma, ten, lop;
    private float gpa;
    private Date ns;

//    -??????cách chuyển đổi vẫn chưa chuẩn giữa String và date-------------------//
    public SinhVien2(String ten, String lop, String ns, float gpa) throws ParseException {
        this.ma = "B20DCCN001";
        this.ten = ten;
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa = gpa;
    }





    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + ns
                + " " + String.format("%.2f", gpa);
    }
}
