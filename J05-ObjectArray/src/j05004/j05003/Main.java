package j05004.j05003;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n --> 0) {
            Student student = new Student(sc.nextLine(), sc.nextLine(),
                                sc.nextLine(), Double.parseDouble(sc.nextLine()));
            System.out.println(student);

        }
    }
}
