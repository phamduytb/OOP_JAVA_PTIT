package j05023;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        List<String> year = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q --> 0) {
            String y = sc.nextLine();
            String sYear = y.substring(2);
            year.add(sYear);

        }
        for (int i = 0; i < year.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (year.get(i).equals(list.get(j).getGrade().substring(1,3))){
                    System.out.println("DANH SACH SINH VIEN KHOA 20" + year.get(i)+ ":");
                    for (int k = 0; k < list.size(); k++) {
                        if (year.get(i).equals(list.get(k).getGrade().substring(1,3)))
                            System.out.println(list.get(k));
                    }
                    break;
                }

            }
        }
    }
}
