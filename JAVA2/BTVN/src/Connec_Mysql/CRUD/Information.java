package Connec_Mysql.CRUD;

import java.util.Scanner;

public class Information {
    int id;
    String name;
    int age;
    String address;
    String phone;
    Scanner input = new Scanner(System.in);
    public Information(){

    }
    public  Information(  int id,String name , int age , String address, String phone){
        this.id = id;
            this.name = name;
            this.age = age;
            this.address = address;
            this.phone = phone;
    }
    public int getId(){
        id = input.nextInt();
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public  String getName(){
        input.nextLine();
        name = input.nextLine();
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public  int getAge(){
        age = input.nextInt();
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  String getAddress(){
        input.nextLine();
        address = input.nextLine();
        return address;
    }

    public  void setAddress(String address){
        this.address = address;
    }

    public String getPhone()
    {
        phone =input.nextLine();
        return phone;
    }

    public void setPhone(String sdt) {
        this.phone = phone;
    }

}