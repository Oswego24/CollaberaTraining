<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "com.collabera.EmployeeDao"%>
<%@page import = "com.collabera.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
<%
	String empId =request.getParameter("id");
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	Employee emp = new Employee(Integer.parseInt(empId), firstName, lastName);
	emp = EmployeeDao.insert(emp);
	if(emp!=null){
		out.print("<h1>Employee: " + emp.getId() + " " + emp.getFirstName() + " " + emp.getLastName() + " Saved!");
	}
%>	
</body>
</html>