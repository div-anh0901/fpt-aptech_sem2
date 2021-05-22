class ParentClass1{
    int a;
    void setData (int a){
        this.a=a;
    }
}

class ChildClass1 extends ParentClass1{
    void showDataClass1(){
        System.out.println("ChildClass1");
        System.out.println("Vlua of a :" +a);
    }
}

class ChildClass2 extends ParentClass1{
    void showDataClass2(){
        System.out.println("ChildClass2");
        System.out.println("Vlua of a : " +a);
    }
}


public class HierachicalInheritanceApplication {
    
public static void main(String[] args) {
    ChildClass1 childClass1 = new ChildClass1();
    childClass1.setData(30);
    childClass1.showDataClass1();
    ChildClass2 childClass2 = new ChildClass2();
    childClass2.setData(40);
    childClass2.showDataClass2();

}
}
