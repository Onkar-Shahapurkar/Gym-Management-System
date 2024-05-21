package gym_management;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import java.util.Properties;
        
public class SendEmail {
    
   public SendEmail(String month,String to)
    {
    String message = " Dear Client, Your Fees are Pending for the "+month+" Month. \n Your are hereby notified to pay your fees as early as Possible \n\n\n Team Fitness Point !!!!!!!!";
    String subject = "Notice about the Due Fees";
    
    String from = "shahapurkaronkar@gmail.com";
    System.out.println("Preparing to send message");
    
    String host = "smtp.gmail.com";
    Properties p = System.getProperties();
    System.out.println("Properties = "+p);
    
    p.put("mail.smtp.host", host);
    p.put("mail.smtp.port", "465");
    p.put("mail.smtp.ssl.enable", "true");
    p.put("mail.smtp.auth", "true");
    Session s = Session.getInstance(p, new Authenticator()
    {
     @Override
    protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication("shahapurkaronkar@gmail.com","bmgcinexywauofch");
    }
    });
    MimeMessage m = new MimeMessage(s);
    try {
    m.setFrom(new InternetAddress(from));
    m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
    m.setSubject(subject);
    m.setText(message);
    Transport.send(m);
    }
    catch(MessagingException e)
    {
    e.printStackTrace();
    }
    finally
    {
    System.out.println("Completed");
    }
    }

}