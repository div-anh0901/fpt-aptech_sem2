import java.util.Scanner;
 
abstract class Shape{

    int rarius, width, length;
    abstract void printArea();
    Scanner input = new Scanner(System.in);

}
class Rectangle extends Shape{
    void printArea(){
        System.out.println("Tinh dien tich HCN");
        System.out.println("Nhap thong so(dai,rong) : " );
        width = input.nextInt();
        length= input.nextInt();
        System.out.println("Dien tich : " + width*length);
;
    }
}

class Cricle extends Shape{
    void printArea(){
        System.out.println("Tinh dien tich hinh trong ");
        System.out.println("Nhap ban kinh ");
        rarius = 6;
        System.out.println("Dien tich  :" + 3.14*rarius*rarius);
    }

}
public class AbstractClass {
    
    public static void main(String args[]) {
        Rectangle readable = new Rectangle();
        readable.printArea();

        Cricle cricle = new Cricle();
        cricle.printArea();
    }

}
