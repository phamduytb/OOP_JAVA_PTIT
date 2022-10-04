package j04014;

import java.util.Scanner;

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            PhanSo ps = new PhanSo(sc.nextLong(), sc.nextLong(),
                    sc.nextLong(),sc.nextLong());
            ps.result();
        }
    }
}
