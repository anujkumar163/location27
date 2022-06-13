<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location | created</title>
</head>
<body>
	<h2>Location | Add new Location</h2>
	<form action="saveLocation" method="post">
	<pre>
		Id<input type="text" name="id"/>
		Name<input type="text" name="name"/>
		Code<input type="text" name="code"/>
		Type:
		urban<input type="radio" value="urban" name="type"/>
		rural<input type="radio" value="rural" name="type"/>
		<input type="submit" value="submit"/>
	</pre>
	</form>
	${msg}
</body>
</html>