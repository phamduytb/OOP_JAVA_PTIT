package j05011;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Time> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            list.add(new Time(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for (Time time : list) {
            System.out.println(time);
        }
    }
}
