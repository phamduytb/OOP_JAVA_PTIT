package j05010;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Merchandise> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            list.add(new Merchandise(i, sc.nextLine(), sc.nextLine()
                    , Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        for (Merchandise m : list) {
            System.out.println(m);
        }
    }
}
