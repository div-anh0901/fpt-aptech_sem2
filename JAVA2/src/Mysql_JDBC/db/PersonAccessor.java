package Mysql_JDBC.db;

import Mysql_JDBC.entity.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonAccessor {

    public  void insert(Person p) throws  Exception{
        Connection conn = null;
        PreparedStatement prst =null;
        try{
            Connector connector = new Connector();
            conn = connector.getConnection();
            prst = conn.prepareStatement("INSERT INTO bank1(`name`) VALUES (?)");
            prst.setString(1,p.getName());
            prst.execute();
        }finally {
            Connector.close(prst);
            Connector.close(conn);
        }
    }

    public void update(Person p) throws Exception{
        Connection conn = null;
        PreparedStatement prst = null;
        try{
            Connector connector = new Connector();
            conn = connector.getConnection();
            prst = conn.prepareStatement("update bank1 set name = ? where id = ?");
            System.out.println("Nhap ten");
            prst.setString(1,p.getName());
            System.out.println("Nhap id can update");
            prst.setInt(2,p.getId());
            prst.executeUpdate();
        }finally {
            Connector.close(prst);
            Connector.close(conn);
        }
    }
    public  void delete(Person p) throws Exception{
        Connection conn = null;
        PreparedStatement prst = null;
        try {
            Connector connector = new Connector();
            conn = connector.getConnection();
            prst = conn.prepareStatement("delete from bank1 where id = ?");
            System.out.println("Nhap id can xoa");
            prst.setInt(1, p.getId());
            prst.executeUpdate();
        } finally {
            Connector.close(prst);
            Connector.close(conn);
        }
    }

    public void  findByPrimaryKey(int id) throws  Exception{
        Person retValue = null;
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        try{
            Connector connector = new Connector();
            conn = connector.getConnection();
            String sql = "select * from bank1 where id = ?";

            prst = conn.prepareStatement(sql);
            prst.setInt(1,id);
            rs = prst.executeQuery();
            while (rs.next()){
                System.out.println("id : " + rs.getInt(1) +  " name : "+ rs.getString(2));
            }
        }finally {
            Connector.close(rs);
            Connector.close(prst);
            Connector.close(conn);
        }
    }

    public  void getPersons() throws Exception{
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        try {
            Connector connector = new Connector();
            conn = connector.getConnection();
            String sql = "Select * from bank1";
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();
            while (rs.next()){
                System.out.println("Id : " + rs.getInt(1) + " name : " + rs.getString(2));
           }
        }finally {
            Connector.close(rs);
            Connector.close(prst);
            Connector.close(conn);
        }
    }

//    public List<Person> getPersons(String name) throws Exception{
//        List<Person> retValue = new ArrayList<Person>();
//        Connection conn = null;
//        PreparedStatement prst = null;
//        ResultSet rs = null;
//        try{
//            Connector connector = new Connector();
//            conn = connector.getConnection();
//            String sql = "Select * from bank1";
//            if(name != null && !name.equals("")){
//                sql += "where name like '"+name+"'";
//            }
//            prst = conn.prepareStatement(sql);
//            rs = prst.executeQuery();
//            while (rs.next()){
//                int id = rs.getInt(1);
//                String dbName = rs.getString(2);
//                Person p = new Person();
//                p.setId(id);
//                p.setName(dbName);
//                retValue.add(p);
//            }
//        }finally {
//            Connector.close(rs);
//            Connector.close(prst);
//            Connector.close(conn);
//        }
//        return  retValue;
//    }


}
