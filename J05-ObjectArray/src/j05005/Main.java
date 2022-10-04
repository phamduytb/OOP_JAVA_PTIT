package j05005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            list.add(new Student(i, sc.nextLine(), sc.nextLine(),
                    sc.nextLine(),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
       for (Student s : list) {
           System.out.println(s);
       }
    }
}
