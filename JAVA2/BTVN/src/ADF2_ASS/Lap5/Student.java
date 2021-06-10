package ADF2_ASS.Lap5;

import java.util.Scanner;

public class Student {
    static  int count= 0;

    int id ,age;
    String name,adress;
    float diem;
    public  Student(){
        id = ++count;
    }

    public  Student(int id,int age, String name,String address, float diem){
        this.id = id;
        this.age = age;
        this.name = name ;
        this.adress = address;
        this.diem = diem;
    }

    public int getId(){
        return  id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public  int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAdress(){
        return adress;
    }

    public void setAdress(String Adress){
        this.adress = adress;
    }

    public  float getGpa(){
        return  diem;
    }
    public  void setGpa( float diem){
        this.diem = diem;
    }

    public  void input(){
        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap Id : ");
//        id = input.nextInt();

        System.out.println("Nhap ten : ");
        name = input.nextLine();
        System.out.println("Nhap dia chi :");
        adress = input.nextLine();
        System.out.println("Nhap tuoi : ");
        age = input.nextInt();
    }
    public String getFileLine(){
        return id + " , " + name + " , " + age + " , " + adress + " , " + diem + "\n";
    }
    public  void parse(String line){
        String[] p = line.split(",");
    try{
        id =Integer.parseInt(p[0]);
        name = p[1];
        adress = p[2];
        age = Integer.parseInt(p[3]);
        diem = Float.parseFloat(p[4]);

    }catch (ArrayIndexOutOfBoundsException e){
    }finally {

    }


    }
    public  void display(){
        System.out.println(this);
    }
    @Override
    public  String toString(){
        return "Student { " + "id = " + id +", age = " + age +
                ", name = " + name + ", adress = " + adress +
                ", gpa = " + diem +"}";
    }
}
