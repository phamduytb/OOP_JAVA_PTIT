package j04012_tinhcong;

public class NhanVien {
    private String  ten, cv;
    private int ma = 0;
    private double  luong, nc;

    public NhanVien(String ten,double luong, double nc, String cv ) {
        ma++;
        this.ten = ten;
        this.cv = cv;
        this.luong = luong;
        this.nc = nc;
    }



    public String getCv() {
        return cv;
    }

    public String getMa() {
        if(ma < 10) {
            return "NV0" + ma;
        }
        else{
            return "NV" + ma;
        }
    }



    public double luongThang() {
        return luong * nc;
    }

    public double thuong() {
        if(nc >= 25) {
            return 0.2 * luongThang();
        }
        if (nc < 25 && nc >= 22) {
            return luongThang() * 0.1;
        }
        return 0;
    }
    public double phuCap() {
        if(cv.equals("GD") ) return 250000;
        if(cv.equals("PGD")) return 200000;
        if(cv.equals("TP")) return 180000;
        if(cv.equals("NV")) return 150000;
        return 0;
    }

    @Override
    public String toString() {
        return getMa() + " " + ten + " " + (int)luongThang() + " " +
                (int)thuong() + " " + (int)phuCap() + " " + (int)(luongThang()
                    + thuong() + phuCap());
    }
}
