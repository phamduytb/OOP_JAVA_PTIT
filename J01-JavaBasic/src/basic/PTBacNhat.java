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
public class PTBacNhat {
    public static void main(String[] args) {
        getResult();
    }
    public static void getResult(){
        Scanner sc=new Scanner(System.in);
        double a,b;
        for(int i=0;i<4;i++){
            System.out.println("Giải phương trình bậc nhất ax + b = 0");
            System.out.print("Mời bạn nhập a: " );
            a = Double.parseDouble(sc.nextLine());
            System.out.print("Mời bạn nhập b: " );
            b = Double.parseDouble(sc.nextLine());
            if(a==0){
                if(b==0)
                    System.out.println("VSN");
                else
                    System.out.println("VN");
            }
            else{
                System.out.printf("%.2f\n", -b/a);
            }
        }
        
    }
}
