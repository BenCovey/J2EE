<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voting for the...</title>
</head>
<body>
	<h1>Login Page</h1>
	<p style= "color:<%=request.getAttribute("color")%>"> <%=request.getAttribute("message")==null?"": request.getAttribute("message")%></p>
	<form action = "login" method = "post">
		<label>User Name</label>
		<input type = "text" name = "userName"/>
		<label>Password</label>
		<input type = "text" name = "password"/>
		<input style = "color:white;background-color:green" type="submit" value = "submit"/>
	</form>
	<form action = "register.jsp" method = "post">
		<label>Need an account?</label>
		<input style = "color:white;background-color:green" type="submit" value = "Register"/>
	</form>
</body>
</html>