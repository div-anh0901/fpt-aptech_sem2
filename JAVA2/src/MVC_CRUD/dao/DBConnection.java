package MVC_CRUD.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection createConnection(){
        String url = "jdbc:mysql://localhost:3306/nodejs";
        String username = "root";
        String password = "";
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,username,password);
        }catch (Exception e){

            e.printStackTrace();
        }
        return conn;
    }
}
