package Map;

import java.util.HashMap;
import  java.util.Map;
import java.util.Set;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<String ,String>();
        students.put("Student1", "Thinh");
        students.put("Student2", "Dung");
        students.put("Student3", "Hai");
        students.put("Student4", "Duc");
        students.put("Student5", "Hoang Anh");
        students.put("Student6", "Chau");

        System.out.println(students.get("Student2"));
        Set<String> studentIds = students.keySet();

        for(String studenId : studentIds){
            System.out.println(studenId + " : " + students.get(studenId));
        }


    }
}
