<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="RegisterServlet" method="post">
		Name: <input type="text" name="userName"> <br>
		Password<input type="password" name="password"> <br>
		Email:<input type="text" name="email"> <br>
		Language: <select name="language">
			<option>English</option>
			<option>Spanish</option>
			<option>French</option>
		</select> <br>
		<input type="submit" value="Call Servlet">
	</form>
</body>
</html>