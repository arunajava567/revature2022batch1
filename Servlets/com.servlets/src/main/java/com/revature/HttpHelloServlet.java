package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpHelloServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Welcome to Servlets");
		out.println("<h1>Welcome to HTTP Servlets</h1>");
		
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		if(id.equalsIgnoreCase("revature123") && pwd.equalsIgnoreCase("revature123"))
			
			out.println("<h1>VALID</h1>");
		else
			out.println("<h1>INVALID</h1>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
		 * protected void doPost(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { // TODO Auto-generated
		 * method stub doGet(request, response); }
		 */

}
