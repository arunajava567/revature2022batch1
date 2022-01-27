package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeCycleDemo1 extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("Init is called");
	}

	
	public void destroy() {
		System.out.println("destroy  is called");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("lifecyle demo");
	}

	
}
