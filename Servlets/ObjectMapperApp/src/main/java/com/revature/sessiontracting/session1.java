package com.revature.sessiontracting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class session1
 */
public class session1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  String name = req.getParameter("name");
		  String marks = req.getParameter("marks");
		  
		     res.setContentType("text/html");
		     PrintWriter out = res.getWriter();
		     
		     HttpSession session=req.getSession();
		     
		     session.setAttribute("n",name );
		     session.setAttribute("m", marks);
		     
		     RequestDispatcher rd=req.getRequestDispatcher("session2");
		     rd.forward(req, res);
		  
	}

}
