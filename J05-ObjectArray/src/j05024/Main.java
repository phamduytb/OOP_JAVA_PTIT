package j05024;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list =new ArrayList<>();
        List<String> department = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q --> 0) {
            String s = sc.nextLine();
            department.add(s);
        }

        for (int i = 0; i < department.size(); i++) {
            if (department.get(i).equals("Ke toan")){
                Boolean check = false;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).getCode().substring(5,7).equals("KT")){
                        check = true;
                        System.out.println("DANH SACH SINH VIEN NGANH KE TOAN:");
                        for (int k = 0; k < list.size(); k++) {
                            if (list.get(k).getCode().substring(5,7).equals("KT"))
                                System.out.println(list.get(k));
                        }
                    }
                    if (check == true) break;
                        
                }
            } else if (department.get(i).equals("Cong nghe thong tin") ) {
                Boolean check = false;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).getCode().substring(5,7).equals("CN") && !list.get(j).getGrade().substring(0,1).equals("E")){
                        check = true;
                        System.out.println("DANH SACH SINH VIEN NGANH CONG NGHE THONG TIN:");
                        for (int k = 0; k < list.size(); k++) {
                            if (list.get(k).getCode().substring(5,7).equals("CN") && !list.get(k).getGrade().substring(0,1).equals("E"))
                                System.out.println(list.get(k));
                        }
                    }
                    if (check == true) break;
                }
            } else if (department.get(i).equals("An toan thong tin")) {
                Boolean check = false;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).getCode().substring(5,7).equals("AT") && !list.get(j).getGrade().substring(0,1).equals("E")){
                        check = true;
                        for (int k = 0; k < list.size(); k++) {
                            if (list.get(k).getCode().substring(5,7).equals("AT") && !list.get(k).getGrade().substring(0,1).equals("E"))
                                System.out.println(list.get(k));
                        }
                    }
                    if (check == true) break;
                }
                
            } else if (department.get(i).equals("Vien thong")) {
                Boolean check = false;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).getCode().substring(5,7).equals("VT")){
                        check = true;
                        System.out.println("DANH SACH SINH VIEN NGANH VIEN THONG:");
                        for (int k = 0; k < list.size(); k++) {
                            if (list.get(k).getCode().substring(5,7).equals("VT"))
                                System.out.println(list.get(k));
                        }
                    }
                    if (check == true) break;

                }
            } else {
                Boolean check = false;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).getCode().substring(5,7).equals("DT")){
                        check = true;
                        System.out.println("DANH SACH SINH VIEN NGANH DIEN TU:");
                        for (int k = 0; k < list.size(); k++) {
                            if (list.get(k).getCode().substring(5,7).equals("DT"))
                                System.out.println(list.get(k));
                        }
                    }
                    if (check == true) break;

                }
            }
        }
    }
}
