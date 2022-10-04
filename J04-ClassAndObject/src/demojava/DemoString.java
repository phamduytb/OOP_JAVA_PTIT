package demojava;

import java.util.SortedSet;
import java.util.TreeSet;

public class DemoString {
    public static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<>();
        String s = "Lap TRINH huong doi tuong";
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            String c = "";
            c += s.charAt(i);

            if(!c.equals("\\s") ){
                c.toLowerCase();
                st += c;
            }
            else {
                ts.add(st);
                st = "";
            }
        }
        for (String i : ts){
            System.out.print(i + " ");
        }
    }
}
