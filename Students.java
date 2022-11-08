import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
    int id;
    String name;
    int marks;

    Students(int d, String n, int m) {
        this.id = d;
        this.name = n;
        this.marks = m;
    }
}

class identity implements Comparator<Students> {
    public int compare(Students s1, Students s2) {
        System.out.println("s1id="+ s1.id);
        System.out.println("s2id=" + s2.id);
        if (s1.id == s2.id) {
            return 0;
        }
        if (s1.id < s2.id) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Main {
    public static void main(String[] args) {
        List<Students> lists = new ArrayList<>();
        lists.add(new Students(3, "ank", 12));
        lists.add(new Students(1, "sah", 19));
        lists.add(new Students(5, "ash", 14));
        lists.add(new Students(4, "sak", 9));
        lists.add(new Students(0, "kar", 11));
        for(int j=0; j<lists.size(); j++){
            System.out.println(lists.get(j));
        }
        Collections.sort(lists, new identity());
        for (int i=0; i<lists.size(); i++)
            System.out.println(lists.get(i));
    }
    }
