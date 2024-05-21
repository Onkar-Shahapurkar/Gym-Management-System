package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Customer_Fees extends JFrame implements ActionListener
{
    JLabel l7,l1,l2,l3,l4,l5,l6,l8;
    JButton bt1,bt2;
    Choice ch1,ch2;
    JTextField tf1,tf2,tf3,tf4;
    JPanel p1,p2,p3;
    
     public Customer_Fees()
    {
      super("Customer Fees");
      setSize(670,300);
      setLocation(270,250);
      setResizable(false);
      
      Font f = new Font("MS UI Gothic",Font.BOLD,18);
      Font f1 = new Font("Lucida Fax",Font.BOLD,25);
      
      ImageIcon img = new ImageIcon("D://Programming//Main Projects//Gym Management System//Gym3.gif");
      Image im = img.getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT);
      l6 = new JLabel(new ImageIcon(im));
      
      l1 = new JLabel("Receipt ID");
      l2 = new JLabel("Name");
      l3 = new JLabel("Category");
      l4 = new JLabel("Trainer Name");
      l7 = new JLabel("Month");
      l8 = new JLabel("Fees to be paid");
      l5 = new JLabel("Client Fees Info");
      l5.setFont(f1);
      l5.setHorizontalAlignment(JLabel.CENTER);
      l5.setForeground(Color.YELLOW);
      
      tf1 = new JTextField();
      tf2 = new JTextField();
      tf3 = new JTextField();
      tf4 = new JTextField();
      
      l1.setFont(f);
      l2.setFont(f);
      l3.setFont(f);
      l4.setFont(f);
      l7.setFont(f);
      l8.setFont(f);
      
      
      tf1.setFont(f);
      tf2.setFont(f);
      tf3.setFont(f);
      tf4.setFont(f);
     
      l1.setForeground(Color.WHITE);
      l2.setForeground(Color.WHITE);
      l3.setForeground(Color.WHITE);
      l4.setForeground(Color.WHITE);
      l7.setForeground(Color.WHITE);
      l8.setForeground(Color.WHITE);
      
      ch1 = new Choice();
      try
      {
         connectionclass obj0 = new connectionclass();
         String q0 = "select receipt_no from add_customer;";
         ResultSet rest=obj0.stmt.executeQuery(q0);
         while(rest.next())
         {
           ch1.add(rest.getString("receipt_no"));
         }
      }
      catch(Exception ex)
      {
        ex.printStackTrace();
      }
      ch1.setFont(f);
      
      ch2 = new Choice();
      ch2.add("January");
      ch2.add("February");
      ch2.add("March");
      ch2.add("April");
      ch2.add("May");
      ch2.add("June");
      ch2.add("July");
      ch2.add("August");
      ch2.add("September");
      ch2.add("October");
      ch2.add("November");
      ch2.add("December");
      ch2.setFont(f);
      
      bt1 = new JButton("Submit");
      bt2 = new JButton("Cancel");
      
      bt1.setForeground(Color.CYAN);
      bt2.setForeground(Color.RED);
      bt1.setBackground(Color.BLACK);
      bt2.setBackground(Color.BLACK);
      
      bt1.setFont(f);
      bt2.setFont(f);
      
      bt1.addActionListener(this);
      bt2.addActionListener(this);
      
      p1 = new JPanel();
      p1.setLayout(new GridLayout(1,1,10,10));
      p1.add(l5);
      
      p2= new JPanel();
      p2.setLayout(new GridLayout(7,2,10,10));
      p2.add(l1);
      p2.add(ch1);
      p2.add(l2);
      p2.add(tf1);
      p2.add(l3);
      p2.add(tf2);
      p2.add(l4);
      p2.add(tf3);
      p2.add(l7);
      p2.add(ch2);
      p2.add(l8);
      p2.add(tf4);
      p2.add(bt1);
      p2.add(bt2);
      
      p3 = new JPanel();
      p3.setLayout(new GridLayout(1,1,10,10));
      p3.setBackground(Color.BLACK);
      p3.add(l6);
      
      p1.setBackground(Color.BLACK);
      p2.setBackground(Color.BLACK);
      p3.setBackground(Color.BLACK);
      
      setLayout(new BorderLayout(0,0));
      
      add(p1,"North");
      add(p2,"Center");
      add(p3,"West");
      
      ch1.addMouseListener(new MouseAdapter()
       {
          public void mouseClicked(MouseEvent arg0)
          {
             int id = Integer.parseInt(ch1.getSelectedItem());
             try
             {
               connectionclass obj2 = new connectionclass();
               String q2 = "select * from add_customer where receipt_no="+id+";";
               ResultSet rest2=obj2.stmt.executeQuery(q2);
               while(rest2.next())
               {
                tf1.setText(rest2.getString("name"));
                tf2.setText(rest2.getString("category"));
                tf3.setText(rest2.getString("trainer_name"));
               }
               String tname= tf3.getText();
               connectionclass obj1 = new connectionclass();
               String q1 = "select fess from fee_trainer where name='"+tname+"';";
               ResultSet rest1=obj1.stmt.executeQuery(q1);
               while(rest1.next())
               {
                tf4.setText(rest1.getString("fess"));
               }
             }
             catch(Exception ex2)
             {
               ex2.printStackTrace();
             }
          }
       });
    }
      
    public void actionPerformed(ActionEvent e)
    {
        
       String id = ch1.getSelectedItem();
       String name = tf1.getText();
       String category = tf2.getText();
       float fees = Float.parseFloat(tf4.getText());
       String trainer_name = tf3.getText();
       String month = ch2.getSelectedItem();
       
     if(e.getSource()==bt1)
     {
       try
       {
         connectionclass obj = new connectionclass();
         String q = "insert into pay_customer values("+id+",'"+name+"','"+category+"',"+fees+",'"+month+"','"+trainer_name+"');";
         obj.stmt.executeUpdate(q);
         JOptionPane.showMessageDialog(null,"Data Inserted Successfully !!");
         setVisible(false);
       }
       catch(Exception ex3)
       {
        ex3.printStackTrace();
       }
     }
     if(e.getSource()==bt2)
     {
      JOptionPane.showMessageDialog(null, "Are you Sure ?");
      this.setVisible(false);
     }
    }   
    public static void main(String args[])
    {
     Customer_Fees cf = new Customer_Fees();
     cf.setVisible(true);
    }
}
