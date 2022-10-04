package j05006;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            list.add(new Employee(i, sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
