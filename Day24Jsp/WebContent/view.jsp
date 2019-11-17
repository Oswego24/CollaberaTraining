<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import = "java.util.*, com.collabera.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<hr>
	<%Employee emp = new Employee(); %>
	<a href="add.jsp?id=<%=emp.getId() %>">Create</a>&nbsp;

<table class="emp-table" border="1">
 <tr>
  <th>Id</th>
  <th>First Name</th>
  <th>Last Name</th>
  <th>Action</th>
 </tr>
<%
	String spageNo=request.getParameter("pageNo");
	int pageNo = Integer.parseInt(spageNo);
	int pageSize = 10;
	int nrPages = (int)Math.ceil(EmployeeDao.getTotalRecords()/(double)pageSize);

	List<Employee> list = EmployeeDao.getList(pageNo, pageSize);

	out.print("<h1>Page No: " + pageNo + "</h1>");
	
	//USED IF WE ARE MAKING OUR OWN DATABASE RATHER THAN CONNECTING TO MYSQL
	out.print("<h1>Page Size: "+ pageSize + "</h1>");
	//out.print("<table border = '1' cellpadding = '4' width = '60%'>");
	//out.print("<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Action</th></tr>");
	
	//for(Employee e:list){
	//	out.print("<tr><td>" + e.getId() +
	//			  "</td><td>" + e.getFirstName() + 
	//			  "</td><td>" + e.getLastName() + 
	//			  "</td><td><a href='delete.jsp?id=" + e.getId() + "'>Delete</a>" + 
	//			  "&nbsp;<a href='update.jsp?id=" + e.getId() + ">Update</a>" +
	//			  "</td></tr>");
%>
	
	<%for(Employee e:list){ %>
	<tr>
	 <td><%=e.getId() %></td>
	 <td><%=e.getFirstName() %></td>
	 <td><%=e.getLastName() %></td>
	 <td><a href="read.jsp?id=<%=emp.getId() %>">Read</a>&nbsp;
		 <a href="update.jsp?id=<%=emp.getId() %>">Update</a>
		 <a href="delete.jsp?id=<%=emp.getId() %>">Delete</a>&nbsp;
	</td>
	</tr>
	<%} %>
</table>
<div class="pagination">
<span>Pages: </span>
<%
	String cssActive="";
	for(int i=1; i<=nrPages; i++){
		if(i==pageNo){
			cssActive="active";
		}
		else cssActive="";
%>
	<a class="page-link <%=cssActive%>" href="view.jsp?pageNo=<%=i%>"><%=i %></a>
	<%}%>
</div>
</body>
</html>