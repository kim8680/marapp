<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
	<h2>Details | Register</h2>
	<form action="saveemployee" method="post">
	<pre>
		Id<input type="text" name="id"/>
		Name<input type="text" name="name"/>
		<input type="submit" value="save"/>
	</pre>
	</form>
	${msg }
</body>
</html>