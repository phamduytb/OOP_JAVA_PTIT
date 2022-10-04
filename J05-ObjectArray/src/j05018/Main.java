package j05018;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            list.add(new Student(i, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()
                      , sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            sc.nextLine();
        }
        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
