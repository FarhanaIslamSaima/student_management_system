/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student_Management;

/**
 *
 * @author HP
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class LoginPage extends JFrame{
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    LoginPage(){
        f=new JFrame("Login");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        l1=new JLabel("Username");
        l1.setBounds(40,20,100,30);
        f.add(l1);
        
        l2=new JLabel("Password");
        l2.setBounds(40,70,100,30);
        f.add(l2);
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        f.add(t1);
                t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        f.add(t2);
        
        
        
        
        
        
        
    }
    public static void main(String[] args){
        new LoginPage();
            
        }
    
    
}
