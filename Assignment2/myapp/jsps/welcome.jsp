<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome <%=request.getAttribute("user") %></h1>
	<form action = "/myapp" method = "POST">
		<input type = "submit" value = "Logoff">
	</form>
</body>
</html>