package gym_management;

import java.awt.*;
import javax.swing.*;

public class Cardio extends JFrame
{
    Font f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JPanel p1,p2;
    Cardio()
    {
      super("Cardio Exercise Images");
      setSize(1900,1020);
      setLocation(0,0);
      
      f= new Font("Lucida Fax",Font.BOLD,35);
      
      ImageIcon img1 = new ImageIcon("D://Programming//Main Projects//Gym Management System//Cardio//Cardio1.jpg");
      l1 = new JLabel(img1);
      
      ImageIcon img2 = new ImageIcon("D://Programming//Main Projects//Gym Management System//Cardio//Cardio2.jpg");
      l2 = new JLabel(img2);
      
      ImageIcon img3 = new ImageIcon("D://Programming//Main Projects//Gym Management System//Cardio//Cardio3.gif");
      Image im = img3.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      l3 = new JLabel(new ImageIcon(im));
      
      ImageIcon img4 = new ImageIcon("D://Programming//Main Projects//Gym Management System//Cardio//Cardio4.jpg");
      l4 = new JLabel(img4);
      
      ImageIcon img5 = new ImageIcon("D://Programming//Main Projects//Gym Management System//Cardio//Cardio5.gif");
      Image im1 = img5.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      l5 = new JLabel(new ImageIcon(im1));
      
      ImageIcon img6 = new ImageIcon("D://Programming//Main Projects//Gym Management System//Cardio//Cardio6.jpg");
      l6 = new JLabel(img6);
      
      ImageIcon img7 = new ImageIcon("D://Programming//Main Projects//Gym Management System//Cardio//Cardio10.jpg");
      l7 = new JLabel(img7);
      
      ImageIcon img8 = new ImageIcon("D://Programming//Main Projects//Gym Management System//Cardio//Cardio8.gif");
      Image im2 = img8.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      l8 = new JLabel(new ImageIcon(im2));
      
      l9 = new JLabel("CARDIO EXERCISE IMAGES");
      l9.setFont(f);
      l9.setHorizontalAlignment(JLabel.CENTER);
      l9.setForeground(Color.YELLOW);
      
      p2 = new JPanel();
      p2.setLayout(new GridLayout(1,1,10,10));
      p2.setBackground(Color.BLACK);
      p2.add(l9);
      
      p1 = new JPanel();
      p1.setLayout(new GridLayout(2,4,10,10));
      p1.setBackground(Color.BLACK);
      p1.add(l1);
      p1.add(l2);
      p1.add(l3);
      p1.add(l4);
      p1.add(l5);
      p1.add(l6);
      p1.add(l7);
      p1.add(l8);
      
      setLayout(new BorderLayout(0,0));
      
      add(p2,"North");
      add(p1,"Center");
    
    }
    
    public static void main(String args[])
    {
      Cardio bt = new Cardio();
      bt.setVisible(true);
    }
}
