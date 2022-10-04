package thisinh;

import java.util.Date;

public class ThiSinh {
    private String ten,ns;

    private float d1, d2, d3;

    public ThiSinh(String ten, String ns, float d1, float d2, float d3) {
        this.ten = ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getTen() {
        return ten;
    }

    public String getNs() {
        return ns;
    }

    public float tong() {
        return d1 + d2 + d3;
    }
}
