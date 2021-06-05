package collection;
import  java.util.HashSet;
import  java.util.Iterator;
import  java.util.Set;
public class ListInterfaceWidthSetDemo {
    public static void main(String[] args) {
        //Khoi tao 1000 Phan tu chua
        // Va tan len kha nang chua la 50%;
        //Khong cho phep gia chij trung lap , chap nhan kieu uinque
        Set<String> mySet = new HashSet<String>(100,50);
        mySet.add("APPLE");
        mySet.add("LG");
        mySet.add("HTTC");
        mySet.add("APPLE");
        mySet.add("SAMSUNG");
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
