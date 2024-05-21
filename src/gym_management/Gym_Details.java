package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gym_Details extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6;
    JButton bt1,bt2;
    JPanel p1,p2,p3;
    Font f,f1;
    
     public Gym_Details()
    {
      super("Gym Details");
      setSize(1300,800);
      setLocation(300,100);
      setResizable(true);
      ImageIcon img = new ImageIcon("D://Programming//Main Projects//Gym Management System//body.png");
      Image im = img.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
      l6 = new JLabel(new ImageIcon(im));
      
      f = new Font("MS UI Gothic",Font.BOLD,18);
      f1 = new Font("Lucida Fax",Font.BOLD,35);
      
      l1 = new JLabel("TRIPLING FINTNESS POINT");
      l2 = new JLabel("Owner Name :");
      l3 = new JLabel("Tripling Incorporation");
      l4 = new JLabel("Address :");
      l5 = new JLabel("Akkalkot Road, Shanti Chowk, Solapur");
      
      l1.setFont(f1);
      l1.setHorizontalAlignment(JLabel.CENTER);
      l1.setForeground(Color.YELLOW);
      
      bt1 = new JButton("Check Trainer Hires");
      bt2 = new JButton("Cancel");
      
      bt1.setForeground(Color.CYAN);
      bt2.setForeground(Color.RED);
      bt1.setBackground(Color.BLACK);
      bt2.setBackground(Color.BLACK);
      
      l2.setForeground(Color.GRAY);
      l3.setForeground(Color.GRAY);
      l4.setForeground(Color.GRAY);
      l5.setForeground(Color.GRAY);
      
      bt1.addActionListener(this);
      bt2.addActionListener(this);
      
      bt1.setFont(f);
      bt2.setFont(f);
      
      l2.setFont(f);
      l3.setFont(f);
      l4.setFont(f);
      l5.setFont(f);
      
      p2 = new JPanel();
      p2.setLayout(new GridLayout(1,1,10,10));
      p2.setBackground(Color.BLACK);
      p2.add(l1);
      
      p3 = new JPanel();
      p3.setLayout(new GridLayout(1,1,10,10));
      p3.setBackground(Color.BLACK);
      p3.add(l6);
      
      p1= new JPanel();
      p1.setLayout(new GridLayout(3,2,10,10));
      p1.setBackground(Color.BLACK);
      p1.add(l2);
      p1.add(l3);
      p1.add(l4);
      p1.add(l5);
      p1.add(bt1);
      p1.add(bt2);
      
      setLayout(new BorderLayout(0,0));
      
      add(p2,"North");
      add(p3,"Center");
      add(p1,"South");
    
    } 
     
      public void actionPerformed(ActionEvent e)
      { 
       if(e.getSource()==bt1)
       {
        Customer_Count cc = new Customer_Count();
        cc.setVisible(true);
       }
       if(e.getSource()==bt2)
       {
        JOptionPane.showMessageDialog(null, "Are you Sure ?");
        this.setVisible(false);
       }
      } 
      
}