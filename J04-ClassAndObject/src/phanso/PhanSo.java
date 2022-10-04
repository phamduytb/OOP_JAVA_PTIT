package phanso;

public class PhanSo {
   private  long ts, ms;

    public PhanSo(long ts, long ms) {
        this.ts = ts;
        this.ms = ms;
    }

    public long gCD(long a, long b){
        if(b == 0)
            return a;
        return gCD(b, a % b);
    }

    public String result() {
        long c = gCD(ts, ms);
        return (ts / c) + "/" + (ms/c);
    }
}
