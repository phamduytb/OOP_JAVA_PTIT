package demojava;

import java.util.Scanner;

public class DuLieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 4; i++) {
//            double a = sc.nextDouble();
////            -------ví dụ về ép kiểu----------------
//            int b = (int)a;
//            int c = 5;
//            long d =c;
////            ------------------------------------
////            nguyên tắc làm tròn trong java là làm tròn xuống
//            System.out.println((int)a);
//            if(a == (int)a) System.out.println("yes");
//            else System.out.println("no");
//        }
        String s= "12";
        int a = (int)(s.charAt(0)-48)*10+ (int)(s.charAt(1)-48);
        System.out.println(a);
        String t = "";
        t += s.substring(0,2);

        System.out.println(t);

    }
}
