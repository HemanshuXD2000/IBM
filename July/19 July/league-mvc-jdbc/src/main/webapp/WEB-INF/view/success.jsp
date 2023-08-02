<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<div class="container">
		<h1>League Added Successfully....</h1>
		<hr>
		<br />
		<table class="table table-striped w-auto">
			<tr>
				<th>Name</th>
				<th>Season</th>
				<th>Year</th>
			</tr>
			<tr>
				<td>${league.title }</td>
				<td>${league.year }</td>
				<td>${league.season }</td>
			</tr>
		</table>
		<a href="home">Homepage</a>
	</div>

</body>
</html>