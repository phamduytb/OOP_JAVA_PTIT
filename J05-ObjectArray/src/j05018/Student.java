package j05018;

public class Student implements Comparable<Student>{

    private String sCode,name;
    private double average;

    public Student(int stt, String name, double t,double tv, double nn, double l, double h,
                   double sh, double ls, double d, double cd, double cn) {
        this.sCode = "HS" + String.format("%02d", stt);
        this.name = name;
        this.average = countAverage(t, tv, nn, l, h, sh, ls, d, cd, cn);
    }

    private double countAverage(double t, double tv, double nn, double l, double h, double sh, double ls, double d, double cd, double cn) {
        double average = ((t + tv) * 2 + nn + l + h + sh + ls + d + cd + cn) / 12;
        return (double) Math.round(average * 10) / 10;
    }
    private String result() {
        if (average >= 9)   return "XUAT SAC";
        if (average >=8 && average < 9) return "GIOI";
        if (average >=7 && average < 8) return "KHA";
        if (average >= 5 && average < 7) return "TB";
        return "YEU";
    }

    @Override
    public int compareTo(Student o) {
        String s1 = this.sCode.substring(2);
        String s2 = o.sCode.substring(2);
        if (this.average < o.average)   return 1;
        if (this.average == o.average && Integer.parseInt(s1) > Integer.parseInt(s2)) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return sCode + " " + name + " " + average + " " + result();
    }
}
