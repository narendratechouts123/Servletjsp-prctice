package com.techouts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Class2
 */
@WebServlet("/Class2")
public class Class2 extends HttpServlet {
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		 Cookie[] ck=request.getCookies();
			String s= ck[0].getName() ;
			 ServletOutputStream sc=response.getOutputStream();
			 sc.write(s.getBytes());
					 
		 
	}
 
 

}
