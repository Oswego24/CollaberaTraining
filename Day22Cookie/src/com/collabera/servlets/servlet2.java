package com.collabera.servlets;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="servlet2", urlPatterns="/servlet2")
public class servlet2 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			request.getRequestDispatcher("link.html").include(request, response);
			
			String n = request.getParameter("uname");
			out.print("Hello " + n);
			
			out.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
