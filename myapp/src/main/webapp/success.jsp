<%@page import="org.example.entity.LeagueEntity"%>
<%@page import="org.example.model.League"%>
<%@page import="org.example.factory.MyHibernateSessionFactory"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
League league = (League) request.getAttribute("LEAGUE");
LeagueEntity entity = new LeagueEntity(league.getYear(),league.getSeason(),league.getTitle());


Session session2 = MyHibernateSessionFactory.getHibernateSession();
session2.getTransaction().begin();
session2.save(entity);
session2.getTransaction().commit();
%>

<div class = "container">
	<h1>League Added Successfully....</h1>
	<table class="table table.striped w-auto">
		<tr>
			<th>Name</th>
			<th>Season</th>
			<th>Year</th>
		</tr>
		<tr>
			<td><%=league.getTitle()%></td>
			<td><%=league.getSeason()%></td>
			<td><%=league.getYear()%></td>
		</tr>
	</table>
	</div>

</body>
</html>