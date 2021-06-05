package collection;
import  java.util.ArrayList;
import java.util.List;
import  java.util.ListIterator;

public class ListInterFsceDemo {

    public static void main(String[] args) {
        //Arraulist list Khai bao

        ArrayList arrayList = new ArrayList();

        List list = new ArrayList();

        List<String> myList= new ArrayList<String>();

        myList.add("Apple");
        myList.add("LG");
        myList.add("SAMSUNG");
        myList.add("NOKIA");

        ListIterator<String> listIterator = myList.listIterator();
//        String string1 = listIterator.next();
//        System.out.println(string1);
//        String string2 = listIterator.next();
//        System.out.println(string2);
//


        while (listIterator.hasNext()){
            String stringValue = listIterator.next();
            System.out.println(stringValue);
        }
    }
}
