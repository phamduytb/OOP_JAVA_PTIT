package basic;

import java.util.Scanner;

// ước số nguyên tố lớn nhất
public class GPD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t;
        t=sc.nextLong();
        for( long i=0;i<t;i++){
            long n;
            n=sc.nextLong();
            gPD(n);
        }

    }
    public static void gPD(long n){
        if(checkPrime(n))
            System.out.println(n);
        else{
            long result=2;
            for(long i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    if(checkPrime(i)){
                        result=i;
                    }
                    if(checkPrime(n/i)){
                        result=n/i;
                        break;
                    }
                }
            }
            System.out.println(result);
        }
    }
    public static boolean checkPrime(long n){
        for(long i=2; i <= Math.sqrt(n); i++){
            if(n % i ==0)
                return false;
        }
        return true;
    }
}
