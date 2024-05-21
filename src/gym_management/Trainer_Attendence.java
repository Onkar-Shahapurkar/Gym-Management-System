package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Trainer_Attendence extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    Choice ch1,ch2,ch3;
    JButton bt1,bt2;
    JPanel p1,p2;
    Font f2,f1;

    Trainer_Attendence()
    {
      super("Trainer Attendence");
      setSize(400,250);
      setLocation(70,10);
      setResizable(false);

      f1 = new Font("Lucida Fax",Font.BOLD,25);
      f2 = new Font("MS UI Gothic",Font.BOLD,18);

      l1 = new JLabel("Trainer ID");
      l2 = new JLabel("Morning Time");
      l3 = new JLabel("Evening Time");
      l4 = new JLabel("Trainer Attendence");

      l1.setForeground(Color.WHITE);
      l2.setForeground(Color.WHITE);
      l3.setForeground(Color.WHITE);

      l4.setForeground(Color.YELLOW);  
      l4.setFont(f1);
      l4.setHorizontalAlignment(JLabel.CENTER);

      l1.setFont(f2);
      l2.setFont(f2);
      l3.setFont(f2);

      ch1 = new Choice();
      ch1.add("Absent");
      ch1.add("Present");
      ch1.setFont(f2);

      ch2 = new Choice();
      ch2.add("Absent");
      ch2.add("Present");
      ch2.setFont(f2);

      ch3 = new Choice();
      try
      {
          connectionclass obj = new connectionclass();
          String q ="select tid from add_trainer";
          ResultSet rs = obj.stmt.executeQuery(q);
          while(rs.next())
          {
            ch3.add(rs.getString("tid"));
          }
      }
      catch(Exception ex)
      {
        ex.printStackTrace();
      }
      ch3.setFont(f2);

      bt1 = new JButton("Submit");
      bt2 = new JButton("Cancel");

      bt1.setForeground(Color.WHITE);
      bt2.setForeground(Color.RED);
      bt1.setBackground(Color.BLACK);
      bt2.setBackground(Color.BLACK);

      bt1.addActionListener(this);
      bt2.addActionListener(this);

      bt1.setFont(f2);
      bt2.setFont(f2);

      p1= new JPanel();
      p1.setLayout(new GridLayout(4,2,10,10));
      p1.setBackground(Color.BLACK);
      p1.add(l1);
      p1.add(ch3);
      p1.add(l2);
      p1.add(ch1);
      p1.add(l3);
      p1.add(ch2);
      p1.add(bt1);
      p1.add(bt2);

      p2 = new JPanel();
      p2.setLayout(new GridLayout(1,1,10,10));
      p2.setBackground(Color.BLACK);
      p2.add(l4);

      setLayout(new BorderLayout(0,0));
      add(p2,"North");
      add(p1,"Center");

    }

    public void actionPerformed(ActionEvent e)
    {
     String tid = ch3.getSelectedItem();
     String mgt = ch1.getSelectedItem();
     String egt = ch2.getSelectedItem();
     String date = new java.util.Date().toString();

     if(e.getSource()==bt1)
     {
         try
         {
         connectionclass obj1 = new connectionclass();
         String q1 = "insert into trainer_attendence values("+tid+",'"+mgt+"','"+egt+"','"+date+"')";
         obj1.stmt.executeUpdate(q1);
         JOptionPane.showMessageDialog(null,"Data Inserted Successfully !!");
         setVisible(false);
         }
         catch(Exception ex)
         {
           ex.printStackTrace();
         }

     }

     if(e.getSource()==bt2)
     {
      JOptionPane.showMessageDialog(null, "Are you Sure ?");
      this.setVisible(false);
     }
    }

}
