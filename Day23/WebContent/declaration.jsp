<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "com.collabera.jsp.Math" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Declaration</title>
</head>
<body>
	<h1>Declaration Tag Demo:</h1>
	<%! int data=50; %>
	<%!
	int cube(int n){
		return n*n*n;
	}
	%>
	<%= "Variable has a value of " + data %>
	<%
	Math math = new Math();
	out.print("<hr>Square of 7 is: " + math.square(7)); 
	%>
	<%= "<hr>Cube is:" + cube(3) %>
</body>
</html>