package j05020;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            list.add(new Student(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
