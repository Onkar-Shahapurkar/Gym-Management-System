package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gym_Gadgets extends JFrame implements ActionListener
{
     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37;
     JButton bt1,bt2;
     JPanel p1,p2,p3,p4;
     Font f,f1;
     
    public Gym_Gadgets()
    {
      super("Gym Gadgets");
      setSize(1400,1000);
      setLocation(250,10);
      setResizable(true);
      
      ImageIcon img = new ImageIcon("D://Programming//Main Projects//Gym Management System//Gadget1.jpg");
      Image im = img.getImage().getScaledInstance(250, 1000, Image.SCALE_DEFAULT);
      l34 = new JLabel(new ImageIcon(im));
      
      ImageIcon img2 = new ImageIcon("D://Programming//Main Projects//Gym Management System//Gadget2.jpg");
      Image im2 = img2.getImage().getScaledInstance(250, 1000, Image.SCALE_DEFAULT);
      l35 = new JLabel(new ImageIcon(im2));
      
      ImageIcon img3 = new ImageIcon("D://Programming//Main Projects//Gym Management System//Gadget3.jpg");
      Image im3 = img3.getImage().getScaledInstance(250, 1000, Image.SCALE_DEFAULT);
      l36 = new JLabel(new ImageIcon(im3));
      
      ImageIcon img4 = new ImageIcon("D://Programming//Main Projects//Gym Management System//Gadget5.jpg");
      Image im4 = img4.getImage().getScaledInstance(250, 1000, Image.SCALE_DEFAULT);
      l37 = new JLabel(new ImageIcon(im4));
      
      f = new Font("MS UI Gothic",Font.BOLD,18);
      f1 = new Font("Lucida Fax",Font.BOLD,25);
      
      l33 = new JLabel("Gym Gadgets Details");
      l33.setFont(f1);
      l33.setHorizontalAlignment(JLabel.CENTER);
      l33.setForeground(Color.YELLOW);
      
      bt1 = new JButton("See Gym Details");
      bt2 = new JButton("Cancel");
      
      bt1.setForeground(Color.CYAN);
      bt2.setForeground(Color.RED);
      bt1.setBackground(Color.BLACK);
      bt2.setBackground(Color.BLACK);
      
      bt1.addActionListener(this);
      bt2.addActionListener(this);
      
      bt1.setFont(f);
      bt2.setFont(f);
      
      p2 = new JPanel();
      p2.setLayout(new GridLayout(1,1,10,10));
      p2.setBackground(Color.BLACK);
      p2.add(l33);
      
      l1 = new JLabel("DumBells :");
      l2 = new JLabel("1 kg to 35kg (2x3)");
      l3 = new JLabel("Rope :");
      l4 = new JLabel("3 Ropes (2 Large, 1 Medium)");
      l5 = new JLabel("Balls :");
      l6 = new JLabel("6 Balls");
      l7 = new JLabel("Chest Press :");
      l8 = new JLabel("3 Machines");
      l9 = new JLabel("Incline Chest Press :");
      l10 = new JLabel("2 Machines");
      l11 = new JLabel("Decline Chest Press :");
      l12 = new JLabel("2 Machines");
      l13 = new JLabel(" Big Barbel Rod :");
      l14 = new JLabel("3 Rods");
      l15 = new JLabel("Zig-Zag Rod :");
      l16 = new JLabel("7 Rods");
      l17 = new JLabel("Small Barbel Rod :");
      l18 = new JLabel("8 Rods");
      l19 = new JLabel("Soldeir Press Machines :");
      l20 = new JLabel("3 Machines");
      l21 = new JLabel("Leg Press Machine :");
      l22 = new JLabel("3 Machines");
      l23 = new JLabel("Bentch :");
      l24 = new JLabel("10 Bentches");
      l25 = new JLabel("T.V :");
      l26 = new JLabel("2 Operetable");
      l27 = new JLabel("Speaker :");
      l28 = new JLabel("12 Speakers");
      l29 = new JLabel("Weight :");
      l30 = new JLabel("1000kg Total Plates");
      l31 = new JLabel("Other Small Gadgets :");
      l32 = new JLabel("Available");
      
      l1.setForeground(Color.GRAY);
      l2.setForeground(Color.WHITE);
      l3.setForeground(Color.GRAY);
      l4.setForeground(Color.WHITE);
      l5.setForeground(Color.GRAY);
      l6.setForeground(Color.WHITE);
      l7.setForeground(Color.GRAY);
      l8.setForeground(Color.WHITE);
      l9.setForeground(Color.GRAY);
      l10.setForeground(Color.WHITE);
      l11.setForeground(Color.GRAY);
      l12.setForeground(Color.WHITE);
      l13.setForeground(Color.GRAY);
      l14.setForeground(Color.WHITE);
      l15.setForeground(Color.GRAY);
      l16.setForeground(Color.WHITE);
      l17.setForeground(Color.GRAY);
      l18.setForeground(Color.WHITE);
      l19.setForeground(Color.GRAY);
      l20.setForeground(Color.WHITE);
      l21.setForeground(Color.GRAY);
      l22.setForeground(Color.WHITE);
      l23.setForeground(Color.GRAY);
      l24.setForeground(Color.WHITE);
      l25.setForeground(Color.GRAY);
      l26.setForeground(Color.WHITE);
      l27.setForeground(Color.GRAY);
      l28.setForeground(Color.WHITE);
      l29.setForeground(Color.GRAY);
      l30.setForeground(Color.WHITE);
      l31.setForeground(Color.GRAY);
      l32.setForeground(Color.WHITE);
      
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
      l14.setFont(f);
      l15.setFont(f);
      l16.setFont(f);
      l17.setFont(f);
      l18.setFont(f);
      l19.setFont(f);
      l20.setFont(f);
      l21.setFont(f);
      l22.setFont(f);
      l23.setFont(f);
      l24.setFont(f);
      l25.setFont(f);
      l26.setFont(f);
      l27.setFont(f);
      l28.setFont(f);
      l29.setFont(f);
      l30.setFont(f);
      l31.setFont(f);
      l32.setFont(f);
      
      p1= new JPanel();
      p1.setLayout(new GridLayout(17,2,10,10));
      p1.setBackground(Color.BLACK);
      p1.add(l1);
      p1.add(l2);
      p1.add(l3);
      p1.add(l4);
      p1.add(l5);
      p1.add(l6);
      p1.add(l7);
      p1.add(l8);
      p1.add(l9);
      p1.add(l10);
      p1.add(l11);
      p1.add(l12);
      p1.add(l13);
      p1.add(l14);
      p1.add(l15);
      p1.add(l16);
      p1.add(l17);
      p1.add(l18);
      p1.add(l19);
      p1.add(l20);
      p1.add(l21);
      p1.add(l22);
      p1.add(l23);
      p1.add(l24);
      p1.add(l25);
      p1.add(l26);
      p1.add(l27);
      p1.add(l28);
      p1.add(l29);
      p1.add(l30);
      p1.add(l31);
      p1.add(l32);
      p1.add(bt1);
      p1.add(bt2);
      
      p3 = new JPanel();
      p3.setLayout(new GridLayout(2,1,10,10));
      p3.setBackground(Color.BLACK);
      p3.add(l34);
      p3.add(l36);
      
      p4 = new JPanel();
      p4.setLayout(new GridLayout(2,1,10,10));
      p4.setBackground(Color.BLACK);
      p4.add(l35);
      p4.add(l37);
      
      setLayout(new BorderLayout(0,0));
      
      add(p2,"North");
      add(p1,"Center");
      add(p3,"West");
      add(p4,"East");
      
    }
      
    public void actionPerformed(ActionEvent e)
    {
     if(e.getSource()==bt1)
     {
      Gym_Details gd = new Gym_Details();
      gd.setVisible(true);
     }
     if(e.getSource()==bt2)
     {
      JOptionPane.showMessageDialog(null, "Are you Sure ?");
      this.setVisible(false);
     }
    }    public static void main(String args[])
    {
     Gym_Gadgets gg = new Gym_Gadgets();
     gg.setVisible(true);
    }
}