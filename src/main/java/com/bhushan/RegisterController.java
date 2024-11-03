package com.bhushan;


import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet
{
	String name;
	String surname;
	String DOB;
	String Phone;
	String Email;
	String POB;
	String TOB;
	String password;
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		 name=req.getParameter("Fname");
		 surname=req.getParameter("Lname");
		 DOB=req.getParameter("DOB");
		 Phone=req.getParameter("Phone");
		 Email=req.getParameter("Email");
		 POB=req.getParameter("POB");
		 TOB=req.getParameter("TOB");
		 password=req.getParameter("password");
		 boolean RegisteredSuccessfully=false;
		 Rmodel rm=new Rmodel();
		 System.out.println(DOB);
			 try 
			 {
				RegisteredSuccessfully=rm.Rmain();
			 }	
			 catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 if(RegisteredSuccessfully)
		 {
			 res.sendRedirect("Login.jsp");
		 }
		 else
		 {
			 System.out.println(" this is not registered");
		 }
	}
}
