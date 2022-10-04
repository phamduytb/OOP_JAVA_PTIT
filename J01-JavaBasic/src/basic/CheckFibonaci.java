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
public class CheckFibonaci {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t>0){
            long n;
            n=sc.nextLong();
            checkFibonaci(n);
            t--;
        }
    }
    public static void checkFibonaci(long n){
        long[] f=new long[100];
        boolean check=false;
        f[1]=1;f[2]=1;
        //tạo 1 dãy số fibonaci
        for(int i=3;i<=92;i++){
            f[i]=f[i-2]+f[i-1];
        }
        
        // Baì này lại tính 0 là số fibonaci
        if(n==0){
            System.out.println("YES");
            check=true;
        }
            
        //kiểm tra số n có phải fibonaci không
      
        for(int j=1;j<=92;j++){
            if(n==f[j]){
                System.out.println("YES");
                check=true;
                break;
            }
            
        }
        if(check==false)
            System.out.println("NO");
    }
}
