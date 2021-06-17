package Xac_Thuc_User;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public  static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/account";
        String username = "root";
        String password = "";
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected Database");
        }catch (Exception e){
            e.printStackTrace();
        }
        return  conn;
    }
}
