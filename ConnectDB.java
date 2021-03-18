/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class ConnectDB {
    public Connection con;
    public Connection connect_data ()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/one","pariram","javajava!@#$1234");
        }
        catch(Exception e)
        {
         System.out.print(e.getMessage());   
        }
        return con;
    }
    
}
