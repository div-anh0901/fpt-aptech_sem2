package Map;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();

        sortedSet.add(5);
        sortedSet.add(40);
        sortedSet.add(324);
        sortedSet.add(4211);
        sortedSet.add(12);
        sortedSet.add(3);

        System.out.println(sortedSet);
    }
}
