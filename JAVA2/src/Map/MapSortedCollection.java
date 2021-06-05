package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSortedCollection {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<String ,String>();
        students.put("3", "Thinh");
        students.put("2", "Dung");
        students.put("1", "Hai");
        students.put("4", "Duc");
        students.put("5", "Hoang Anh");
        students.put("6", "Chau");

        System.out.println(students.get("Student2"));
       // Set<String> studentIds = students.keySet();
        //Sap xep theo key
        Set<Map.Entry<String,String>> studentIds = students.entrySet();
        for(Map.Entry studenId : studentIds){
            System.out.println(studenId.getKey() + " : " +studenId.getValue());
        }
    }
}
