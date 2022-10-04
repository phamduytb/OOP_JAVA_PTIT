package j04008v2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            TamGiac tamGiac = new TamGiac(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),
                    sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            tamGiac.chuVi();
        }
    }
}
