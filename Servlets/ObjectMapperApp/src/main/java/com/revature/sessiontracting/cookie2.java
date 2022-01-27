package com.revature.sessiontracting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookie2
 */
public class cookie2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		 res.setContentType("text/html");
	     PrintWriter out = res.getWriter();
	     
	     Cookie c[]=req.getCookies();
	 
	     for(int i=0;i<c.length;i++) {
	    	 out.println(c[i].getName()+"  "+c[i].getValue());
	    	 
	     }
	     
	}

}
