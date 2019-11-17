<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "com.collabera.model.EmployeeDao"%>
<%@page import = "com.collabera.model.Employee"%>
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
<title>Create Employee</title>
</head>
<body>
	<h2>Add Employee:</h2>
	<form action="doAdd.jsp" method="post">
		<label>ID:</label><input type="text" name="id" ><br><br>
		<label>First Name:</label><input type="text" name="firstName"><br><br>
		<label>Last Name:</label><input type="text" name="lastName"><br><br>
		<input type="submit" name="Add">
	</form>
</body>
</html>