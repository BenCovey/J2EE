<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome ${user.getName()}</title>
<link href="https://fonts.googleapis.com/css?family=Indie+Flower" rel="stylesheet">
<style>
html {
	font-family: 'Indie Flower', cursive;
}
.container {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 97vh;
}
</style>
</head>
<body>
<div class="container">
<h1 style="color: ${a};">${pageContext.exception.localizedMessage}. You are only ${user.getAge()} years old.</h1>
</div>
</body>
<footer>

</footer>
</html>