<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.collabera.*, java.sql.*" %>
<%@page import = "com.collabera.EmployeeDao"%>
<%@page import = "com.collabera.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Employees</title>
</head>
<style>
body{
	text-align: center;
}
table{
	margin: auto;
	background-color: #FFF8DC;
	font: 14px arial, sans-serif;
	margin-bottom: 10px;
}
table.emp-table tr:hover{
	background-color: lightGray;
}
tr:nth-child(odd){
	background-color: ;
}
tr:nth-child(even){
	background-color: #FFFAFA;
}
th{
	background-color: #FFFDEAD;
	padding: 8px 0;
}
td{
	min-width:100px;
}
.page-link{
	margin: 2px;
	padding: 4px 6px;
	text-decoration: none;
	border: solid 1px #FFFFFF;
}
.page-link:hover{
	border: solid 1px #4CAF50;
}
.page-link.active{
	background-color: #4CA540;
	color: white;
	font-weight: bold;
}

a {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	color: black;
}

</style>
<body>
<div style='text-align: center'>
<h1>Employee Management System</h1>
</div>

		
<%
String spageNo = request.getParameter("pageNo");
String spageSize = request.getParameter("pageSize");
int pageNo = Integer.parseInt(spageNo);
int pageSize = Integer.parseInt(spageSize);


	List<Employee> list = EmployeeDao.getList(pageNo, pageSize);
	int nrPages = (int)Math.ceil(EmployeeDao.getTotalRecords()/(double)pageSize);
	%>
	
	<table style="width: 50%"><th>
	<form action='view.jsp'>
	Page Number: <select name='pageNo' onchange='this.form.submit()'>
	<% for(int i=1; i<=nrPages; i++){	%>
	<option value='<%=i %>'<%if(i==pageNo){out.print("selected");}%>><%=i %></option>
	<%} %>
	</select>
	<input type='hidden' name='pageSize' value='<%=pageSize%>'>
	</form>
	</th>
	<th>
	<form action='view.jsp'>
	Page Size: <select name='pageSize' onchange='this.form.submit()'>
	<% for(int i=5; i<=50; i++){	%>
	<option value='<%=i %>'<%if(i==pageSize){out.print("selected");}%>><%=i %></option>
	<%} %>
	</select>
	<input type='hidden' name='pageNo' value='1'>
	</form>
	</th>
	<%
		out.print("<th>Page No: " + pageNo + "</th>");
		out.print("<th><a href='employeeForm.jsp?id=-1'>Add Employee</a></th></table><br>");
		out.print("<table class='emp-table' border='1' cellpadding='4' width='60%'>");
		out.print("<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Action");
		for (Employee e : list){
			out.print("<tr><td>" + e.getId()+
						"</td><td>" + e.getFirstName()+
						"</td><td>" + e.getLastName()+ 
						"</td><td><a href='delete.jsp?id=" + e.getId() +"'>Delete</a>" +
						" <a href='employeeForm.jsp?id=" + e.getId()+"'>Update</a>" + "</td></tr>");
		}
		out.print("</table>");
		
%>
<h3>Pages</h3>
<%
	for(int i=1; i<=nrPages; i++){				
%> 
<a class= "page-link" href="view.jsp?pageNo=<%=i%>&pageSize=<%=pageSize%>"><%=i%></a>
<%}
	
%>

</html>