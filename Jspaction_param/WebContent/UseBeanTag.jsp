<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ob" class="com.techouts.Bean" />
<jsp:setProperty property="no" name="ob" value="12"/>
<jsp:setProperty property="name" name="ob" value="narendra"/>

 <jsp:getProperty property="no" name="ob"/>
  <jsp:getProperty property="name" name="ob"/>
 
 
</body>
</html>