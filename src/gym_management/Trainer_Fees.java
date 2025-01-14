package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Trainer_Fees extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6;
    JButton bt1,bt2;
    Choice ch1;
    JTextField tf1,tf2,tf3;
    JPanel p1,p2,p3;
    
     public Trainer_Fees()
    {
      super("Trainer Fees");
      setSize(670,300);
      setLocation(10,10);
      setResizable(false);
      
      Font f = new Font("MS UI Gothic",Font.BOLD,18);
      Font f1 = new Font("Lucida Fax",Font.BOLD,25);
      
      ImageIcon img = new ImageIcon("D://Programming//Main Projects//Gym Management System//Gym2.gif");
      Image im = img.getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT);
      l6 = new JLabel(new ImageIcon(im));
      
      l1 = new JLabel("Trainer ID");
      l2 = new JLabel("Name");
      l3 = new JLabel("Category");
      l4 = new JLabel("Charges per Client");
      l5 = new JLabel("Trainer Fees Info");
      l5.setFont(f1);
      l5.setHorizontalAlignment(JLabel.CENTER);
      l5.setForeground(Color.YELLOW);
      
      tf1 = new JTextField();
      tf2 = new JTextField();
      tf3 = new JTextField();
      
      l1.setFont(f);
      l2.setFont(f);
      l3.setFont(f);
      l4.setFont(f);
      
      tf1.setFont(f);
      tf2.setFont(f);
      tf3.setFont(f);
      
      l1.setForeground(Color.WHITE);
      l2.setForeground(Color.WHITE);
      l3.setForeground(Color.WHITE);
      l4.setForeground(Color.WHITE);
      
      ch1 = new Choice();
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
      ch1.setFont(f);
      
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
      p2.setLayout(new GridLayout(5,2,10,10));
      p2.add(l1);
      p2.add(ch1);
      p2.add(l2);
      p2.add(tf1);
      p2.add(l3);
      p2.add(tf2);
      p2.add(l4);
      p2.add(tf3);
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
               String q2 = "select * from add_trainer where tid="+id+";";
               ResultSet rest2=obj2.stmt.executeQuery(q2);
               while(rest2.next())
               {
                tf1.setText(rest2.getString("name"));
                tf2.setText(rest2.getString("categroy"));
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
     if(e.getSource()==bt1)
     {
       String id = ch1.getSelectedItem();
       String name = tf1.getText();
       String category = tf2.getText();
       float fees = Float.parseFloat(tf3.getText());
       
       try
       {
         connectionclass obj = new connectionclass();
         String q = "insert into fee_trainer values("+id+",'"+name+"','"+category+"',"+fees+");";
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
     Trainer_Fees tf = new Trainer_Fees();
     tf.setVisible(true);
    }
}
