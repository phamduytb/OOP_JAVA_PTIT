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
public class CheckPrime {
    public static void main(String[] args) {
        checkPrime();
    }
    public static void checkPrime(){
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n;
            boolean check=false;
            n=sc.nextInt();
            for(int j=2;j<=Math.sqrt(n);j++){
                if(n%j==0){
                    System.out.println("NO");
                    check=true;
                    break;
                }     
            }
            if(check==false)
                System.out.println("YES");
        }
    }
    
}
