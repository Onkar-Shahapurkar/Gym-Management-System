package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.regex.*;

public class Update_Trainer extends JFrame implements ActionListener, KeyListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10;
    Choice ch0,ch1,ch2,ch3;
    JButton bt1,bt2;
    JPanel p1,p2,p3;
    Font f,f1;
    
    public Update_Trainer()
    {
      super("Update Trainer");
      setSize(750,700);
      setLocation(10,10);
      setResizable(true);
      getContentPane().setBackground(Color.BLACK);
      
      ImageIcon img = new ImageIcon("D://Programming//Main Projects//Gym Management System//Gadget4.jpg");
      Image im = img.getImage().getScaledInstance(270, 600, Image.SCALE_DEFAULT);
      l15 = new JLabel(new ImageIcon(im));
      
      f = new Font("MS UI Gothic",Font.BOLD,18);
      f1 = new Font("Lucida Fax",Font.BOLD,25);
      
      l1 = new JLabel("Name");
      l2 = new JLabel("Surname");
      l3 = new JLabel("Email");
      l4 = new JLabel("Address");
      l5 = new JLabel("Contact no.");
      l6 = new JLabel("Emergency no.");
      l7 = new JLabel("Trainer Category");
      l8 = new JLabel("Trainer ID");
      l9 = new JLabel("Aggrement Term");
      l10 = new JLabel("Gender");
      l11 = new JLabel("Height (inch)");
      l12 = new JLabel("Weight (kg)");
      l13 = new JLabel("Remarks");
      l14 = new JLabel("Update Trainer Info");
      
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
      tf10 = new JTextField();
      
      tf1.addKeyListener(this);
      tf2.addKeyListener(this);
      
      ch0 =new Choice();
      try
      {
         connectionclass obj0 = new connectionclass();
         String q0 = "select tid from add_trainer;";
         ResultSet rest=obj0.stmt.executeQuery(q0);
         while(rest.next())
         {
           ch0.add(rest.getString("tid"));
         }
      }
      catch(Exception ex)
       {
        ex.printStackTrace();
       }
      
      ch1 = new Choice();
      ch2 = new Choice();
      ch3 = new Choice();
      
      ch1.add("Common");
      ch1.add("Personal");
      
      ch2.add("3 Months");
      ch2.add("6 Months");
      ch2.add("12 months");
      ch2.add("18 months");
      ch2.add("24 months");
      
      ch3.add("Male");
      ch3.add("Female");
      
      bt1 = new JButton("Update Data");
      bt2 = new JButton("Cancel");
      
      bt1.setForeground(Color.CYAN);
      bt2.setForeground(Color.RED);
      bt1.setBackground(Color.BLACK);
      bt2.setBackground(Color.BLACK);
      
      bt1.addActionListener(this);
      bt2.addActionListener(this);
      
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
      tf10.setFont(f);
      
      ch0.setFont(f);
      ch1.setFont(f);
      ch2.setFont(f);
      ch3.setFont(f);
      
      bt1.setFont(f);
      bt2.setFont(f);
      
      p1= new JPanel();
      p1.setLayout(new GridLayout(14,2,10,10));
      p1.add(l8);
      p1.add(ch0);
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
      p1.add(l9);
      p1.add(ch2);
      p1.add(l10);
      p1.add(ch3);
      p1.add(l11);
      p1.add(tf8);
      p1.add(l12);
      p1.add(tf9);
      p1.add(l13);
      p1.add(tf10);
      
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
      
      tf6.setForeground(Color.RED);
      
      setLayout(new BorderLayout(10,0));
      
      add(p2,"North");
      add(p3,"West");
      add(p1,"Center");
      
      ch0.addMouseListener(new MouseAdapter()
       {
          public void mouseClicked(MouseEvent arg0)
          {
             try
             {
               connectionclass obj2 = new connectionclass();
               int trainer_id = Integer.parseInt(ch0.getSelectedItem());
               String q2 = "select * from add_trainer where tid="+trainer_id+";";
               ResultSet rest2=obj2.stmt.executeQuery(q2);
               while(rest2.next())
               {
                tf1.setText(rest2.getString("name"));
                tf2.setText(rest2.getString("fname"));
                tf3.setText(rest2.getString("email"));
                tf4.setText(rest2.getString("address"));
                tf5.setText(rest2.getString("contactno"));
                tf6.setText(rest2.getString("emergencyno"));
                tf8.setText(rest2.getString("height"));
                tf9.setText(rest2.getString("weight"));
                tf10.setText(rest2.getString("remarks"));
                
               }
             }
             catch(Exception ex1)
             {
               ex1.printStackTrace();
             }
          }
       });
      
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
         
       String g = tf5.getText();
        String emerg = tf6.getText();
        String emaill = tf3.getText();
        if (!mobilevalid(g))
        {
         JOptionPane.showMessageDialog(Update_Trainer.this,"Enter Proper Contact Number !!!");
         tf5.requestFocus();
        }
        else if (!mobilevalid(emerg))
        {
         JOptionPane.showMessageDialog(Update_Trainer.this,"Enter Proper Emergency Number !!!");
         tf6.requestFocus();
        }
        else if(!emailvalid(emaill))
        {
         JOptionPane.showMessageDialog(Update_Trainer.this,"Enter Proper Email !!!");
         tf3.requestFocus();
        }
        else
        {
           String name = tf1.getText();
           String fname = tf2.getText();
           String email = tf3.getText();
           String address = tf4.getText();
           String cont = tf5.getText();
           String eno = tf6.getText();
           String tcat = ch1.getSelectedItem();
           int tid = Integer.parseInt(ch0.getSelectedItem());
           String minag = ch2.getSelectedItem();
           String gender = ch3.getSelectedItem();
           float height = Float.parseFloat(tf8.getText());
           float weight = Float.parseFloat(tf9.getText());
           String remarks = tf10.getText();

           try
           {
             if(e.getSource()==bt1)
             {
             connectionclass obj = new connectionclass();
             String q = "update add_trainer set name='"+name+"', fname='"+fname+"', email='"+email+"', address='"+address+"', contactno='"+cont+"', emergencyno='"+eno+"', categroy='"+tcat+"', term='"+minag+"', gender='"+gender+"', height="+height+", weight="+weight+" , remarks='"+remarks+"' where tid="+tid+";";
             obj.stmt.executeUpdate(q);
             JOptionPane.showMessageDialog(null,"Data Updated Successfully !!");
             setVisible(false);
             }
           }
           catch(Exception ex1)
             {
               ex1.printStackTrace();
             }
        }
       if(e.getSource()==bt2)
         {
           JOptionPane.showMessageDialog(null, "Are you Sure ?");
           this.setVisible(false);
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
     Update_Trainer ut = new Update_Trainer();
     ut.setVisible(true);
    }
}
