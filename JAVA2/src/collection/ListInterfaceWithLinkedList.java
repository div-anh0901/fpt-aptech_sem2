package collection;
import  java.util.LinkedList;



public class ListInterfaceWithLinkedList {
    public static void main(String[] args) {
        //Linh hoat hon Array, doi cho dang sach casc phan tu , Khong bi gioi han
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("APPLE");
        myLinkedList.add("SAMSUNG");
        myLinkedList.add("OPPO");
        myLinkedList.add("NOKIA");
        System.out.println(myLinkedList);
        myLinkedList.addFirst("XIAOMI");
        myLinkedList.addFirst("LG");
        myLinkedList.add(2, "BPHONE");
        System.out.println(myLinkedList);

        Object listObject = myLinkedList.get(2);

        myLinkedList.set(2,(String)listObject + "Vphone");
        System.out.println(myLinkedList);


    }

}
