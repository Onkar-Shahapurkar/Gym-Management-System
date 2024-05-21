package gym_management;

import java.awt.*;
import javax.swing.*;

public class ABS extends JFrame
{
    Font f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JPanel p1,p2;
    ABS()
    {
      super("ABS Exercise Images");
      setSize(1900,1020);
      setLocation(0,0);
      
      f= new Font("Lucida Fax",Font.BOLD,35);
      
      ImageIcon img1 = new ImageIcon("D://Programming//Main Projects//Gym Management System//ABS//Abs1.jpg");
      Image im1 = img1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      l1 = new JLabel(new ImageIcon(im1));
      
      ImageIcon img2 = new ImageIcon("D://Programming//Main Projects//Gym Management System//ABS//Abs2.jpg");
      Image im2 = img2.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      l2 = new JLabel(new ImageIcon(im2));
      
      ImageIcon img3 = new ImageIcon("D://Programming//Main Projects//Gym Management System//ABS//Abs3.gif");
      Image im3 = img3.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      l3 = new JLabel(new ImageIcon(im3));
      
      ImageIcon img4 = new ImageIcon("D://Programming//Main Projects//Gym Management System//ABS//Abs4.jpg");
      Image im4 = img4.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      l4 = new JLabel(new ImageIcon(im4));
      
      ImageIcon img5 = new ImageIcon("D://Programming//Main Projects//Gym Management System//ABS//Abs5.jpeg");
      Image im5 = img5.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      l5 = new JLabel(new ImageIcon(im5));
      
      ImageIcon img6 = new ImageIcon("D://Programming//Main Projects//Gym Management System//ABS//Abs6.jpg");
      Image im6 = img6.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      l6 = new JLabel(new ImageIcon(im6));
      
      ImageIcon img7 = new ImageIcon("D://Programming//Main Projects//Gym Management System//ABS//Abs7.png");
      Image im7 = img7.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      l7 = new JLabel(new ImageIcon(im7));
      
      ImageIcon img8 = new ImageIcon("D://Programming//Main Projects//Gym Management System//ABS//Abs8.jpg");
      Image im8 = img8.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
      l8 = new JLabel(new ImageIcon(im8));
      
      l9 = new JLabel("ABS EXERCISE IMAGES");
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
      ABS abs = new ABS();
      abs.setVisible(true);
    }
    
}
