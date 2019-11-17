<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "com.collabera.model.EmployeeDao"%>
<%@page import = "com.collabera.model.Employee"%>
<%@page import =  "java.util.*"%>
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
<title>Delete</title>
</head>
<body>
	<h2>Confirm ID to be deleted:</h2>
	<form action="doDelete.jsp" method="post">
		<label>ID:</label><input type="text" name="id" ><br><br>
		<input type="submit" name="Delete">
	</form>
</body>
</html>