<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
<form:form action="processForm" method="post" modelAttribute="student">
	First Name: <form:input path="firstName"/>
	Last Name: <form:input path="lastName"/>
	Email: <form:input path="email"/>
	<input type="submit" value="Update"/>
</form:form>
</body>
</html>