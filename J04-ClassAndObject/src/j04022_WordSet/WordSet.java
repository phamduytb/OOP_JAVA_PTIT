package j04022_WordSet;

import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> list;

    public WordSet() {
    }

    public WordSet(String s) {
        list = new TreeSet<>();
        String[] st = s.split("[\\s\t]+");
        for (int i = 0; i < st.length; i++) {
            list.add(st[i]);
        }
    }

    public WordSet union(WordSet s2) {
        for (String s : s2.list) {
            list.add(s);
        }
        String st = "";
        for (String s : list) {
            st += s + " ";
        }
        return new WordSet(st);
    }

    public WordSet intersection(WordSet s2) {
        String st = "";
        for (String s : s2.list) {
            if (list.contains(s)) {
                st += s +" ";
            }
        }
        return new WordSet(st);
    }

    public String toString() {
        String s = "";
        for (String st : list) {
            s += st + " ";
        }
        s = s.toLowerCase();
        return s;
    }
}
