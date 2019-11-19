package com.collabera;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ControllerServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
							throws ServletException, IOException{
		response.setContentType("html.text");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		LoginBean bean = new LoginBean();
		bean.setName(name);
		bean.setPassword(password);
		request.setAttribute("bean", bean);
		
		boolean status = bean.validate();
		
		if(status) {
			RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
			rd.forward(request, response);
		}
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		doPost(req,resp);
	}
}
