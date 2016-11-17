<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Translator</title>
</head>
<body>
	<h1>Translate from English to Russian or French</h1>
	<h3>Only words available for translating are as follows:</h3>
	<h3>translating, is, easy, as, pie, see, even, I, could, do, it</h3>
	<form method = "GET" action = "translate">
		<label>Enter a phrase to be translated</label><br/>
		<input type = "text" value = "" id = "phrase" name = "phrase"/><br/>
		<label>Translate to:</label><br/>
		<select name = "lang">
			<option value = "French">French</option>
			<option value = "Russian">Russian</option>
		</select><br/>
		<input type = "submit" name = "submit" value = "Translate"/>
	</form>
	<%
    String translated = request.getParameter( "translated" );
	String unfound = request.getParameter("unfound");
    if ( translated == null )
    {
%>
    <p></p>
<%
    }
    else
    {
%>
    <p>The translated phrase is:  <%= translated.toString() %>.</p>
<%
    }
    if ( unfound == null )
    {
%>
	<p></p>
<%
	}
	else
	{
%>
	<p>Unfound translations for word(s): <%= unfound.toString() %>
<%
	}
%>
</body>
</html>