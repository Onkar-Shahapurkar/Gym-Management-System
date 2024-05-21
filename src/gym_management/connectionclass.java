package gym_management;

import java.sql.*;

public class connectionclass 
{
    Connection con;
    Statement stmt;
    connectionclass()
    {
      try
      {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root", "onkar2814");
        stmt=con.createStatement();
        System.out.println("Successfull");
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
    }
    
}