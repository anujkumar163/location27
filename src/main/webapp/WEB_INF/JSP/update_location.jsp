<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update here</title>
</head>
<body>
	<h2>Update here | Location</h2>
	<form action="updateLocation" method="post">
	<pre>
		Id<input type="text" name="id" value="${location.id}"/>
		Name<input type="text" name="name" value="${location.name}"/>
		Code<input type="text" name="code" value="${location.code}"/>
		Type:
		urban<input type="radio" value="urban" name="type"/>
		rural<input type="radio" value="rural" name="type"/>
		<input type="submit" value="update"/>
	</pre>
	</form>
</body>
</html>