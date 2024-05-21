package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField tf;
    JPasswordField pf;
    JPanel p1;
    JButton b1,b2,bt3;
    Font f1,f2;
    
    LoginPage()
    {
      super("Login");
      setResizable(true);
      setLocation(50,50);
      setSize(400,205);
      
      f1 = new Font ("Arial",Font.BOLD,20);
      f2 = new Font ("Arial",Font.BOLD,15);
      
      l1 = new JLabel("Welcome to Fitness Point");
      l2 = new JLabel("UserName");
      l3 = new JLabel("Password");
      
      l1.setHorizontalAlignment(JLabel.CENTER);
      l1.setForeground(Color.RED);
      l2.setForeground(Color.BLUE);
      l3.setForeground(Color.BLUE);
      l1.setFont(f1);
      l2.setFont(f2);
      l3.setFont(f2);
      
      tf = new JTextField();
      pf = new JPasswordField();
      tf.setFont(f2);
      pf.setFont(f2);
      
      ImageIcon img = new ImageIcon("D://Programming//Main Projects//Gym Management System//Train.gif");
      l4 = new JLabel(img);
      
      b1 = new JButton("Login");
      b2 = new JButton("Cancel");
      bt3 = new JButton("Register User");
      b1.addActionListener(this);
      b2.addActionListener(this);
      bt3.addActionListener(this);      
      bt3.setHorizontalAlignment(JButton.CENTER);
      
      b1.setForeground(Color.WHITE);
      b2.setForeground(Color.WHITE);
      bt3.setForeground(Color.WHITE);
      b1.setBackground(Color.BLACK);
      b2.setBackground(Color.BLACK);
      bt3.setBackground(Color.BLACK);
      b1.setFont(f2);
      b2.setFont(f2);
      bt3.setFont(f2);
      
      p1 = new JPanel();
      p1.setLayout(new GridLayout(3,2,10,10));
      p1.add(l2);
      p1.add(tf);
      p1.add(l3);
      p1.add(pf);
      p1.add(b1);
      p1.add(b2);
      
      setLayout(new BorderLayout(10,0));
      add(l1,"North");
      add(p1,"Center");
      add(l4,"West");
      add(bt3,"South");

    }
    
    public void actionPerformed(ActionEvent e)
    {
      String name = tf.getText();
      String pass = pf.getText();
      if(e.getSource()==b1)
      {
        try
        {
          connectionclass obj = new connectionclass();
          String q = "select * from login where username='"+name+"' and password='"+pass+"'";
          ResultSet rest = obj.stmt.executeQuery(q);
          if(rest.next())
          {
           Homepage h = new Homepage();
           h.setVisible(true);
           this.setVisible(false);
          }
          else
          {
           JOptionPane.showMessageDialog(null, "Invalid Credentials");
           this.setVisible(false);
          }
        }
        catch(Exception ex)
        {
          ex.printStackTrace();
        }
      }
      if(e.getSource()==b2)
      {
        JOptionPane.showMessageDialog(null, "Are you Sure ?");
        this.setVisible(false);
      }
      
      if(e.getSource()==bt3)
      {
        this.setVisible(false);
        Signup su = new Signup();
        su.setVisible(true);
      }
    }
    public static void main(String args[])
    {
      LoginPage p = new LoginPage();
      p.setVisible(true);
    }
}
