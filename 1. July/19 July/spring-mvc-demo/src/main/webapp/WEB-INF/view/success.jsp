<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<title>Success page</title>
</head>
<body>
	<div class = "container">
		Hello ${emp.employeeName }
		<br/>
		Your Age is ${emp.age }
		<br/>
		<a href = "http://localhost:8081/spring-mvc-demo">Homepage...</a>
	</div>
</body>
</html>