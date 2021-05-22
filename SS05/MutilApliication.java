
class ParentClass{
    int a;
    void showData(int a){
        this.a =a;
    }
}

class ChildClass extends ParentClass{
    void showDataChild(){
        System.out.println("Valur of a : " +a);
    }
}

class ChildChildClass extends ChildClass{
    void display(){
        System.out.println("In chilechileClass");
    }
}


public class MutilApliication {
    public static void main(String[] args) {
        ChildChildClass childchildClass = new ChildChildClass();
        childchildClass.showData(30);
        childchildClass.showDataChild();
        childchildClass.display();
    }
}
