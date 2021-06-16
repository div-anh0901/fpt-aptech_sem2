package Connec_Mysql;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connec_Mysql1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nodejs";
        String username = "root";
        String password = "";

        Connection con = getConnection(url, username,password);
    }

    public static  Connection getConnection(String url, String username, String password){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connect Database SuccessFully");
        }catch (Exception e){
            System.out.println("Connect database false!!!");
            e.printStackTrace();
        }
        return  conn;
    }
}
