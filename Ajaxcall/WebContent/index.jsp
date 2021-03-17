 <!DOCTYPE html>
<%@page import="java.sql.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
 
function view(){
	 no=document.f.add.value;
	http=new XMLHttpRequest();
	  
	http.onreadystatechange=function(){
		 document.getElementById("demo").innerHTML = this.responseText;
		
	}
	
	 http.open("GET", "view.jsp?va="+no, true);
	   http.send();
	 
}
function remove(){
	 no=document.f.sub.value;
	http=new XMLHttpRequest();
	  
	http.onreadystatechange=function(){
		 document.getElementById("demo").innerHTML = this.responseText;
		
	}
	
	 http.open("GET", "NewFile1.jsp?va="+no, true);
	   http.send();
	 
}
</script>
</head>
<body>
 
 <form name="f">
  <input type="text"   name="add">
<input type="button" onclick="view()" value="+">
    <input type="text"   name="sub">
  
<input type="button" onclick="remove()" value="-" >
</form>
<p id="demo"> </p>
 
</body>
</html>