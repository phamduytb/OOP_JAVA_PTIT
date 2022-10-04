package tongphanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            PhanSo p1  = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo p2  = new PhanSo(sc.nextLong(), sc.nextLong());
            System.out.println( PhanSo.result(p1, p2));
        }
}
