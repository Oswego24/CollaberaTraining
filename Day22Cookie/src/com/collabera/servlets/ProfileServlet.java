package com.collabera.servlets;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="ProfileServlet", urlPatterns= {"/ProfileServlet", "/profile"})
public class ProfileServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
//		Cookie ck[] = request.getCookies();
//		if(ck!=null) {
//			String name = ck[0].getValue();
//			if(!name.equals("")||name!=null) {
//				out.print("<b>Welcome to Profile</b>");
//				out.print("<br> Welcome, " + name);
//			}
		
		// return session only if it already exists
		HttpSession session = request.getSession(false);
															
		if(session!=null) {
			String name = (String)session.getAttribute("name");
			if(!name.equals("")||name!=null) {
				out.print("<b>Welcome to Profile</b>");
				out.print("<br> Welcome, " + name);
			}
		} else {
			out.print("Please login first.");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
	}
}
