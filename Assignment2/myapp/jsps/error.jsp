<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body>
<%!
String label;
public void jspInit(){
	label = getServletConfig().getInitParameter("label");
}
%>
<%=label%><%=exception.getLocalizedMessage()%>
	<footer style="width:1000px ; border-top:2px solid black; position: fixed; left:0px;bottom:0px;">

<%@ include file="components/footer.jsp"%>
</footer>
</body>
</html>