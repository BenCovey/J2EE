<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log in</title>
</head>
<body>
	<h1>Login Page</h1>
	<p style= "color:<%=request.getAttribute("color")%>"> <%=request.getAttribute("message")==null?"": request.getAttribute("message")%></p>
	<form action = "login" method = "post"><br/>
		<label>User Name</label><br/>
		<input type = "text" name = "userName"/><br/>
		<label>Password</label><br/>
		<input type = "text" name = "password"/><br/>
		<input style = "color:white;background-color:green" type="submit" value = "submit"/>
	</form>
	<form action = "register.jsp" method = "post">
		<label>Need an account?</label><br/>
		<input style = "color:white;background-color:green" type="submit" value = "Register"/>
	</form>
	<footer style="width:1000px ; border-top:2px solid black; position: fixed; left:0px;bottom:0px;">
	
	<jsp:include page="jsps/components/footer.jsp"/>
	
	</footer>
</body>
</html>