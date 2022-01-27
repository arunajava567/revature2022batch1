package com.revature.sessiontracting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class session2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 res.setContentType("text/html");
	     PrintWriter out = res.getWriter();
	     HttpSession session=req.getSession(true);
	     
	     int m=Integer.parseInt((String)session.getAttribute("m"));
         int newmarks=m*2;
	     out.println("Name:"+session.getAttribute("n"));
	     out.println("Marks:"+newmarks);
	     
		 session.setAttribute("newmarks", newmarks);
		 
		 out.println(session.getAttribute("newmarks"));
	   
	}

}
