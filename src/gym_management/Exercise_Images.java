package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise_Images extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11;
    JPanel p1,p2,p3;
    Font f,f1;
    
    public Exercise_Images()
    {
      super("Exercise Images");
      setSize(1300,800);
      setLocation(300,100);
      setResizable(true);
      
      f = new Font("MS UI Gothic",Font.BOLD,18);
      f1 = new Font("Lucida Fax",Font.BOLD,25);
      
      l9 = new JLabel("WORK HARD FOR YOUR DREAM");
      l9.setFont(f1);
      l9.setHorizontalAlignment(JLabel.CENTER);
      l9.setForeground(Color.YELLOW);
      
      bt1 = new JButton("BASICS");
      bt2 = new JButton("CARDIO");
      bt3 = new JButton("ABS");
      bt4 = new JButton("CHEST");
      bt5 = new JButton("SHOULDER");
      bt6 = new JButton("LEGS");
      bt7 = new JButton("BICEPS & TRICEPS");
      bt8 = new JButton("BACK");
      bt9 = new JButton("WARMUP");
      bt10 = new JButton("INSPIRATIONAL IMAGES");
      bt11 = new JButton("Cancel");
      
      bt1.setForeground(Color.CYAN);
      bt2.setForeground(Color.CYAN);
      bt3.setForeground(Color.CYAN);
      bt4.setForeground(Color.CYAN);
      bt5.setForeground(Color.CYAN);
      bt6.setForeground(Color.CYAN);
      bt7.setForeground(Color.CYAN);
      bt8.setForeground(Color.CYAN);
      bt9.setForeground(Color.CYAN);
      bt10.setForeground(Color.CYAN);
      bt11.setForeground(Color.RED);
      
      bt1.setBackground(Color.BLACK);
      bt2.setBackground(Color.BLACK);
      bt3.setBackground(Color.BLACK);
      bt4.setBackground(Color.BLACK);
      bt5.setBackground(Color.BLACK);
      bt6.setBackground(Color.BLACK);
      bt7.setBackground(Color.BLACK);
      bt8.setBackground(Color.BLACK);
      bt9.setBackground(Color.BLACK);
      bt10.setBackground(Color.BLACK);
      bt11.setBackground(Color.BLACK);
      
      bt1.addActionListener(this);
      bt2.addActionListener(this);
      bt3.addActionListener(this);
      bt4.addActionListener(this);
      bt5.addActionListener(this);
      bt6.addActionListener(this);
      bt7.addActionListener(this);
      bt8.addActionListener(this);
      bt9.addActionListener(this);
      bt10.addActionListener(this);
      bt11.addActionListener(this);
      
      bt1.setFont(f);
      bt2.setFont(f);
      bt3.setFont(f);
      bt4.setFont(f);
      bt5.setFont(f);
      bt6.setFont(f);
      bt7.setFont(f);
      bt8.setFont(f);
      bt9.setFont(f);
      bt10.setFont(f);
      bt11.setFont(f);
      
      p2 = new JPanel();
      p2.setLayout(new GridLayout(1,1,10,10));
      p2.setBackground(Color.BLACK);
      p2.add(l9);
      
      l1 = new JLabel("There is Nothing Impossible to them who Tries");
      l2 = new JLabel("Once You start Exercising, The Hardest Thing is to Stop it");
      l3 = new JLabel("The Best to Predict Future is to Create it");
      l4 = new JLabel("All Progress Takes Place Outside the Comfort Zone");
      l5 = new JLabel("What seems Impossible Today, One day it will Become your warm-Up");
      l6 = new JLabel("You just can't Beat the Person who Never Gives Up");
      l7 = new JLabel("Do Something Today that your Futureself will Thank for");
      l8 = new JLabel("When you Hit Failure, your Success has just Begun");
      
      l1.setHorizontalAlignment(JLabel.CENTER);
      l2.setHorizontalAlignment(JLabel.CENTER);
      l3.setHorizontalAlignment(JLabel.CENTER);
      l4.setHorizontalAlignment(JLabel.CENTER);
      l5.setHorizontalAlignment(JLabel.CENTER);
      l6.setHorizontalAlignment(JLabel.CENTER);
      l7.setHorizontalAlignment(JLabel.CENTER);
      l8.setHorizontalAlignment(JLabel.CENTER);
      
      l1.setForeground(Color.RED);
      l2.setForeground(Color.RED);
      l3.setForeground(Color.RED);
      l4.setForeground(Color.RED);
      l5.setForeground(Color.RED);
      l6.setForeground(Color.RED);
      l7.setForeground(Color.RED);
      l8.setForeground(Color.RED);
      
      l1.setFont(f);
      l2.setFont(f);
      l3.setFont(f);
      l4.setFont(f);
      l5.setFont(f);
      l6.setFont(f);
      l7.setFont(f);
      l8.setFont(f);
      
      p1= new JPanel();
      p1.setLayout(new GridLayout(9,2,10,10));
      p1.setBackground(Color.BLACK);
      p1.add(l1);
      p1.add(l2);
      p1.add(l3);
      p1.add(l4);
      p1.add(l5);
      p1.add(l6);
      p1.add(l7);
      p1.add(l8);
      p1.add(bt1);
      p1.add(bt2);
      p1.add(bt3);
      p1.add(bt4);
      p1.add(bt5);
      p1.add(bt6);
      p1.add(bt7);
      p1.add(bt8);
      p1.add(bt9);
      p1.add(bt10);
      
      p3 = new JPanel();
      p3.setLayout(new GridLayout(1,1,10,10));
      p3.setBackground(Color.BLACK);
      p3.add(bt11);
      
      setLayout(new BorderLayout(0,0));
      
      add(p2,"North");
      add(p1,"Center");
      add(p3,"South");
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
     if(e.getSource()==bt1)
     {
       Basics b = new Basics();
       b.setVisible(true);
     }

     if(e.getSource()==bt2)
     {
       Cardio c = new Cardio();
       c.setVisible(true);
     }

     if(e.getSource()==bt3)
     {
       ABS abs = new ABS();
       abs.setVisible(true);
     }

     if(e.getSource()==bt4)
     {
      Chest c = new Chest();
      c.setVisible(true);
     }
     
     if(e.getSource()==bt5)
     {
      Shoulder s = new Shoulder();
      s.setVisible(true);
     }
     
     if(e.getSource()==bt6)
     {
      Legs l = new Legs();
      l.setVisible(true);
     }
     
     if(e.getSource()==bt7)
     {
      B_T bt = new B_T();
      bt.setVisible(true);
     }
     
     if(e.getSource()==bt8)
     {
      Back b = new Back();
      b.setVisible(true);
     }
     
     if(e.getSource()==bt9)
     {
      Warmup w = new Warmup();
      w.setVisible(true);
     }
     
     if(e.getSource()==bt10)
     {
       Inspiration i = new Inspiration();
       i.setVisible(true);
     }

     if(e.getSource()==bt11)
     {
      JOptionPane.showMessageDialog(null, "Are you Sure ?");
      this.setVisible(false);
     }
    }
      
    public static void main(String args[])
    {
      Exercise_Images cc = new Exercise_Images();
      cc.setVisible(true);
    }
    
}
