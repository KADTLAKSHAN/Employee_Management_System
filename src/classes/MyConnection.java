package classes;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class MyConnection {
    
    public static Connection con = null;
    public static Statement st;
    public static PreparedStatement pst;
    

    public static ResultSet rs;
    public static ResultSet rs2; //sometimes we need to use result set within result set so static methods use same variable sametime, bcz of that we need define 2 rs
    
    public static Connection getConnection(){
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_cis_employee_management_system","root","");
            st = con.createStatement();
            
        } catch (Exception e) {
            
            System.out.println("Database Error: " + e.getMessage());
            
        }
        
        return con;
        
    }
    
    public static void clear(){
        con = null;
        st = null;
        pst = null;
    }
    
    
    
    
}
