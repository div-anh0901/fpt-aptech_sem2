package Xac_Thuc_User;

import java.sql.*;
import java.util.Scanner;

public class Menu {
 private final Scanner sc = new Scanner(System.in);
 public  final Connection conn = ConnectDB.getConnection();
 public  final Nhap_User user = new Nhap_User();
 private  void menu() {
     System.out.println("--------Enter Menu ----------");
     System.out.println("1 . Create and valaid User");
     System.out.println("2 . Login Stetament");
     System.out.println("3 . Login PreparedStatement");
     System.out.println("4 . procedureUser");
     System.out.println("5 . exit");
 }
 public void start(){
     boolean flag = true;
     while (flag){
         menu();
         int chioce = sc.nextInt();
         switch (chioce){
             case 1 : {
                 System.out.println("-------Create and valaid --------");
                 createUser();
                 break;
             }
             case 2 :{
                 System.out.println("-----------Login Stetament-------------");
                 loginStatement();
                 break;
             }
             case  3 : {
                 System.out.println("------------- Login PreparedStatement--------");
                 loginPreparedStatement();
                 break;
             }
             case 4 : {
                 System.out.println("-------------CALL procedureUser -------------");
                 produceUsers();
             }
             case 5 : {
                 flag = false;
             }
             default: {
                 System.out.println("NOT VALID");
             }
         }
     }
 }
  public  void   createUser(){
      try{

          PreparedStatement pst = conn.prepareStatement("INSERT  INTO users(username, password) VALUES (?,?)");
          boolean flag1 = true;
          while (true){
              System.out.println("Nhap user name");
              // user.setUsername(input.nextLine());
              sc.nextLine();
              String username = sc.nextLine();
              if(username == "" ) {
                  System.out.println("Ban phai nhap user name");
                  break;
              }
//              else if(userDB == username){
//                  System.out.println("username da ton tai");
//                  break;
//              }
              System.out.println("Nhap password");
              String password = sc.nextLine();
              // user.setPassword(input.nextLine());
              if(password == "" ) {
                  System.out.println("Ban phai nhap password");
                  break;
              }else if(password.length() < 3){
                  System.out.println("Password phai nhap 3 ky tu tro len");
                  break;
              }else {
                  pst.setString(1,username);
                  pst.setString(2, password);
                  pst.execute();
                  pst.close();
                  conn.close();
                  break;
              }
          }

      }catch (Exception e){
          e.printStackTrace();
      }
  }
  public  void loginStatement(){
      System.out.println("Nhap username");
      sc.nextLine();
      user.setUsername(sc.nextLine());
      System.out.println("Nhap password");
      user.setPassword(sc.nextLine());
      String dbQuery = "select username from users where username = '"+user.getUsername()+"'" + "and password = '"+user.getPassword()+"'";
      try{
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery(dbQuery);
          while (rs.next()){
              System.out.println("Login Successfully!!!");
          }
      }catch (Exception e) {
          e.printStackTrace();
          System.out.println("Filse!!");
      }

  }

  public  void loginPreparedStatement(){
      System.out.println("Nhap username");
      sc.nextLine();
      user.setUsername(sc.nextLine());
      System.out.println("Nhap password");
      user.setPassword(sc.nextLine());
      String dbQuery = "select username from users where username = '"+user.getUsername()+"'" + "and password = '"+user.getPassword()+"'";
      try{
          PreparedStatement pst = conn.prepareStatement(dbQuery);
          ResultSet rs = pst.executeQuery();
          while (rs.next()){
              System.out.println("Login Successfully!!!");
          }
      }catch (Exception e) {
          e.printStackTrace();
          System.out.println("Filse!!");
      }
  }

  public  void produceUsers(){
     try{
         CallableStatement callst = conn.prepareCall("CALL procedureUser");
         ResultSet rs = callst.executeQuery();
         while (rs.next()){
             System.out.println("Id : " + rs.getInt(1) +
                                ", usernmae : " + rs.getString(2)+
                                ", password : " + rs.getString(3));
         }
     }catch (Exception e){

     }

  }
}
