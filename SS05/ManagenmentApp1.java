interface Human1{
    void learn(String str1);
}

interface Recruiment1{
    boolean interview( boolean selected);
}

class Student1 implements Human1 ,Recruiment1 {
    public void learn(String str1){
    System.out.println("Learning java programming" +str1 );
    }

    public boolean interview(boolean selected){
        System.out.println("Interview gor OJT");
        if(selected){
            return true;
        }
        return false;
    }
}



public class ManagenmentApp1 {
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.learn("java");
    }
}
