one way of connectivity



package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbcon {

	static Connection con;
	public static Connection create()
	
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crime","root","root");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
		
	}
}



another way of connectivity and to get data from the database




import java.sql.*;
  
class MysqlCon{  

public static void main(String args[]){ 
 
try{
   
    Class.forName("com.mysql.jdbc.Driver");   

    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");  

//here sonoo is database name, root is username and password  

           Statement stmt=con.createStatement();  
           ResultSet rs=stmt.executeQuery("select * from emp");  
           while(rs.next())  
           System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
           con.close();  
      } 
catch(Exception e)
{ 
   System.out.println(e);
 }  
   }  
    }  