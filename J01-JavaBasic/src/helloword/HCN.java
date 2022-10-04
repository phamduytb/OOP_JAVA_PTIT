/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class HCN {
    public static void main(String[] args) {
        int cd,cr,cv,dt;
        Scanner sc=new Scanner(System.in);
        cd=sc.nextInt();
        cr=sc.nextInt();
   
        if(cd<=0||cr<=0){
            System.out.println(0);
        }
        else{
            cv=(cr+cd)*2;
            dt=cr*cd;
            System.out.println( + cv + " " + dt);
        }
    }
}
