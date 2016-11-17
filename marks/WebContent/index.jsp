<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String value = request.getParameter("id");
if(value!=null && value.trim().length()>0){
	if(checkMe(value)){
		request.getRequestDispatcher("jsps/welcome.jsp").forward(request, response);
	}
}
%>
	<h1>Welcome to NSCC Training</h1>
	<h2 style = "text-decoration:underline"> User Info </h2><%=new Date() %>
	<p><span style = "color:blue">port:</span><%=request.getProtocol() %></p>
	<p><span style = "color:blue">Http method:</span><%=((HttpServletRequest)request).getMethod()%></p>
	<%! boolean checkMe(String a){
		boolean result = false;
		String[] members = {"w0000", "w1111", "w2222"};
		for(String member: members){
			if(member.equals(a.toLowerCase())){
				result = true;
				break;
			}
		}
		return result;
	}
	%>
</body>
</html>