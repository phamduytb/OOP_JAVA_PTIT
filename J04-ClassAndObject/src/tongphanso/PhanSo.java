package tongphanso;

public class PhanSo {
    private long ts, ms;

    public PhanSo(long ts, long ms) {
        this.ts = ts;
        this.ms = ms;
    }

    public long getTs() {
        return ts;
    }

    public long getMs() {
        return ms;
    }

    public static  long gCD(long a, long b){
        if(b == 0)
            return a;
        return gCD(b, a % b);
    }

    public static String result(PhanSo p1, PhanSo p2) {
        long t = (p1.ts * p2.ms) + (p1.ms * p2.ts);
        long m = p1.ms * p2.ms;
        long c = gCD(t, m);
        return (t / c) + "/" + (m / c);
    }
}
