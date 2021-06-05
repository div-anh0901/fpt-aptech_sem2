package collection;
import  java.util.HashMap;

public class ListInterfaceHasMapDemo {
    public static void main(String[] args) {
        //Key and value pairs
            HashMap<String,Float>myHashMap = new HashMap<String,Float>();
            myHashMap.put("ST01", 15f);
            myHashMap.put("ST02",16.6f);
        myHashMap.put("ST03",43f);
        myHashMap.put("ST04",34f);
        myHashMap.put("ST05",53.6f);

    Float mark = myHashMap.get("ST01");
        System.out.println(mark);
        myHashMap.put("ST02",35f);
        Float mark1 = myHashMap.get("ST02");
        System.out.println(mark1);

    }
}
