package Mysql_JDBC.ui;

import Mysql_JDBC.db.Connector;
import Mysql_JDBC.db.PersonAccessor;
import Mysql_JDBC.entity.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        PersonAccessor pa = new PersonAccessor();
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("=====================Menu=====================");
            System.out.println("1 . Insert bank");
            System.out.println("2 . Update bank");
            System.out.println("3 . delete bank");
            System.out.println("4 . find by id bank");
            System.out.println("5 : show user");
            System.out.println("6 . exit");
            int choose = input.nextInt();
            switch (choose){
                case  1 : {
                    System.out.println("nhap ten");
                     try{
                         pa.insert(p);
                     }catch (Exception e){
                         e.printStackTrace();
                     }
                    break;
                }
                case  2 :{
                    System.out.println("update");
                    try{
                        pa.update(p);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                }
                case 3 : {
                    System.out.println("delete");
                        try{
                            pa.delete(p);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    break;
                }
                case 4 : {
                    System.out.println("Show user by id");
                    int id = input.nextInt();
                    try{
                        pa.findByPrimaryKey(id);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                }
                case  5 :{
                    System.out.println("show user");
                        try{
                            pa.getPersons();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    break;
                }
                case  6 :{
                    flag = false;
                    break;
                }
                default:{
                    System.out.println("Not Invalid");
                }
            }


        }
    }
}
