package j04002_rectange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int with = sc.nextInt();
            int height = sc.nextInt();
            String color = sc.nextLine();

            if(with > 0 && height >0) {
                Rectange rectange = new Rectange(with, height, color);
                System.out.println(rectange.findPerimeter()+" "+rectange.findArea()
                        +" "+rectange.findColor());
            }
            else{
                System.out.println("INVALID");
            }
//        }
    }
}
