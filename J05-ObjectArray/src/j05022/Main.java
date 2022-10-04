package j05022;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        List<String> grade = new ArrayList<>();
        int q = Integer.parseInt(sc.nextLine());
        while (q --> 0) {
            String st = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getGrade().equals(st)){
                    grade.add(st);
                    break;
                }

            }
        }
        for (int i = 0; i < grade.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (grade.get(i).equals(list.get(j).getGrade())){
                    System.out.println("DANH SACH SINH VIEN LOP " + grade.get(i) + ":");
                    for (int k = 0; k < list.size(); k++) {
                        if (grade.get(i).equals(list.get(k).getGrade()))
                            System.out.println(list.get(k));
                    }
                    break;
                }
            }


        }
    }
}
