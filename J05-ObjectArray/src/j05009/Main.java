package j05009;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<examiner> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            list.add(new examiner(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())
                        , Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
//        dùng get để lấy ra một đối tượng tại một vị trí nào đó trong list
        double max = list.get(0).getTotal();
        for (examiner e : list) {
            if (e.getTotal() == max) System.out.println(e);
            else break;
        }
    }
}
