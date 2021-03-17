<%@page import="java.sql.*"%>
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  a{
text-descoration:none;
 
}
</style>
</head>
<body>
<%
String s=(String)session.getAttribute("username");
if(s==null){
	%>
	<script>
	 alert("please login");
	</script>
	<%  
	response.sendRedirect("index.jsp");
	
}

else{
	 
	 Class.forName("com.mysql.jdbc.Driver");  
	 Connection con1=DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/hBReXCo0Ve","hBReXCo0Ve","B9eHkDCCYT");
		 PreparedStatement st1=con1.prepareStatement("select * from register where username=?");
st1.setString(1, s);
ResultSet rs=st1.executeQuery();
	rs.next();
	%>
	<center>Your details are<br>
	<%  
	out.println("username is"+rs.getString(1)+"<br>");
	out.println("password is"+rs.getString(2)+"<br>");
	out.println("Your password  is "+rs.getString(3)+"<br>");

	out.println("Qualification is "+rs.getString(4));

	
}


%>
<br>
<a href="index.jsp">Go to Homepage</a>
</center>
</body>
</html>