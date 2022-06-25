package Util;
import java.sql.Connection;
import java.sql.DriverManager;

import java.util.*;

public class MysqlDBConexion 
{
    static
    {
        try 
        {   Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) 
        {   e.printStackTrace();
        }
    }
    public static Connection getConexion()
    {
        Connection con=null;
        try 
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost/web_taller_utp","root","");
        }
        catch (Exception e) 
            
        {
            e.printStackTrace();
        }
        return con;
    }

}