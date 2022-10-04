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
public class TinhTong {
    public static void main(String[] args) {
        getSum();
    }
    public static void getSum(){
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int i=1;i<=t;i++){
            long n,sum;
            n=sc.nextLong();
            sum=(1+n)*n/2;
            System.out.println(sum);
        }
    }
}
