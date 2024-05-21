package gym_management;

import javax.swing.*;
import java.awt.*;
 
public class SplashScreenDemo {
    JFrame frame;
    
    ImageIcon img = new ImageIcon("D://Programming//Main Projects//Gym Management System//loading1.gif");
    Image im = img.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    JLabel image = new JLabel(new ImageIcon(im));
    
    JLabel text=new JLabel("TRIPLING FITNESS POINT");
    JProgressBar progressBar=new JProgressBar();
    JLabel message=new JLabel();
    SplashScreenDemo()
    {
        createGUI();
        addImage();
        addText();
        addProgressBar();
        addMessage();
        runningPBar();
    }
    public void createGUI(){
        frame=new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.magenta);
        frame.setVisible(true);
 
    }
    public void addImage(){
        image.setSize(600,200);
        frame.add(image);
    }
    public void addText()
    {
        text.setFont(new Font("arial",Font.BOLD,30));
        text.setBounds(120,200,600,40);
        text.setForeground(Color.BLUE);
        frame.add(text);
    }
    public void addMessage()
    {
        message.setBounds(250,320,200,40);//Setting the size and location of the label
        message.setForeground(Color.black);//Setting foreground Color
        message.setFont(new Font("arial",Font.BOLD,15));//Setting font properties
        frame.add(message);//adding label to the frame
    }
    public void addProgressBar(){
        progressBar.setBounds(100,280,400,30);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.BLACK);
        progressBar.setValue(0);
        frame.add(progressBar);
    }
    public void runningPBar(){
        int i=0;
 
        while( i<=100)
        {
            try{
                Thread.sleep(20);
                progressBar.setValue(i);
                message.setText("LOADING "+Integer.toString(i)+"%");
                i++;
                if(i==100)
                {
                    LoginPage lp = new LoginPage();
                    lp.setVisible(true);
                    frame.dispose();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
 
        }
    }
    public static void main(String args[])
    {
      SplashScreenDemo ssd = new SplashScreenDemo();
    }
}