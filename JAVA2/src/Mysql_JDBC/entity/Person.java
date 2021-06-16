package Mysql_JDBC.entity;

import java.util.Scanner;

public class Person {
    Scanner input = new Scanner(System.in);
    private int id;
    private  String name;

    public  int getId(){
        id= input.nextInt();
        return  id;
    }
    public  void setId(int id){
        this.id = id;
    }
    public  String getName(){
        name = input.nextLine();
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }
}
