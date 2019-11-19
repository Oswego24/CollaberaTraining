<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "com.collabera.EmployeeDao"%>
<%@page import = "com.collabera.Employee"%>
<%@page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<%
	String empId =request.getParameter("id");
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	Employee emp = new Employee(Integer.parseInt(empId), firstName, lastName);
	Employee inserted = new Employee();
	try {
		inserted = EmployeeDao.insert(emp);
	}catch(Exception e) {
		e.printStackTrace();
	}
	out.print("<h1>Employee: ID: " + emp.getId() + " ,First Name: " + emp.getFirstName() + " ,Last Name: " + emp.getLastName() + " " + " added to the list!");
	
%>	
</body>
</html>