<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	Add todo ${name }
	<form method="post">
		<fieldset class="form-group">
			<label>Todo Description:</label>
			<input type="text" name="desc" class="form-control"  />
		</fieldset>
		 
		<button type="submit" class="btn btn-success">Add</button>
	</form>

<%@ include file="common/footer.jspf" %>