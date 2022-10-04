package basic;

import java.util.Scanner;

public class SumDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        n = sc.nextInt();
        for (int i =0; i < n; i++){
            int a;
            a = sc.nextInt();
            sum += sumPrime(a);

        }
        System.out.println(sum);
    }
    public static int sumPrime(int a){

        int i=2, sum = 0, k = a;
        while(k >= 2){
            if(checkPrime(k)){
                sum += k;
                break;
            }

            while(k % i == 0){
                sum += i;
                k /= i;
            }
            i++;
        }
        return sum;
    }
    public static boolean checkPrime(int n){
        for(int j=2;j<=Math.sqrt(n);j++){
            if(n%j==0){
                return false;
            }
        }
        return true;
    }


}
