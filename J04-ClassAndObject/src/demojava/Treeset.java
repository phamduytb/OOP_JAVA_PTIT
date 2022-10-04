package demojava;

import java.util.*;
public class Treeset {
    public static void main(String[] args) {
        SortedSet<Integer> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            ts.add(a[i]);
        }
        for (Integer i : ts){
            System.out.print(i+" ");
        }
    }
}
