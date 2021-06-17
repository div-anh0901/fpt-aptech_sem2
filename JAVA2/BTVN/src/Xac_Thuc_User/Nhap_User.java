package Xac_Thuc_User;

import java.util.Scanner;

public class Nhap_User {
    private Scanner input = new Scanner(System.in);
    private int id ;
    private  String username;
    private  String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

}
