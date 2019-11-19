<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "com.collabera.EmployeeDao"%>
<%@page import = "com.collabera.Employee"%>
<%@page import =  "java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<body>
<%
	String empId =request.getParameter("id");
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	Employee emp = new Employee(Integer.parseInt(empId), firstName, lastName);
	Employee deleted = new Employee();
	try {
		deleted = EmployeeDao.delete(emp);
	}catch(Exception e) {
		e.printStackTrace();
	}
	out.print("<h1>Employee: ID: " + emp.getId() + " ,First Name: " + emp.getFirstName() + " ,Last Name: " + emp.getLastName() + " " + " deleted from the list!");

%>
</body>
</html>