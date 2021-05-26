import java.util.Scanner;

public abstract class Shape {

    private String color;
    private double area;

    public void setColor(String color) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNhap mau sac :");
        color = input.next();
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract double getArea();

}

class Rectangle extends Shape {
    private double length;
    private double width;

    public void setHeight(double length) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNhap chieu dai :");
        length = input.nextDouble();
        this.length = length;
    }

    public double getHeight() {
        return length;
    }

    public void setWidth(double width) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNhap chieu rong :");
        width = input.nextDouble();
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

}

class Triangle extends Shape {
    private double base;
    private double height;

    public void setBase(double base) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNhap canh day :");
        base = input.nextDouble();
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNhap chieu cao  :");
        height = input.nextDouble();
        this.height = height;
    }

    public double getWidth() {
        return height;
    }

    public double getArea() {
        return base * height / 2.0;
    }
}

class TestShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("red");
        rectangle.setHeight(12);// tam thoi
        rectangle.setWidth(23);
        System.out.print("Dien tich HCN la : " + rectangle.getArea());

        Triangle triangle = new Triangle();
        triangle.setColor("blue");
        triangle.setBase(10);// tam thoi
        triangle.setHeight(10);
        System.out.print("\n Dien tich tam giac la :" + triangle.getArea());
    }

}
