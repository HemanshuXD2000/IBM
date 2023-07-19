<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" method="post" modelAttribute="league">
	Year: <form:input path="year"/><br/><br/>
	Session: 
	<form:select path="season">
		<form:option value="UNKNOWN">--Select--</form:option>
		<form:option value="Winter">Winter</form:option>
		<form:option value="Summer">Summer</form:option>
		<form:option value="Fall">Fall</form:option>
		<form:option value="Autumn">Autumn</form:option>
	</form:select><br/><br/>
	Title: <form:input path="title"/><br/><br/>
	<input type="submit" value="submit" /> 
</form:form>
</body>
</html>