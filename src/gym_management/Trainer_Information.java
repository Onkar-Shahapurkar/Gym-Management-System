package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Trainer_Information extends JFrame implements ActionListener
{
    String x[] = {"Trainer ID","Name","Surname","Email","Address","Contact No.","Emg No.","Category","Term","Gender","Height","Weight","Remarks"};
    JLabel l1,l2;
    JTextField tf;
    JButton bt1;
    JPanel p1,p2,p3;
    Font f2,f1;
    String y[][]=new String[20][13];
    int i=0,j=0;
    JTable t;
    Font f;
    
    Trainer_Information()
    {
      super("Trainer Information");
      setSize(1500,400);
      setLocation(1,1);
      setResizable(true);
      f1 = new Font("Lucida Fax",Font.BOLD,25);
      f2 = new Font("MS UI Gothic",Font.BOLD,18);
      
      try
      {
         connectionclass obj = new connectionclass();
         String q ="select * from add_trainer";
         ResultSet rest = obj.stmt.executeQuery(q);
         while(rest.next())
          {
            y[i][j++]=rest.getString("tid");
            y[i][j++]=rest.getString("name");
            y[i][j++]=rest.getString("fname");
            y[i][j++]=rest.getString("email");
            y[i][j++]=rest.getString("address");
            y[i][j++]=rest.getString("contactno");
            y[i][j++]=rest.getString("emergencyno");
            y[i][j++]=rest.getString("categroy");
            y[i][j++]=rest.getString("term");
            y[i][j++]=rest.getString("gender");
            y[i][j++]=rest.getString("height");
            y[i][j++]=rest.getString("weight");
            y[i][j++]=rest.getString("remarks");
            i++;
            j=0;
          }
         t = new JTable(y,x);
         t.setFont(f);
         t.setBackground(Color.BLACK);
         t.setForeground(Color.WHITE);
         
      }
      catch(Exception ex)
      {
        ex.printStackTrace();
      }
      
      JScrollPane sp = new JScrollPane(t);
      
      l1= new JLabel("Delete any Trainer ?");
      l1.setForeground(Color.YELLOW);  
      l1.setFont(f1);
      l1.setHorizontalAlignment(JLabel.CENTER);
      
      p1= new JPanel();
      p1.setLayout(new GridLayout(1,1,10,10));
      p1.add(l1);
      
      tf = new JTextField();
      bt1 = new JButton("Delete Trainer");
      tf.setFont(f);
      tf.setFont(f);
      
      bt1.addActionListener(this);
      bt1.setBackground(Color.BLACK);
      bt1.setForeground(Color.RED);
      bt1.setFont(f2);
      
      l2= new JLabel("Trainer ID:");
      l2.setForeground(Color.YELLOW);  
      l2.setFont(f2);
      l2.setHorizontalAlignment(JLabel.CENTER);
      
      p2= new JPanel();
      p2.setLayout(new GridLayout(1,3,10,10));  
      p2.add(l2);
      p2.add(tf);
      p2.add(bt1);
      
      p3= new JPanel();
      p3.setLayout(new GridLayout(2,1,10,10));  
      p3.add(p1);
      p3.add(p2);
      
      p1.setBackground(Color.BLACK);
      p2.setBackground(Color.BLACK);
      p3.setBackground(Color.BLACK);
      
      add(p3,"South");
      add(sp);
     
    }
    
    public void actionPerformed(ActionEvent e)
    {
      int id = Integer.parseInt(tf.getText());
      if(e.getSource()==bt1)
      {
        try
        {
          connectionclass obj1 = new connectionclass();
          String q1 ="delete from add_trainer where tid="+id+"";
          obj1.stmt.executeUpdate(q1);
          setVisible(false);
          Trainer_Information ti = new Trainer_Information();
          ti.setVisible(true);
        }
        catch(Exception ex1)
        {
          ex1.printStackTrace();
        }
      }
    }
    public static void main(String args[])
    {
     Trainer_Information tf = new Trainer_Information();
     tf.setVisible(true);
    }


}
