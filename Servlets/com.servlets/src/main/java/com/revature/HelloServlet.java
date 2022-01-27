package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet extends GenericServlet  implements Servlet{
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Welcome to Servlets");
		out.println("<h1>Welcome to Servlets</h1>");
		
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		if(id.equalsIgnoreCase("revature") && pwd.equalsIgnoreCase("revature"))
			
			out.println("<h1>VALID</h1>");
		else
			out.println("<h1>INVALID</h1>");
		
		
	}

}
