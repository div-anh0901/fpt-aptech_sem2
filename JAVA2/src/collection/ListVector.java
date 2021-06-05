package collection;
import  java.util.Vector;
public class ListVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        Vector<Integer> vector1 = new Vector<Integer>(100,20);
        vector1.add(5);
        vector1.add(256);
        //vector1.add(new Integer (25));
        //chap nhan gia tri null
        vector1.add(null);
        System.out.println(vector1.size());
        //thay doi gia tri o vi tri nao do
        vector1.setElementAt(5000,1);
        System.out.println(vector1.get(1));
        System.out.println(vector1.get(0));
    }


}
