
package Pymentapp.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PaymentappDAO {
	public void insert(user u)
	{
		try {

			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/payments","root","root");
				 Statement stmt = con.createStatement();
				String query = "insert into paymentapp(firstname,lastname,phonenumber,createpassword)values('"+u.getFirstName()+"','"+u.getCreatePassword()+"','"+u.getLastName+"','"+u.getPhoneNmuber+"')";
				System.out.println(query);
				stmt.executeUpdate(query);
				con.close();
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}
	public boolean validlogin(String username,String password)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection con = DriverManager.getConnection("");
				Statement stmt =  con.createStatement();
				String query = "select user_name,user_password from user_info";
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next())
				{
					if(rs.getString("user_name").equals(username)&& rs.getString("user_password").equals(password))
					{
						return true;
					}
				}
				System.out.println(query);
				con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
			
				
				
		}
	}

	

}

