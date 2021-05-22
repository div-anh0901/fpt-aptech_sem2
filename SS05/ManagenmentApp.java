interface Human{
    void learn();
    void work();

}

interface Recruiment{
    boolean screening(int core);
    boolean interview(boolean selected);

}

interface EmployeeRepository extends Recruiment{
    
}

class Person1{
    int age;
    String name;
    void personTalk(){

    };
}
class Programer extends Person1 implements Human,Recruiment{
    public boolean screening(int core){
        return true;
    }
    
    public boolean interview(boolean selecter){
        return true;
    }
    public void learn(String str){

    }
    public void work(){
        System.out.println("Working");
    }

}

class Dancer extends Person1 implements Human, Recruiment{
    public void work(){
        System.out.println("Dancing");
    }
}

public class ManagenmentApp {
    public static void main(String[] args) {
        
    }
}
