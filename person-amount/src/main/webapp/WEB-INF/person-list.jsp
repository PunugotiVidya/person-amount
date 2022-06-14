<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<link
	href="/person-amount/UrlToReachResourceHandler/css/mystylesheet.css"
	type="text/css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>person-list</title>
</head>
<body>
	<div align="center">
		<h1>Person List</h1>
	</div>
	<div class="container">
		<form action="/person-amount/personAddList">
			<input type="submit" value="ADD" class="btn btn-primary">
		</form>
		<br>
		<table border=1 class="table table-stripped">
			<thead>
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>AMOUNT</th>
				</tr>

			</thead>
			<c:forEach var="person" items="${persons}">
				<tr>
					<td>${person.id }</td>
					<td>${person.name }</td>
					<td>${person.amount }</td>
					<td><a href="/person-amount/updatePerson?userId=${person.id}">Update</a></td>
					<td><a href="/person-amount/deletePerson?userId=${person.id}"
						onclick="if (!(confirm('Are you sure want to delete?'))) return false">Delete</a></td>
				</tr>
			</c:forEach>

		</table>

	</div>

</body>
</html>