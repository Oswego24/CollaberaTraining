<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<%
	String name = request.getParameter("uname");
	out.println("Welcome " + name);
	out.print("<br>HTTP Method "+ request.getMethod());
	
	String param = config.getInitParameter("dname");
	out.print("<hr>Init Parameter is: " + param);
%>
</body>
</html>