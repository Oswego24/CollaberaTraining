package com.collabera.servlets;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="LogoutServlet", urlPatterns= {"/LogoutServlet", "/logout"})
public class LogoutServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		//Cookie ck = new Cookie("name", "");
		//ck.setMaxAge(0);
		//response.addCookie(ck);
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		out.print("You are successfully logged out!");
		out.close();
	}
}
