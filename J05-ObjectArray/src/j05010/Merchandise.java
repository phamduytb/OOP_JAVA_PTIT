package j05010;

public class Merchandise implements Comparable<Merchandise>{
    private String name, group;
    private int code;
    private double profit;

    public Merchandise(int stt,String name, String group, double pPrice, double sPrice) {
        this.code = stt;
        this.name = name;
        this.group = group;
        this.profit = sPrice - pPrice;
    }


    @Override
    public String toString() {
        return code + " " + name + " " + group + " " + String.format("%.2f",profit);
    }

    @Override
    public int compareTo(Merchandise o) {
        if (this.profit < o.profit) return 1;
        return -1;
    }
}
