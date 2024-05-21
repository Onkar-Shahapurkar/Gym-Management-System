package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.regex.*;

public class Add_Customer extends JFrame implements ActionListener, KeyListener
{
 
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10;
    Choice ch1,ch2,ch3,ch4;
    JButton bt1,bt2,bt3,bt4;
    JPanel p1,p2,p3;
    Font f,f1;
    public Add_Customer()
    {
      super("Add Customer");
      setSize(750,700);
      setLocation(10,10);
      setResizable(true);
      ImageIcon img = new ImageIcon("D://Programming//Main Projects//Gym Management System//logo.png");
      Image im = img.getImage().getScaledInstance(270, 600, Image.SCALE_DEFAULT);
      l15 = new JLabel(new ImageIcon(im));
      
      f = new Font("MS UI Gothic",Font.BOLD,18);
      f1 = new Font("Lucida Fax",Font.BOLD,25);
      
      l1 = new JLabel("Name");
      l2 = new JLabel("Surname");
      l3 = new JLabel("Email");
      l4 = new JLabel("Address");
      l5 = new JLabel("Contact no.");
      l6 = new JLabel("Receipt no.");
      l7 = new JLabel("Payment Plan(month)");
      l8 = new JLabel("Gender");
      l9 = new JLabel("Height (inch)");
      l10 = new JLabel("Weight (kg)");
      l11 = new JLabel("Remarks");
      l12 = new JLabel("Membership Category");
      l13 = new JLabel("Trainer Name");
      l14 = new JLabel("Welcome New Future BodyBuilder");
      
      l14.setFont(f1);
      l14.setHorizontalAlignment(JLabel.CENTER);
      l14.setForeground(Color.YELLOW);
      
      tf1 = new JTextField();
      tf2 = new JTextField();
      tf3 = new JTextField();
      tf4 = new JTextField();
      tf5 = new JTextField();
      tf6 = new JTextField();
      tf7 = new JTextField();
      tf8 = new JTextField();
      tf9 = new JTextField();
      
      tf1.addKeyListener(this);
      tf2.addKeyListener(this);
      
      ch1 = new Choice();
      ch2 = new Choice();
      ch3 = new Choice();
      ch4 = new Choice();
      
      ch1.add("3 Months");
      ch1.add("6 Months");
      ch1.add("12 months");
      ch1.add("18 months");
      ch1.add("24 months");
      
      ch2.add("Male");
      ch2.add("Female");
      
      bt1 = new JButton("Submit");
      bt2 = new JButton("Cancel");
      bt3 = new JButton("Common");
      bt4 = new JButton("Personal");
      
      bt1.setForeground(Color.GRAY);
      bt2.setForeground(Color.RED);
      bt1.setBackground(Color.BLACK);
      bt2.setBackground(Color.BLACK);
      bt3.setBackground(Color.BLACK);
      bt3.setForeground(Color.WHITE);
      bt4.setBackground(Color.BLACK);
      bt4.setForeground(Color.WHITE);
      
      l1.setForeground(Color.WHITE);
      l2.setForeground(Color.WHITE);
      l3.setForeground(Color.WHITE);
      l4.setForeground(Color.WHITE);
      l5.setForeground(Color.WHITE);
      l6.setForeground(Color.WHITE);
      l7.setForeground(Color.WHITE);
      l8.setForeground(Color.WHITE);
      l9.setForeground(Color.WHITE);
      l10.setForeground(Color.WHITE);
      l11.setForeground(Color.WHITE);
      l12.setForeground(Color.WHITE);
      l13.setForeground(Color.WHITE);
      
      bt1.addActionListener(this);
      bt2.addActionListener(this);
      bt3.addActionListener(this);
      bt4.addActionListener(this);
      
      l1.setFont(f);
      l2.setFont(f);
      l3.setFont(f);
      l4.setFont(f);
      l5.setFont(f);
      l6.setFont(f);
      l7.setFont(f);
      l8.setFont(f);
      l9.setFont(f);
      l10.setFont(f);
      l11.setFont(f);
      l12.setFont(f);
      l13.setFont(f);
      
      tf1.setFont(f);
      tf2.setFont(f);
      tf3.setFont(f);
      tf4.setFont(f);
      tf5.setFont(f);
      tf6.setFont(f);
      tf7.setFont(f);
      tf8.setFont(f);
      tf9.setFont(f);
      
      ch1.setFont(f);
      ch2.setFont(f);
      ch3.setFont(f);
      ch4.setFont(f);
      
      bt1.setFont(f);
      bt2.setFont(f);
      bt3.setFont(f);
      bt4.setFont(f);
      
      p1= new JPanel();
      p1.setLayout(new GridLayout(15,2,10,10));
      p1.add(l1);
      p1.add(tf1);
      p1.add(l2);
      p1.add(tf2);
      p1.add(l3);
      p1.add(tf3);
      p1.add(l4);
      p1.add(tf4);
      p1.add(l5);
      p1.add(tf5);
      p1.add(l6);
      p1.add(tf6);
      p1.add(l7);
      p1.add(ch1);
      p1.add(l8);
      p1.add(ch2);
      p1.add(l9);
      p1.add(tf7);
      p1.add(l10);
      p1.add(tf8);
      p1.add(l11);
      p1.add(tf9);
      p1.add(bt3);
      p1.add(bt4);
      p1.add(l12);
      p1.add(ch3);
      p1.add(l13);
      p1.add(ch4);
      
      p1.add(bt1);
      p1.add(bt2);
      
      p1.setBackground(Color.BLACK);
      
      p2 = new JPanel();
      p2.setLayout(new GridLayout(1,1,10,10));
      p2.setBackground(Color.BLACK);
      p2.add(l14);
      
      p3 = new JPanel();
      p3.setLayout(new GridLayout(1,1,10,10));
      p3.setBackground(Color.BLACK);
      p3.add(l15);
      
      tf6.setForeground(Color.RED);
      
      setLayout(new BorderLayout(0,0));
      
      add(p2,"North");
      add(p3,"West");
      add(p1,"Center");
      
      requestFocus();
    }
    
