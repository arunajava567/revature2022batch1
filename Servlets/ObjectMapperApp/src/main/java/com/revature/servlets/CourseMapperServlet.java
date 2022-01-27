package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;



public class CourseMapperServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Course c=new Course(101,"Java FSD");  //object to be converted 
		
		PrintWriter out=response.getWriter(); //to display on browser 
		
				
		out.write(new ObjectMapper().writeValueAsString(c)); //converting and printing
		
		try {
			int x=10/0;
			out.println(x);
		} catch (Exception e) {
			RequestDispatcher rd=request.getRequestDispatcher("/errorHandler");
			 rd.forward(request, response);
		}
		
		
	}

}
