package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class HelloServlet extends GenericServlet  {
	/*public void init() throws ServletException
		{
		
	}
	public void destroy() {
		
	}*/
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("Welcome");
		out.println("<h1>Welcome to Generic Servlet </h1>");
		
		
		
	}

}
