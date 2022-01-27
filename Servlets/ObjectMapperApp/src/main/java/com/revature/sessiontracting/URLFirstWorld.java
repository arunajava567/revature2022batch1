package com.revature.sessiontracting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class URLFirstWorld extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	     String username = req.getParameter("user");
	     res.setContentType("text/html");
	     PrintWriter out = res.getWriter();
	     //URL appending data and sending next page -URL REwriting 
	     out.println("Hello! <a href=http://localhost:8086/ObjectMapperApp/URLSecondWorld?uname="+username+"> Click Here </a> to proceed");	

	}

}
