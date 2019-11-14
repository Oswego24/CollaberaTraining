<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import = "java.util.*, com.collabera.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String spageNo=request.getParameter("pageNo");
int pageNo = Integer.parseInt(spageNo);
int total = 5;

List<Employee> list = EmployeeDao.getList();

out.print("<h1>Page No: " + pageNo + "</h1>");
out.print("<table border = '1' cellpadding = '4' width = '60%'>");
out.print("<tr><th>Id</th><th>First Name</th><th>Last Name</th>");
for(Employee e:list){
	out.print("<tr><td>" + e.getId() + "</td><td>" + e.getFirstName() + "</td><td>" + e.getLastName() + "</td></tr>");
}
out.print("</table>");
%>
</body>
</html>