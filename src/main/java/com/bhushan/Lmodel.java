package com.bhushan;
import com.mysql.*;



import java.io.PrintWriter;
import java.sql.*;
public class Lmodel 
{
	public static boolean DB(String Email,String Password) throws ClassNotFoundException, SQLException
	{
		String url="jdbc:mysql://127.0.0.1:3306/Horoscopedb";
		String username="root";
		String password="bhushan";
		String query="Select Email,password from primarytable";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String StoredEmail =rs.getString("Email");
		String StoredPassword =rs.getString("password");
		st.close();
		rs.close();
		con.close();
		if(Email.equals(StoredEmail) && Password.equals(StoredPassword))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}