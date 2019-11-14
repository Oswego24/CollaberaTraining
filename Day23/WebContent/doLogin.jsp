<%@include file="link.html" %>
<%

	String name = request.getParameter("name");
	String password = request.getParameter("password");

	session = request.getSession(false);
	if(password.equals("admin123")){
		out.print("You are logged in");
		out.print("<br> Welcome, " + name);
		session.setAttribute("name", name);
	}else{
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		
		out.println("Sorry. Incorrect Username or Password");
}
%>