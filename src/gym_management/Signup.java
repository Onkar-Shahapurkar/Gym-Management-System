package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField tf;
    JPasswordField pf;
    JPanel p1;
    JButton b1,b2;
    Font f1,f2;
    
    Signup()
    {
      super("Sign Up");
      setResizable(false);
      setLocation(50,50);
      setSize(400,200);
      
      f1 = new Font ("Arial",Font.BOLD,20);
      f2 = new Font ("Arial",Font.BOLD,15);
      
      l1 = new JLabel("Welcome to Fitness Point");
      l2 = new JLabel("Enter UserName");
      l3 = new JLabel("Enter Password");
      
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
      
      ImageIcon img = new ImageIcon("D://Programming//Main Projects//Gym Management System//login.png");
      Image img2 = img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
      ImageIcon img3 = new ImageIcon(img2);
      l4 = new JLabel(img3);
      
      b1 = new JButton("Login");
      b2 = new JButton("Cancel");
      b1.addActionListener(this);
      b2.addActionListener(this);
      
      b1.setForeground(Color.WHITE);
      b2.setForeground(Color.WHITE);
      b1.setBackground(Color.BLACK);
      b2.setBackground(Color.BLACK);
      b1.setFont(f2);
      b2.setFont(f2);
      
      p1 = new JPanel();
      p1.setLayout(new GridLayout(3,2,10,10));
      p1.add(l2);
      p1.add(tf);
      p1.add(l3);
      p1.add(pf);
      p1.add(b1);
      p1.add(b2);
      
      setLayout(new BorderLayout(30,30));
      add(l1,"North");
      add(l4,"East");
      add(p1,"Center");
      
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
          String q = "insert into login values('"+name+"','"+pass+"');";
          obj.stmt.executeUpdate(q);
          LoginPage p =new LoginPage();
          this.setVisible(false);
          p.setVisible(true);
          
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
    }
}
