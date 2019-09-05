<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add user</title>
</head>
<body>
	<h3 style="color: red;">Add New user</h3>

		<form:form action="/addNewUser" method="post" modelAttribute="user">
			<p>
				<label>Enter user Id</label>
				<form:input path="id" />
			</p>
			<p>
				<label>Enter Name</label>
				<form:input path="name" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
</body>
</html>