package j04013_tuyensinh;


public class ThiSinh {
    private String ma, ten;
    private double dt, dl, dh;

    public ThiSinh(String ma, String ten, double dt, double dl, double dh) {
        this.ma = ma;
        this.ten = ten;
        this.dt = dt;
        this.dl = dl;
        this.dh = dh;
    }

    public double uTien() {
        String s = "";
        for (int i = 0; i < 3; i++) {
            s += ma.substring(i, i+1);
        }
        if(s.equals("KV1")) return 0.5;
        if(s.equals("KV2")) return 1;
        if(s.equals("KV3")) return 2.5;
        return 0;
    }

    public double tongDiem() {
        return dt * 2 + dl + dh ;
    }

    public String ketQua() {
        if(tongDiem() + uTien() >= 24)    return "TRUNG TUYEN";
        return "TRUOT";
    }

    @Override
    public String toString() {
        if(uTien() == (int)uTien() && tongDiem() == (int)tongDiem()){
            return ma + " " + ten + " " + (int)uTien() + " " +
                    (int)tongDiem() + " " + ketQua() ;
        }
        if(uTien() != (int)uTien() && tongDiem() == (int)tongDiem()){
            return ma + " " + ten + " " + uTien() + " " +
                    (int)tongDiem() + " " + ketQua() ;
        }
        if(uTien() == (int)uTien() && tongDiem() != (int)tongDiem()){
            return ma + " " + ten + " " + (int)uTien() + " " +
                    tongDiem() + " " + ketQua() ;
        }

        return ma + " " + ten + " " + uTien() + " " +
                tongDiem() + " " + ketQua() ;
        }
}
