package basic;

import java.util.Scanner;

// số ước chia hết cho hai của 1 số
public class EvenDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(ystem.in);
        int t;
        t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n;
            n = sc.nextInt();
            numberEvenDivisor(n);
        }

    }
    public static void  numberEvenDivisor(int n){
        if(n % 2 != 0){
            System.out.println(0);
        }
        else{
            int dem = 1;
            for (int i = 2; i < Math.sqrt(n); i++){
                if(n % i ==0){
                    if(i % 2 ==0)
                        dem++;
                    if((n/i) % 2 ==0)
                        dem++;
                }
            }

            if(n % Math.sqrt(n) == 0)
                dem++;
            System.out.println(dem);
        }
    }
}
