package Connec_Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMysqlEx {
    private  static String DB_URL = "jdbc:mysql://localhost:3306/nodejs";
    private  static  String USER_NAME = "root";

    private  static  String PASSWORD = "";

    public static void main(String[] args) {
        try{
            Connection conn = getConnection(DB_URL,USER_NAME,PASSWORD) ;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(("select * from users1"));

            while (rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) +
                        "  " + rs.getString(3) + " " + rs.getString(4));
            }
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public  static  Connection getConnection(String dbUrl, String userName, String password){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Connect successFully!!!");
        }catch (Exception e){
            System.out.println("Connect failure");
            e.printStackTrace();
        }
        return conn;
    }
}
