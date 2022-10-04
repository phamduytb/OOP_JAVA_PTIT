package j04022;

import java.util.SortedSet;
import java.util.TreeSet;

public class WordSet {
    private SortedSet<String> ts = new TreeSet<>();

    public WordSet(String s) {
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            String c = "";
             c += s.charAt(i);
            if(c != " " ){
                c.toLowerCase();
                st += c;
            }
           else {
               ts.add(st);
               st = "";
            }
        }
    }
    public WordSet union(WordSet wordSet) {
        for (String s : wordSet.ts) {
            this.ts.add(s);
        }
        return this;
    }

    @Override
    public String toString() {
        String s = "";
        for (String st : this.ts){
            s += st + " ";
        }
        return s;
    }
}
