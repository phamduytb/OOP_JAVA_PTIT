package j04007_nhanvien;

public class NhanVien {
    private String ma, ten, gt, ns, dc, mThue, hd;

    public NhanVien(String ten, String gt, String ns, String dc, String mThue, String hd) {
        this.ma = "00001";
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mThue = mThue;
        this.hd = hd;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gt + " " + ns + " " +
                dc + " " + mThue + " " + hd;
    }
}
