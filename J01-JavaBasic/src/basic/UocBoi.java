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
public class UocBoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.print(BCNN(a,b)+" ");
            System.out.println(UCLN(a,b));
            
            
        }
    }
    public static long UCLN(long a,long b){
        if(b==0) 
            return a;
        return UCLN(b, a%b);
    }
            
    public static long  BCNN(long a,long b){
        return (a*b)/(UCLN(a,b));
    }
}
