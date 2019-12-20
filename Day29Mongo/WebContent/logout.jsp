<%@include file="link.html" %>
<%
	session.invalidate();
	out.print("You are successfully logged out");
%>