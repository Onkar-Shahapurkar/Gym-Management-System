package gym_management;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class FeeReminder extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4;
    JButton bt1,bt2;
    Choice ch1;
    JTextField tf1,tf2;
    JPanel p1,p2;
    String em ;
    
    public FeeReminder()
    {
      super("Fees Reminder");
      setSize(450,250);
      setLocation(270,250);
      setResizable(false);
      
      Font f = new Font("MS UI Gothic",Font.BOLD,18);
      Font f1 = new Font("Lucida Fax",Font.BOLD,25);
      
      l1 = new JLabel("Receipt ID :");
      l2 = new JLabel("Enter Month :");
      l3 = new JLabel("FEE REMINDER");
      l4 = new JLabel("Customer Name:");
      
      l3.setFont(f1);
      l3.setHorizontalAlignment(JLabel.CENTER);
      l3.setForeground(Color.YELLOW);
      
      tf1 = new JTextField();
      tf2 = new JTextField();
       
      l1.setFont(f);
      l2.setFont(f);
      l4.setFont(f);
      
      tf1.setFont(f);
      tf2.setFont(f);
       
      l1.setForeground(Color.WHITE);
      l2.setForeground(Color.WHITE);
      l4.setForeground(Color.WHITE);
       
      ch1 = new Choice();
      try
      {
         connectionclass obj0 = new connectionclass();
         String q0 = "select receipt_no,name from add_customer;";
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
      
      bt1 = new JButton("Send");
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
      p1.add(l3);
      
      p2= new JPanel();
      p2.setLayout(new GridLayout(4,2,10,10));
      p2.add(l1);
      p2.add(ch1);
      p2.add(l4);
      p2.add(tf2);
      p2.add(l2);
      p2.add(tf1);
      p2.add(bt1);
      p2.add(bt2);
      
      p1.setBackground(Color.BLACK);
      p2.setBackground(Color.BLACK);
      
      setLayout(new BorderLayout(0,0));
      
      add(p1,"North");
      add(p2,"Center");
      
      ch1.addMouseListener(new MouseAdapter()
       {
          public void mouseClicked(MouseEvent arg0)
          {
             int id = Integer.parseInt(ch1.getSelectedItem());
             try
             {
               connectionclass obj2 = new connectionclass();
               String q2 = "select email,name from add_customer where receipt_no="+id+";";
               ResultSet rest2=obj2.stmt.executeQuery(q2);
               while(rest2.next())
               {
                em = rest2.getString("email");
                tf2.setText(rest2.getString("name"));
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
        
     String mon = tf1.getText();
       
     if(e.getSource()==bt1)
     { 
        SendEmail se = new SendEmail(mon,em);
        JOptionPane.showMessageDialog(null, "Email Sent Successfully !!!");
     }
     if(e.getSource()==bt2)
     {
      JOptionPane.showMessageDialog(null, "Are you Sure ?");
      this.setVisible(false);
     }
    }
    public static void main(String args[])
    {
     FeeReminder fr = new FeeReminder();
     fr.setVisible(true);
    }
}
