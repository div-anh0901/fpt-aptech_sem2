package Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StortedMapCollection {
    public static void main(String[] args) {
        Map<String , String> student = new TreeMap<String,String>();

        student.put("222","lua");
        student.put("111","Mi");
        student.put("555","gao");
        student.put("345","khoai");
        student.put("234","San");
        Set<String> stuIds = student.keySet();
        for(String stuId : stuIds){
            System.out.println("student Id : " + stuId);
        }

        Set<Map.Entry<String,String>>  studentKeys = student.entrySet();

        for(Map.Entry sudentKey : studentKeys){
            System.out.println(sudentKey);
        }

    }


}
