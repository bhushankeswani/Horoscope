package com.bhushan;
import com.mysql.*;
import java.sql.*;
public class Rmodel 
{
	public boolean Rmain() throws ClassNotFoundException, SQLException
	{
		System.out.println("this is being called");
		RegisterController rc=new RegisterController();
		String url="jdbc:mysql://127.0.0.1:3306/horoscopedb";
		String username="root";
		String password="bhushan";
		
		String Fname= rc.name;
		String Lname=rc.surname;
		String MobileNo=rc.Phone;
		String Email=rc.Email;
		String TOB=rc.TOB;
		String POB=rc.POB;
		String Date=rc.DOB;
		String Password=rc.password;
		
		String query="insert into primarytable (Fname, Lname, DOB, Phone, Email, POB, TOB, password) values(?,?,?,?,?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager.getConnection(url, username, password);
	             PreparedStatement pstmt = con.prepareStatement(query)) 
		{
	            pstmt.setString(1, Fname);
	            pstmt.setString(2, Lname);
	            pstmt.setString(3, Date);  
	            
	            if (MobileNo != null && !MobileNo.isEmpty()) 
	            {
	                pstmt.setString(4,MobileNo);  // Safely insert phone number as string
	            }
	            else 
	            {
	                pstmt.setString(4, null);  // Or handle null case if appropriate
	            }
	           
	            pstmt.setString(5, Email);
	            pstmt.setString(6, POB);
	            pstmt.setString(7, TOB);  // Convert to SQL time
	            pstmt.setString(8, Password);
	            int count=pstmt.executeUpdate();
	            System.out.println(count+" Rows Affected");
	            return count>0;
		}
	
	}
}
