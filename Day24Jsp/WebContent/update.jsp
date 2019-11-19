<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "com.collabera.EmployeeDao"%>
<%@page import = "com.collabera.Employee"%>
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
<title>Update</title>
</head>
<body>

<%
	String sId=request.getParameter("id");
	int id = Integer.parseInt(sId);
	if(id < 0){
		//insert
	}else{
		//update
	}
	Employee emp = new Employee(id,"","");
	String readonly= "";
	out.print("ID: "+ id);
	if(id>0){
		readonly="readonly";
		emp = EmployeeDao.insert(emp);
	}
%>
	<h2>Update Employee:</h2>
	<form action="doUpdate.jsp" method="post">
		<label>ID:</label><input type="text" name="id" value="<%=emp.getId() %>" ><br><br>
		<label>First Name:</label><input type="text" name="firstName" value="<%=emp.getFirstName() %>"><br><br>
		<label>Last Name:</label><input type="text" name="lastName" value="<%=emp.getLastName() %>"><br><br>
		<input type="submit" name="Update">
	</form>
</body>
</html>