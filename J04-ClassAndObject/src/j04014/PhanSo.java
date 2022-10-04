package j04014;

public class PhanSo {
    private long t1, m1, t2, m2;

    public PhanSo(long t1, long m1, long t2, long m2) {
        this.t1 = t1;
        this.m1 = m1;
        this.t2 = t2;
        this.m2 = m2;
    }

    public long gCD(long a, long b) {
        if(b == 0)  return a;
        return gCD(b, a % b);
    }
    public void result() {
        long t = (t1 * m2 + t2 * m1) * (t1 * m2 + t2 * m1);
        long m = (m1 * m2) * (m1 * m2);
        long c = gCD(t, m);
        System.out.print((t / c) + "/" + (m / c)+" ");
        long dt = t1 * t2 * (t / c);
        long dm = m1 * m2 * (m / c);
        long dc = gCD(dt, dm);
        System.out.print((dt / dc) + "/" + (dm / dc)+"\n");
    }
}
