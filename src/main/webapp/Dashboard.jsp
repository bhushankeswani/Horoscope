<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  	java.util.Random r=new java.util.Random(); 
  	int a=r.nextInt(100);
  	int b=r.nextInt(100);
  	int c=r.nextInt(100);
  	int d=r.nextInt(100);
  	int e=r.nextInt(100);
	PrintWriter PW=new PrintWriter(System.out);
%>
  your Love life Today <%=a+"%"%><br>
  your Health life Today <%=b+"%"%><br>
  your Travel life Today <%=c+"%"%><br>
  your Career life Today <%=d+"%"%><br>
  your Money life Today <%=e+"%"%><br>
</body>
</html>