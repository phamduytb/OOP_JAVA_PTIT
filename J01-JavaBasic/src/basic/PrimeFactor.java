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
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n;
            n=sc.nextInt();           
            System.out.print("Test "+(i+1)+":");   
            primeFactor(n);
        }
    }
    public static boolean checkPrime(int n){
        for(int j=2;j<=Math.sqrt(n);j++){
            if(n%j==0){
                return false;
            }     
        }
        return true;
    }
    public static void primeFactor(int n){
        int k=n;
        if(checkPrime(k))
            System.out.println(" "+k+"(1)");
        else{
            int i=2;
            while(k>=2){
                if(checkPrime(i)){
                    int dem=0;
                    while(k%i==0){

                        k/=i;
                        dem++;
                    }
                    if(dem>0)
                        System.out.print(" "+i+"("+dem+")");
                    
                }
                i++;
            }
            System.out.println("");                    
        }
    }
}
