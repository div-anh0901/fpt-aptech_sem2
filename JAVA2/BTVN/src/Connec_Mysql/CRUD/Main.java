package Connec_Mysql.CRUD;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private  static String DB_URL = "jdbc:mysql://localhost:3306/nodejs";
    private  static  String USER_NAME = "root";
    private  static  String PASSWORD = "";
    public static void main(String[] args) {
        Information infor= new Information();
        Scanner input = new Scanner(System.in);
        try{

            boolean flag = true;
            while (flag){
                System.out.println("CURD IN DATABASE");
                System.out.println("1 . Insert User");
                System.out.println("2 . Update User");
                System.out.println("3 . Delete User");
                System.out.println("4 . Show User");
                System.out.println("5 . Search User");
                System.out.println("6 . exit");
                int choose;
                choose = input.nextInt();
                switch (choose){
                    case 1 : {
                        String name ;
                        int age ;
                        String address;
                        String phone ;
                        try{
                            Connection conn = getConnnection(DB_URL,USER_NAME,PASSWORD);
                            ResultSet rs;
                            PreparedStatement pst = conn.prepareStatement("INSERT INTO account (`id`,`name`, `age`, `address`, `phone`) VALUES (?,?,?,?,?) ");
                            System.out.println("Insert user : ");
                            System.out.println("id");
                            pst.setInt(1, infor.getId());
                            System.out.println("Name");
                            pst.setString(2,infor.getName());
                            System.out.println("age");
                            pst.setInt(3,infor.getAge());
                            System.out.println("address");
                            pst.setString(4,infor.getAddress());
                            System.out.println("phone");
                            pst.setString(5,infor.getPhone());
                            pst.execute();
                            conn.close();
                        }catch (Exception e) {
                            e.printStackTrace();
                        }

                        break;
                    }
                    case  2 :{
                        try {
                            Connection conn = getConnnection(DB_URL,USER_NAME,PASSWORD);
                            ResultSet rs;
                            System.out.println("UPDATE USER");
                            PreparedStatement pst = conn.prepareStatement("UPDATE account SET `name` = ?, `age` = ?, `address` = ?, `phone` = ? WHERE `id` = ? ");

                            System.out.println("update name");
                            pst.setString(1,infor.getName());
                            System.out.println("update age");
                            pst.setInt(2, infor.getAge());
                            System.out.println("update address");
                            pst.setString(3, infor.getAddress());
                            System.out.println("updata phone");
                            pst.setString(4,infor.getPhone());
                            System.out.println("Nhap id can update");
                            pst.setInt(5,infor.getId());
                            pst.executeUpdate();
                            pst.close();
                            conn.close();
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                        break;
                    }
                    case 3 : {
                            try{
                                Connection conn = getConnnection(DB_URL,USER_NAME,PASSWORD);
                                ResultSet rs;
                                PreparedStatement pst = conn.prepareStatement("DELETE FROM account WHERE  `id` = ?");
                                System.out.println("Nhap id de xoa");
                                pst.setInt(1,infor.getId());
                                pst.executeUpdate();
                                pst.close();
                                conn.close();
                        }catch (Exception e){
                                e.printStackTrace();
                            }
                        break;
                    }

                    case 4 : {
                        Connection conn = getConnnection(DB_URL,USER_NAME,PASSWORD);
                        ResultSet rs;
                        System.out.println("SHOW ACCOUNT DATABASE");
                        PreparedStatement pst = conn.prepareStatement("SELECT * FROM account");
                        rs = pst.executeQuery();
                        while (rs.next()){
                            System.out.println("id =" +
                                    rs.getInt(1) +
                                    ", name = " + rs.getString(2) +
                                    ", age = " + rs.getInt(3) +
                                    ", address = " + rs.getString(4)+
                                    ", phone = " + rs.getString(5));
                        }
                        rs.close();
                        pst.close();
                        conn.close();
                        break;
                    }
                    case 5: {
                        Connection conn = getConnnection(DB_URL,USER_NAME,PASSWORD);
                        ResultSet rs;
                        System.out.println("Search user by id");
                        PreparedStatement pst = conn.prepareStatement("SELECT  * FROM account WHERE  `id` = ? ");
                        System.out.println("Nhap id");
                        pst.setInt(1,infor.getId());
                        rs = pst.executeQuery();
                        while (rs.next()){
                            System.out.println("id = " + rs.getInt(1) +
                                    ", name = " + rs.getString(2)+
                                    ", age = " +rs.getInt(3)+
                                    ", address = " +rs.getString(4) +
                                    ", phone = " + rs.getString(5)
                            );
                        }
                        rs.close();
                        pst.close();
                        conn.close();
                        break;
                    }
                    case 6 : {
                        flag = false;
                    }
                    default:{
                        System.out.println("Invalid");
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static Connection getConnnection(String UrlDB , String userDB , String passDB)  {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(UrlDB,userDB,passDB);
            System.out.println("Connected Database");
        }catch (Exception e){
            e.printStackTrace();
        }
        return  conn;
    }
}
