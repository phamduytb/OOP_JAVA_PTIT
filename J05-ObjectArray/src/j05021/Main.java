package j05021;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
//        for (int i = 0; i < 4; i++) {
//            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
//        }
        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
