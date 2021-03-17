<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 
  
 
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/hBReXCo0Ve","hBReXCo0Ve","B9eHkDCCYT");
System.out.println(con);
 
PreparedStatement ps=con.prepareStatement("select no from number where name='k'");
 
ResultSet rs=ps.executeQuery();
rs.next();
 
%>
<%
int no1=rs.getInt(1);

int add=Integer.parseInt(request.getParameter("va"));
no1=no1-add;
PreparedStatement ps1=con.prepareStatement("update number set no=? where name='k'");
ps1.setInt(1, no1);
ps1.executeUpdate();
out.print(no1);

%>
</body>
</html>