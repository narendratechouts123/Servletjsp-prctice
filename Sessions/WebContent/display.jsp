<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>
<%@page import="com.techouts.Connections"%>
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
int total =0;
 int pageno=1;
if( request.getParameter("page")==null){
	pageno=1;
}else{
  pageno=Integer.parseInt(request.getParameter("page"));
}
int allpages=5;
 
	 
 total=allpages *pageno;
	int left =allpages*(pageno-1) ;
 Connections con=new Connections();
 Connection con1=con.main();
 PreparedStatement st=con1.prepareStatement("select username,password  from register limit "+ (left+1 )+","+(total));
 ResultSet rs=st.executeQuery();
 while(rs.next()){
	 out.print(rs.getString(2)+"  "+rs.getString(1));
	 out.println("<br>");
 }
 

 


%>

<a href="display.jsp?page=1">1</a>
<a href="display.jsp?page=2">2</a>
<a href="display.jsp?page=3">3</a>

</body>
</html>