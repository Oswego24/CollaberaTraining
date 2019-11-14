<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Demo</title>
</head>
<body>
	<jsp:include page="header.jsp">
	<hr/>
	<h2>This is main content</h2>
	<hr/>
	<jsp:include page="footer.jsp">
</body>
</html>