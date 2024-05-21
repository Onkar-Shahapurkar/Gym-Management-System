package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Related_Customer extends JFrame
{
    String x[] = {"Receipt ID","Name","Surname","Email","Address","Contact No.","Payment plan","Gender","Height","Weight","Remarks","Trainer Name","Category"};
    Font f;
    String y[][]=new String[20][14];
    int i=0,j=0;
    JTable t;
    
    Related_Customer(String tname)
    {
      super("Related Customer");
      setSize(1500,400);
      setLocation(1,1);
      setResizable(true);
      String n = tname;
      f = new Font("MS UI Gothic",Font.BOLD,15);
      try
      {
         connectionclass obj = new connectionclass();
         String q ="select * from add_customer where trainer_name='"+n+"'";
         ResultSet rest = obj.stmt.executeQuery(q);
         while(rest.next())
          {
            y[i][j++]=rest.getString("receipt_no");
            y[i][j++]=rest.getString("name");
            y[i][j++]=rest.getString("surname");
            y[i][j++]=rest.getString("email");
            y[i][j++]=rest.getString("address");
            y[i][j++]=rest.getString("contact");
            y[i][j++]=rest.getString("payment_plan");
            y[i][j++]=rest.getString("gender");
            y[i][j++]=rest.getString("height");
            y[i][j++]=rest.getString("weight");
            y[i][j++]=rest.getString("remarks");
            y[i][j++]=rest.getString("trainer_name");
            y[i][j++]=rest.getString("category");
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
       add(sp);
       
    }
}
