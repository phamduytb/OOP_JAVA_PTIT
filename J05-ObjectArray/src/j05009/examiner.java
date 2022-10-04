package j05009;

public class examiner implements Comparable<examiner> {
    private String  name, dOB;
    private double score1, score2, score3, total;
    private int eCode;

    public examiner(int stt,String name, String dOB, double score1, double score2, double score3) {
        this.eCode = stt;
        this.name = name;
        this.dOB = dOB;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.total = score1 + score2 + score3;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public int compareTo(examiner o) {
        if (this.total < o.total) return 1;
        if (this.total == o.total && this.eCode > o.eCode)  return 1;

        return -1;
    }

    @Override
    public String toString() {
        return eCode + " " + name + " " + dOB + " " + total;
    }
}
