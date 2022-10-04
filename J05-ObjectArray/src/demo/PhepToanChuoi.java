package demo;

import java.util.*;
public class PhepToanChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            String s = sc.nextLine();
//            String s1 = sc.nextLine();
            /*System.out.println(Integer.parseInt(s1) - Integer.parseInt(s));
            if (Integer.parseInt(s1) > Integer.parseInt(s)) System.out.println(1);
            else System.out.println(0);*/

//            System.out.println(s.charAt(2));
//            System.out.println(s.charAt(3));
//            System.out.println(Integer.parseInt(String.valueOf(s.charAt(2))) - Integer.parseInt(String.valueOf(s.charAt(3))));

            String s2 = s.substring(1,3);
            System.out.println(s2);
        }
    }
}
