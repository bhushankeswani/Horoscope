package com.bhushan;

import java.util.Random;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DController extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		Random r=new Random();
		int a=r.nextInt();
		
	}
	
}
