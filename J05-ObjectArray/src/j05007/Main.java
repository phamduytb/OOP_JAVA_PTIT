package j05007;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            list.add(new Employee(i, sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
