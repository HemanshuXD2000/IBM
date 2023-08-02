<%@page import="org.example.model.League"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="org.example.entity.LeagueEntity"%>
<%@page import="java.util.List"%>
<%@page import="org.example.factory.MyHibernateSessionFactory"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<%
	Session session2 = MyHibernateSessionFactory.getHibernateSession();
	session2.beginTransaction();

	List<LeagueEntity> leagues = session2.createQuery("FROM league_table").list();
	session2.getTransaction().commit();
	%>
	<div class = "container">
	<h1>Available Leagues</h1>
	<table class="table table-striped w-auto">
		<tr>
			<th>Name</th>
			<th>Season</th>
			<th>Year</th>
		</tr>
		<%
		for (LeagueEntity league : leagues) {
		%>
		<tr>
			<td><%=league.getTitle()%></td>
			<td><%=league.getSeason()%></td>
			<td><%=league.getYear()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<a href = "index.jsp">Homepage</a>
</div>
</body>
</html>