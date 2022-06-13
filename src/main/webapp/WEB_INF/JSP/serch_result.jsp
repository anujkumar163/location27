<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
		<th>Id</th>
		<th>Code</th>
		<th>Name</th>
		<th>Type</th>
		<th>Delete</th>
		<th>Update</th>
	</tr>
	<c:forEach var="location" items="${locations }">
	<tr>
		<td>${location.id}</td>
		<td>${location.code }</td>
		<td>${location.name }</td>
		<td>${location.type }</td>
		<td><a href="delete?id=${location.id }">Delete</a></td>
		<td><a href="update?id=${location.id }">Update</a></td>
	</tr>
	</c:forEach>
	</table>
	
</body>
</html>