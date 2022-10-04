package j04021;

import java.util.SortedSet;
import java.util.TreeSet;

public class IntSet {
    private SortedSet<Integer> ts = new TreeSet<>();

    public IntSet(int a[]) {
        for (int i = 0; i < a.length; i++) {
            ts.add(a[i]);
        }
    }
     public IntSet union(IntSet intSet) {
        for (Integer i : intSet.ts) {
            this.ts.add(i);
        }
        return this;
     }

    @Override
    public String toString() {
        String ans = "";
        for (Integer i : this.ts) {
            ans += i + " ";
        }
        return ans;
    }
}
