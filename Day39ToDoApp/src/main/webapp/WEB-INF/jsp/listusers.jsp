<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>User Name</th>
					<th>Password</th>
					<th>Full Name</th>
					<th>Roles</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<!-- for(Items item: val) -->
				<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.userName}</td>
						<td>**********</td>
						<td>${user.fullName}</td>
						<td><a role="button" class="btn btn-Success"
							href="/edituser?userId=${user.id}">Edit</a></td>
						<td><a role="button" class="btn btn-warning"
							href="/deleteuser?userId=${user.id}">Delete</a></td>
					</tr>

				</c:forEach>

			</tbody>

		</table>



		Click here to <a href="/user"> Add User </a>

<%@ include file="common/footer.jspf" %>