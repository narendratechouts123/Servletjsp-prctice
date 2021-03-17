package com.techouts;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Class1
 */
@WebServlet("/Class1")
public class Class1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 ServletContext context=getServletContext();

		context.setAttribute("no", "knr");
		 
		Cookie ck=new Cookie("name", "KNR");
		Cookie ck1=new Cookie("name","knr1");
		response.addCookie(ck);
		response.addCookie(ck1);

	}
	

}
