package j05033;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Time> list = new ArrayList<>();
        int n = sc.nextInt();
        while (n --> 0) {
            list.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list);
        for (Time t : list)
            System.out.println(t);
    }
}
