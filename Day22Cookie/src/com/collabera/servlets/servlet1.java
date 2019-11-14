package com.collabera.servlets;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="servlet1", urlPatterns="/servlet1")
public class servlet1 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			request.getRequestDispatcher("link.html").include(request, response);
			
			String n = request.getParameter("userName");
			out.print("Welcome, " + n);
			
			// appending the user name in the query string
			out.print("<a href='servlet2?uname="+n+"'>Visit</a>");
			
			// creating form that has invisible text field
			//out.print("<form action='servlet2'>");
			//out.print("<input type='hidden' name='uname' value='" + n + "'>");
			//out.print("<input type='submit' value='go'>");
			//out.print("</form>");
			//out.close();
		} catch (Exception e) {System.out.println(e);}
	}
		
}
