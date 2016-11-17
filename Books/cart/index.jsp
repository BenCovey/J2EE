<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books</title>
</head>
<body>
	<h1>Books requested</h1>
	<p>The user wants <%=request.getAttribute("books")==null?"0": request.getAttribute("books")%> books</p>
	
	<form action = "cart" method = "GET">
		<label>How many books would you like</label>
		<input type = "text" name = "books" id = "books"/>
		<input type = "submit"/>
	</form>
</body>
</html>