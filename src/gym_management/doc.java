package gym_management;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;

public class doc extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5;
    JLabel l1,l2,l3,l4,l5;
    Choice ch1;
    JPanel p1,p2;
    Font f2,f1;
    String filename,filename2,filename3;
    byte[] photo,photo2,photo3;
    
   doc()
   {
     super("Upload Document");
     setSize(550,350);
     setLocation(70,10);
     setResizable(true);
     
     f1 = new Font("Lucida Fax",Font.BOLD,25);
     f2 = new Font("MS UI Gothic",Font.BOLD,18);
     
     l1 = new JLabel("*Upload Adhaar card*");
     l2 = new JLabel("*Upload PAN card*");
     l3 = new JLabel("*Upload Ration card*");
     l4 = new JLabel("UPLOAD DOCUMENTS");
     l5 = new JLabel("Select Client ID.");
     
     ch1 = new Choice();
      try
      {
          connectionclass obj = new connectionclass();
          String q ="select receipt_no from add_customer";
          ResultSet rs = obj.stmt.executeQuery(q);
          while(rs.next())
          {
            ch1.add(rs.getString("receipt_no"));
          }
      }
      catch(Exception ex)
      {
        ex.printStackTrace();
      }
     
     l1.setForeground(Color.RED);
     l2.setForeground(Color.RED);
     l3.setForeground(Color.RED);
     l5.setForeground(Color.WHITE);
     
     l1.setFont(f2);
     l2.setFont(f2);
     l3.setFont(f2);
     l5.setFont(f2);
     ch1.setFont(f2);

     l4.setForeground(Color.YELLOW);  
     l4.setFont(f1);
     
     l1.setHorizontalAlignment(JLabel.CENTER);
     l2.setHorizontalAlignment(JLabel.CENTER);
     l3.setHorizontalAlignment(JLabel.CENTER);
     l4.setHorizontalAlignment(JLabel.CENTER);
     l5.setHorizontalAlignment(JLabel.CENTER);

     b1 = new JButton("Upload Adhaar card");
     b2 = new JButton("Upload PAN card");
     b3 = new JButton("Upload Ration card");
     b4 = new JButton("Upload Documents");
     b5 = new JButton("Cancel");
     
     b1.setForeground(Color.WHITE);
     b2.setForeground(Color.WHITE);
     b3.setForeground(Color.WHITE);
     b4.setForeground(Color.CYAN);
     b5.setForeground(Color.RED);
     b1.setBackground(Color.BLACK);
     b2.setBackground(Color.BLACK);
     b3.setBackground(Color.BLACK);
     b4.setBackground(Color.BLACK);
     b5.setBackground(Color.BLACK);
     
     b1.setFont(f2);
     b2.setFont(f2);
     b3.setFont(f2);
     b4.setFont(f2);
     b5.setFont(f2);
     
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     
     p1= new JPanel();
     p1.setLayout(new GridLayout(5,2,10,10));
     p1.setBackground(Color.BLACK);
     p1.add(l5);
     p1.add(ch1);
     p1.add(b1);
     p1.add(l1);
     p1.add(b2);
     p1.add(l2);
     p1.add(b3);
     p1.add(l3);
     p1.add(b5);
     p1.add(b4);
     
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
        int crno = Integer.parseInt(ch1.getSelectedItem());
        if(e.getSource()==b1)
        {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        l1.setText("");
        }
        if(e.getSource()==b2)
        {
        JFileChooser chooser2 = new JFileChooser();
        chooser2.showOpenDialog(null);
        File f2 = chooser2.getSelectedFile();
        filename2 = f2.getAbsolutePath();
        l2.setText("");
        }
        if(e.getSource()==b3)
        {
        JFileChooser chooser3 = new JFileChooser();
        chooser3.showOpenDialog(null);
        File f3 = chooser3.getSelectedFile();
        filename3 = f3.getAbsolutePath();
        l3.setText("");
        }
        if(e.getSource()==b4)
        {
        try
        {
          File image = new File (filename);
          File image2 = new File (filename2);
          File image3 = new File (filename3);
          
          FileInputStream fis = new FileInputStream(image);
          FileInputStream fis2 = new FileInputStream(image2);
          FileInputStream fis3 = new FileInputStream(image3);
          
          ByteArrayOutputStream bos = new ByteArrayOutputStream();
          ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
          ByteArrayOutputStream bos3 = new ByteArrayOutputStream();
          
          byte[] buf = new byte[1024];
          byte[] buf2 = new byte[1024];
          byte[] buf3 = new byte[1024];
          
          for(int readNum; (readNum = fis.read(buf))!=-1;)
          {
            bos.write(buf,0, readNum);
          }
          for(int readNum; (readNum = fis2.read(buf2))!=-1;)
          {
            bos2.write(buf2,0, readNum);
          }
          for(int readNum; (readNum = fis3.read(buf3))!=-1;)
          {
            bos3.write(buf3,0, readNum);
          }
          
            photo = bos.toByteArray();
            photo2 = bos2.toByteArray();
            photo3 = bos2.toByteArray();
            
            connectionclass obj = new connectionclass();
            PreparedStatement ps = obj.con.prepareStatement("insert into doc values(?,?,?,?);");
            ps.setInt(1,crno);
            ps.setBytes(2, photo);
            ps.setBytes(3, photo2);
            ps.setBytes(4, photo3);
            int status = ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Inserted Successfully !!");
            setVisible(false);
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null, e1);
        }
        }
        if(e.getSource()==b5)
        {
         JOptionPane.showMessageDialog(null, "Are you Sure ?");
         this.setVisible(false);
        }
    }
    public static void main(String args[])
    {
      doc d = new doc();
      d.setVisible(true);
    }
}
