/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Fibonaci {
    public static void main(String[] args) {
        sumFibonaci();
    }
    public static void sumFibonaci(){
        Scanner sc=new Scanner(System.in);
        long[] f=new long[100];
        f[1]=1;
        f[2]=1;
        int t;
        t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n;
            n=sc.nextInt();
            for(int j=3;j<=n;j++)
                f[j]=f[j-1]+f[j-2];
            System.out.println(f[n]);
        }
    }
}
