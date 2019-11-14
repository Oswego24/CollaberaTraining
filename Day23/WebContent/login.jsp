<%@include file="link.html" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
	a{
		padding: 10px;
		margin: 0 20px ;
	}
	a:hover{
		background-color: lightgray;
	}
</style>
<title>Login</title>
</head>
<body>
	<h2>Please log in:</h2>
	<form action="doLogin.jsp" method="post">
		<label>Name:</label><input type="text" name="name"><br><br>
		<label>Password:</label><input type="password" name="password"><br><br>
		<input type="submit" name="Login">
	</form>
</body>
</html>