
class ParentClass{
    int a;
/*
    1.Tham chiếu tới instance of class hiện tại
    2.this() gọi constructor của lớp hiện tại
    3.Truyền tham số vào phương thức , Contructor
    4.Trả về instance của lớp hiện tại
*/

    void setData(int a){
        this.a = a;//this: gọi instance của lớp hiện tại và có thể gọi ra thuộc tính

    }
}

class ChildClass extends PerentClass{
        void ShowDataChild(){
            System.out.println("Value of a is" + a);
        }


}
public class Singlelngeritace {
    public static void main(String args[]) {
        ChildClass childClass = new ChildClass();

        childClass.setData(30);
        childClass.ShowDataChild();
    }
}
