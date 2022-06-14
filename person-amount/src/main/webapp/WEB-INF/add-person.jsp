<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD PERSON</title>
</head>
<body>
	<div align="center">
		<table border="0">
			<form:form modelAttribute="person" action="save-person" method="POST">
				<h3>ADD PERSON</h3>

				<tr>
					<td><form:hidden path="id" /></td>
				</tr>
				<tr>
					<td><label>Name:</label></td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td><label>Amount:</label></td>
					<td><form:input path="amount" /></td>
				</tr>
				<tr align="center">
					<td><input type="submit" value="ADD PERSON"></td>
				</tr>
			</form:form>
		</table>
	</div>
</body>
</html>