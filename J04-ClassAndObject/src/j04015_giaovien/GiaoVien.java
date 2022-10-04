package j04015_giaovien;

public class GiaoVien {
    private String ma, ten;
    private int luong;

    public GiaoVien(String ma, String ten, int luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }

    public int phuCap() {
        String s = "";
        s += ma.substring(0,2);

        if(s.equals("HT"))   return 2000000;
        if(s.equals("HP"))   return 900000;
        if(s.equals("GV"))   return 500000;
        return  0;
    }

    public int bacLuong() {
        return (int)(ma.charAt(2)-48) * 10 + (int)(ma.charAt(3)-48);
    }

    public int thuNhap() {
        return luong * bacLuong() + phuCap();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + bacLuong() + " " + phuCap()
                + " " + thuNhap();
    }
}
