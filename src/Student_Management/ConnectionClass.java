/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student_Management;
import java.sql.*;
/**
 *
 * @author HP
 */
public class ConnectionClass {
    Connection conn;
    Statement stm;
    ConnectionClass(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","");
            stm=conn.createStatement();
            
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args){
        new ConnectionClass();
        
    }
    
        
    
}
