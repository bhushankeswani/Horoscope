package com.bhushan;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String InputEmail=req.getParameter("Email");
		String InputPassword=req.getParameter("Password");
		Lmodel LmodelObject=new Lmodel();
		boolean LoginSuccess=false;
		try
		{
			LoginSuccess=LmodelObject.DB(InputEmail,InputPassword);
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("class ya sql eraror");
		}
		if(LoginSuccess)
		{
			res.sendRedirect("Dashboard.jsp");
		}
		else
		{
			 res.sendRedirect("Login.jsp");
			
		}
	}
}
