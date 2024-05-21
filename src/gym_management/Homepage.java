package gym_management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Homepage extends JFrame implements ActionListener
{
    JLabel l1;
    Font f,f1,f2;
    JPanel p1;
    Homepage()
    {
      super("HomePage");
      setSize(1900,1020);
      setLocation(0,0);
      
      f= new Font("Lucida Fax",Font.BOLD,20);
      f1= new Font("MS UI Gothic",Font.BOLD,18);
      f2= new Font("Gadugi",Font.BOLD,35);
      
      ImageIcon ic = new ImageIcon("D://Programming//Main Projects//Gym Management System//home2.jpg");
      Image img = ic.getImage().getScaledInstance(1900, 1020, Image.SCALE_DEFAULT);
      ImageIcon ic1 = new ImageIcon(img);
      l1 = new JLabel(ic1);
      
      JMenuBar m1 = new JMenuBar();
      JMenu men1 = new JMenu("Master");
      JMenuItem ment1 = new JMenuItem("Add Trainer");
      JMenuItem ment2 = new JMenuItem("Add Customer");
      JMenuItem ment16 = new JMenuItem("Upload Documents");
      ment1.setMnemonic('T');
      ment2.setMnemonic('C');
      ment16.setMnemonic('H');
      ment1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
      ment2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
      ment16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));
      
      JMenu men2 = new JMenu("Attendence");
      JMenuItem ment3 = new JMenuItem("Trainer Attendence");
      JMenuItem ment4 = new JMenuItem("Customer Attendence");
      ment3.setMnemonic('A');
      ment4.setMnemonic('U');
      ment3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
      ment4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
      
      JMenu men3 = new JMenu("Personel Information");
      JMenuItem ment5 = new JMenuItem("Trainer Information");
      JMenuItem ment6 = new JMenuItem("Customer Information");
      ment5.setMnemonic('P');
      ment6.setMnemonic('S');
      ment5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
      ment6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
      
      JMenu men4 = new JMenu("Update Information");
      JMenuItem ment7 = new JMenuItem("Update Trainer");
      JMenuItem ment8 = new JMenuItem("Update Customer");
      ment7.setMnemonic('D');
      ment8.setMnemonic('M');
      ment7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
      ment8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
      
      JMenu men5 = new JMenu("Fees Information");
      JMenuItem ment9 = new JMenuItem("Trainer Fees");
      JMenuItem ment10 = new JMenuItem("Customer Fees");
      JMenuItem ment17 = new JMenuItem("Check Pending Fees");
      ment9.setMnemonic('F');
      ment10.setMnemonic('Q');
      ment9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
      ment10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.CTRL_MASK));
      
      JMenu men6 = new JMenu("Other Details");
      JMenuItem ment11 = new JMenuItem("Gym Details");
      JMenuItem ment12 = new JMenuItem("Gym Gadgets");
      ment11.setMnemonic('G');
      ment12.setMnemonic('Y');
      ment11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
      ment12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,ActionEvent.CTRL_MASK));
      
      JMenu men7 = new JMenu("Exercise Routines");
      JMenuItem ment13 = new JMenuItem("Exercise Images");
      JMenuItem ment14 = new JMenuItem("BMR Calculator");
      ment13.setMnemonic('E');
      ment14.setMnemonic('B');
      ment13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
      ment14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
      
      JMenu men8 = new JMenu("Exit");
      JMenuItem ment15 = new JMenuItem("Exit");
      ment15.setMnemonic('X');
      ment15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
      
      men1.add(ment1);
      men1.add(ment2);
      men1.add(ment16);
      
      men2.add(ment3);
      men2.add(ment4);
      
      men3.add(ment5);
      men3.add(ment6);
      
      men4.add(ment7);
      men4.add(ment8);
      
      men5.add(ment9);
      men5.add(ment10);
      men5.add(ment17);
      
      men6.add(ment11);
      men6.add(ment12);
      
      men7.add(ment13);
      men7.add(ment14);
      
      men8.add(ment15);
      
      m1.add(men1);
      m1.add(men2);
      m1.add(men3);
      m1.add(men4);
      m1.add(men5);
      m1.add(men6);
      m1.add(men7);
      m1.add(men8);
      
      men1.setFont(f);
      men2.setFont(f);
      men3.setFont(f);
      men4.setFont(f);
      men5.setFont(f);
      men6.setFont(f);
      men7.setFont(f);
      men8.setFont(f);
      
      ment1.setFont(f1);
      ment2.setFont(f1);
      ment3.setFont(f1);
      ment4.setFont(f1);
      ment5.setFont(f1);
      ment6.setFont(f1);
      ment7.setFont(f1);
      ment8.setFont(f1);
      ment9.setFont(f1);
      ment10.setFont(f1);
      ment11.setFont(f1);
      ment12.setFont(f1);
      ment13.setFont(f1);
      ment14.setFont(f1);
      ment15.setFont(f1);
      ment16.setFont(f1);
      ment17.setFont(f1);
      
      m1.setBackground(Color.BLACK);
      
      men1.setForeground(Color.GRAY);
      men2.setForeground(Color.GRAY);
      men3.setForeground(Color.GRAY);
      men4.setForeground(Color.GRAY);
      men5.setForeground(Color.GRAY);
      men6.setForeground(Color.GRAY);
      men7.setForeground(Color.GRAY);
      men8.setForeground(Color.RED);
      
      ment1.setBackground(Color.BLACK);
      ment2.setBackground(Color.BLACK);
      ment3.setBackground(Color.BLACK);
      ment4.setBackground(Color.BLACK);
      ment5.setBackground(Color.BLACK);
      ment6.setBackground(Color.BLACK);
      ment7.setBackground(Color.BLACK);
      ment8.setBackground(Color.BLACK);
      ment9.setBackground(Color.BLACK);
      ment10.setBackground(Color.BLACK);
      ment11.setBackground(Color.BLACK);
      ment12.setBackground(Color.BLACK);
      ment13.setBackground(Color.BLACK);
      ment14.setBackground(Color.BLACK);
      ment15.setBackground(Color.BLACK);
      ment16.setBackground(Color.BLACK);
      ment17.setBackground(Color.BLACK);
      
      ment1.setForeground(Color.YELLOW);
      ment2.setForeground(Color.YELLOW);
      ment3.setForeground(Color.YELLOW);
      ment4.setForeground(Color.YELLOW);
      ment5.setForeground(Color.YELLOW);
      ment6.setForeground(Color.YELLOW);
      ment7.setForeground(Color.YELLOW);
      ment8.setForeground(Color.YELLOW);
      ment9.setForeground(Color.YELLOW);
      ment10.setForeground(Color.YELLOW);
      ment11.setForeground(Color.YELLOW);
      ment12.setForeground(Color.YELLOW);
      ment13.setForeground(Color.YELLOW);
      ment14.setForeground(Color.YELLOW);
      ment15.setForeground(Color.YELLOW);
      ment16.setForeground(Color.YELLOW);
      ment17.setForeground(Color.YELLOW);
      
      ment1.addActionListener(this);
      ment2.addActionListener(this);
      ment3.addActionListener(this);
      ment4.addActionListener(this);
      ment5.addActionListener(this);
      ment6.addActionListener(this);
      ment7.addActionListener(this);
      ment8.addActionListener(this);
      ment9.addActionListener(this);
      ment10.addActionListener(this);
      ment11.addActionListener(this);
      ment12.addActionListener(this);
      ment13.addActionListener(this);
      ment14.addActionListener(this);
      ment15.addActionListener(this);
      ment16.addActionListener(this);
      ment17.addActionListener(this);
      
      setJMenuBar(m1);
      add(l1);
    }
    
    public void actionPerformed(ActionEvent e)
    {
      String commd = e.getActionCommand();
      if(commd.equals("Add Trainer"))
      {
        Add_Trainer at = new Add_Trainer();
        at.setVisible(true);
      }
      else if(commd.equals("Add Customer"))
      {
        Add_Customer ac = new Add_Customer();
        ac.setVisible(true);
      }
      else if(commd.equals("Upload Documents"))
      {
        doc d = new doc();
        d.setVisible(true);
      }
      else if(commd.equals("Trainer Attendence"))
      {
        Trainer_Attendence ta = new Trainer_Attendence();
        ta.setVisible(true);
      }
      else if(commd.equals("Customer Attendence"))
      {
        Customer_Attendence ca = new Customer_Attendence();
        ca.setVisible(true);
      }
      else if(commd.equals("Trainer Information"))
      {
        Trainer_Information t = new Trainer_Information();
        t.setVisible(true);
      }
      else if(commd.equals("Customer Information"))
      {
        Customer_Information c = new Customer_Information();
        c.setVisible(true);
      }
      else if(commd.equals("Update Trainer"))
      {
        Update_Trainer ut = new Update_Trainer();
        ut.setVisible(true);
      }
      else if(commd.equals("Update Customer"))
      {
        Update_Customer uc = new Update_Customer();
        uc.setVisible(true);
      }
      else if(commd.equals("Trainer Fees"))
      {
        Trainer_Fees tf = new Trainer_Fees();
        tf.setVisible(true);
      }
      else if(commd.equals("Customer Fees"))
      {
        Customer_Fees cf = new Customer_Fees();
        cf.setVisible(true);
      }
      else if(commd.equals("Check Pending Fees"))
      {
        FeeReminder fr = new FeeReminder();
        fr.setVisible(true);
      }
      else if(commd.equals("Gym Details"))
      {
        Gym_Details gd = new Gym_Details();
        gd.setVisible(true);
      }
      else if(commd.equals("Gym Gadgets"))
      {
        Gym_Gadgets g = new Gym_Gadgets();
        g.setVisible(true);
      }
      else if(commd.equals("Exercise Images"))
      {
        Exercise_Images ei = new Exercise_Images();
        ei.setVisible(true);
      }
      else if(commd.equals("BMR Calculator"))
      {
       BMR_Calculator bc = new BMR_Calculator();
       bc.setVisible(true);
      }
      else if(commd.equals("Exit"))
      {
       JOptionPane.showMessageDialog(null, "Are you Sure ?");
       this.setVisible(false);
      }
    }
    public static void main(String args[])
    {
     Homepage p = new Homepage();
     p.setVisible(true);
    }
}
