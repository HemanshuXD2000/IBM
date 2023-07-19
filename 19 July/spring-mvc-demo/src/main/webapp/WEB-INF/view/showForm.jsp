<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show From</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">

		<h1>Add Employee</h1>
		<hr>
		<%
		List<String> list = (List<String>) request.getAttribute("error");
		if (list != null) {
			for (String s : list) {
				out.println("<font color='red'>" + s + "</font></br>");
			}
		}
		%>
		<form action="addEmployee" method="post">
			<table class="table w-auto">
				<tr>
					<td>Name:</td>
					<td><input type="text" name="t1"></td>

				</tr>
				<tr>
					<td>Age:</td>
					<td><input type="text" name="t2"></td>

				</tr>
				<tr>
					<td><button class="btn btn-success" type="submit">Save</button>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>