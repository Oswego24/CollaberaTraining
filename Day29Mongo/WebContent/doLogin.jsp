<%@include file="link.html" %>
<%
	String name = request.getParameter("name");
	String password = request.getParameter("password");

	session = request.getSession(false);
	if(name.equals("Oscar") && password.equals("admin123")){
		out.print("You are logged in");
		out.print("<br> Welcome, " + name);
		session.setAttribute("name", name);

%>	
<hr>
 <a href="employeeList.jsp">View Employees</a>
<% 
	}else{
		//RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		//rd.forward(request, response);
		
		out.println("Sorry. Incorrect Username or Password");
}
%>