      public void keyPressed(KeyEvent evt)
      {
        if (evt.getSource() == tf1)
        {
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
        {
         tf1.setEditable(true);
        }
        else 
        {
         tf1.setEditable(false);
        }
        }
        
        if (evt.getSource() == tf2)
        {
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
        {
         tf2.setEditable(true);
        }
        else 
        {
         tf2.setEditable(false);
        }
        }
      
      }
      
    public void actionPerformed(ActionEvent e)
    {
    try
    {
     if(e.getSource()==bt3)
     {
          connectionclass obj1 = new connectionclass();
          String q1 ="select * from add_trainer where categroy='Common'";
          ResultSet rs = obj1.stmt.executeQuery(q1);
          ch3.add("Common");
          while(rs.next())
          {
            ch4.add(rs.getString("name"));
          }
     }
     
     if(e.getSource()==bt4)
     {
          connectionclass obj2 = new connectionclass();
          String q2 ="select * from add_trainer where categroy='Personal'";
          ResultSet rs1 = obj2.stmt.executeQuery(q2);
          ch3.add("Personal");
          while(rs1.next())
          {
            ch4.add(rs1.getString("name"));
          }
     }
     
     if(e.getSource()==bt1)
     {
         
        String g = tf5.getText();
        String emaill = tf3.getText();
        if (!mobilevalid(g))
        {
         JOptionPane.showMessageDialog(Add_Customer.this,"Enter Proper Contact Number !!!");
         tf5.requestFocus();
        }
        else if(!emailvalid(emaill))
        {
         JOptionPane.showMessageDialog(Add_Customer.this,"Enter Proper Email !!!");
         tf3.requestFocus();
        }
        else
        {
         String name = tf1.getText();
         String fname = tf2.getText();
         String email = tf3.getText();
         String address = tf4.getText();
         String cont = tf5.getText();
         int rid = Integer.parseInt(tf6.getText());
         String plan = ch1.getSelectedItem();
         String gender = ch2.getSelectedItem();
         float height = Float.parseFloat(tf7.getText());
         float weight = Float.parseFloat(tf8.getText());
         String remarks = tf9.getText();
         String category = ch3.getSelectedItem();
         String tname = ch4.getSelectedItem();
       
         connectionclass obj = new connectionclass();
         String q = "insert into add_customer values("+rid+",'"+name+"','"+fname+"','"+email+"','"+address+"','"+cont+"','"+plan+"','"+gender+"',"+height+","+weight+",'"+remarks+"','"+tname+"','"+category+"')";
         obj.stmt.executeUpdate(q);
         JOptionPane.showMessageDialog(null,"Data Inserted Successfully !!");
         setVisible(false);
        }
             
     }
     if(e.getSource()==bt2)
     {
      JOptionPane.showMessageDialog(null, "Are you Sure ?");
      this.setVisible(false);
     }
    }
       catch(Exception ex)
       {
        ex.printStackTrace();
       }
    }  
    
    public static boolean mobilevalid(String s)
    {
     Pattern p = Pattern.compile("^\\d{10}$");
     Matcher m = p.matcher(s);
     return (m.matches());
    }
    
    public static boolean emailvalid(String s)
    {
     Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
     Matcher m = p.matcher(s);
     return (m.matches());
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
    
    public static void main(String args[])
    {
     Add_Customer ac = new Add_Customer();
     ac.setVisible(true);
    }
}
