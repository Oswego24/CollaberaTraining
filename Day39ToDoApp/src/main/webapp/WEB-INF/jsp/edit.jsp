<!-- <html>
 <head>
 <%@ include file="common/header.jspf" %>
 <%@ include file="common/navigation.jspf" %>
 <title>
 	Edit Todo for ${name}
 </title>
 <link href="webjars/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
 </head>
 <body>
 	Edit Todo for ${name}
 	<form:form method="post" modelAttribute="edit">
 	<form:hidden path="id"/>
 	<form:hidden path="user"/>
 	<form:hidden path="targetDate"/>
 		<fieldset class="form-group">
 			<form:label>Edit description:</form:label> 
 			<form:input type="text" path="desc" class="form-control" required="required"/>
 			<form:errors path="desc" class="text-warning"/>
 		</fieldset>
 		
 		<input type="submit" value="Submit"/>
 	</form:form>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 </body>
 <%@ include file="common/footer.jspf" %>
 </html> -->