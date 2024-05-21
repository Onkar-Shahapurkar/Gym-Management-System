package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Customer_Count extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField tf1;
    Choice ch1;
    JButton bt1,bt2;
    JPanel p1,p2,p3;
    Font f,f1;
    JFrame frame = new JFrame();
    String x[] = {"Receipt ID","Name","Surname","Email","Address","Contact No.","Payment plan","Gender","Height","Weight","Remarks","Trainer Name","Category"};
    String y[][]=new String[20][14];
    int i=0,j=0;
    JTable t;
    
     public Customer_Count()
    {
      super("Update Customer");
      setSize(480,250);
      setLocation(70,30);
      setResizable(false);
      ImageIcon img = new ImageIcon("D://Programming//Main Projects//Gym Management System//heart.png");
      Image im = img.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT);
      l4 = new JLabel(new ImageIcon(im));
      
      f = new Font("MS UI Gothic",Font.BOLD,18);
      f1 = new Font("Lucida Fax",Font.BOLD,25);
      
      l1 = new JLabel("Trainer ID");
      l2 = new JLabel("Trainer Name");
      l3 = new JLabel("Customers of Trainer");
      
      l3.setFont(f1);
      l3.setHorizontalAlignment(JLabel.CENTER);
      l3.setForeground(Color.YELLOW);
      
      tf1 = new JTextField();
      
      ch1 =new Choice();
      try
      {
         connectionclass obj0 = new connectionclass();
         String q0 = "select tid from add_trainer;";
         ResultSet rest=obj0.stmt.executeQuery(q0);
         while(rest.next())
         {
           ch1.add(rest.getString("tid"));
         }
      }
       catch(Exception ex)
       {
        ex.printStackTrace();
       }
      
      bt1 = new JButton("Check");
      bt2 = new JButton("Cancel");
      
      bt1.setForeground(Color.CYAN);
      bt2.setForeground(Color.RED);
      bt1.setBackground(Color.BLACK);
      bt2.setBackground(Color.BLACK);
      
      l1.setForeground(Color.WHITE);
      l2.setForeground(Color.WHITE);
      
      bt1.addActionListener(this);
      bt2.addActionListener(this);
      
      l1.setFont(f);
      l2.setFont(f);
      tf1.setFont(f);
      ch1.setFont(f);
      bt1.setFont(f);
      bt2.setFont(f);
      
      p1 = new JPanel();
      p1.setLayout(new GridLayout(1,1,10,10));
      p1.setBackground(Color.BLACK);
      p1.add(l3);
      
      p2 = new JPanel();
      p2.setLayout(new GridLayout(1,1,10,10));
      p2.setBackground(Color.BLACK);
      p2.add(l4);
      
      p3 = new JPanel();
      p3.setLayout(new GridLayout(3,2,10,10));
      p3.setBackground(Color.BLACK);
      p3.add(l1);
      p3.add(ch1);
      p3.add(l2);
      p3.add(tf1);
      p3.add(bt1);
      p3.add(bt2);
      
      setLayout(new BorderLayout(0,0));
      
      add(p1,"North");
      add(p2,"West");
      add(p3,"Center");
      
      ch1.addMouseListener(new MouseAdapter()
       {
          public void mouseClicked(MouseEvent arg0)
          {
             try
             {
               connectionclass obj2 = new connectionclass();
               int tid = Integer.parseInt(ch1.getSelectedItem());
               String q2 = "select * from add_trainer where tid="+tid+";";
               ResultSet rest2=obj2.stmt.executeQuery(q2);
               while(rest2.next())
               {
                tf1.setText(rest2.getString("name"));
               }
             }
             catch(Exception ex1)
             {
               ex1.printStackTrace();
             }
          }
       }); 
    }
     
    public void actionPerformed(ActionEvent e)
    {
     if(e.getSource()==bt1)
     {
        String tname=tf1.getText();
        Related_Customer rc = new Related_Customer(tname);
        rc.setVisible(true); 
     }
     if(e.getSource()==bt2)
     {
      JOptionPane.showMessageDialog(null, "Are you Sure ?");
      this.setVisible(false);
     }
    }
    public static void main(String args[])
    {
     Customer_Count cc = new Customer_Count();
     cc.setVisible(true);
    }
 }
