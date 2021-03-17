package com.techouts;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Attribute
 *
 */
@WebListener
 public class Attribute implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		 
		String s=(String)arg0.getServletContext().getAttribute("no");
		System.out.println(s+"is added");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		 
			String s=(String)arg0.getServletContext().getAttribute("no");
			System.out.println(s+"is removed");	
		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		 
		String s=(String)arg0.getServletContext().getAttribute("no");
		System.out.println(s+"is replaced");	 
		
	}

    
	
}
