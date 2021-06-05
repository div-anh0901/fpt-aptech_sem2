package Map;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        TreeSet treeSet1 = new TreeSet();

        Random random = new Random();

        for(int i = 0 ; i < 10 ; i++){
            treeSet.add(random.nextInt(100));

        }

        treeSet1.add(30);
        treeSet1.add(20);
        treeSet1.add(10);

        System.out.println(treeSet);
        System.out.println(treeSet1);

        System.out.println(treeSet.contains(50));

        System.out.println(treeSet.equals(treeSet1));

    }

}
