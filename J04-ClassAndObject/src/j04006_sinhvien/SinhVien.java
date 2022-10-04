package j04006_sinhvien;

public class SinhVien {
    private String ma, ten, lop, ns;
    private float gpa;

    public SinhVien( String ten, String lop, String ns, float gpa) {
        this.ma = "B20DCCN001";
        this.ten = ten;
        this.lop = lop;
        this.ns = ngaySinh(ns);
        this.gpa = gpa;
    }



    private String ngaySinh(String ns) {
        String day[] = ns.split("/");
        if(day[0].length() == 1)    day[0] = "0" + day[0];
        if(day[1].length() == 1)    day[1] = "0" + day[1];
        return day[0] + "/" + day[1] + "/" + day[2];
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + ns
                + " " + String.format("%.2f", gpa);
    }
}
