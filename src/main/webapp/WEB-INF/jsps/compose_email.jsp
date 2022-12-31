<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose email</title>
</head>
<body>
<h1>Compose email</h1>
<form action="compose" method="post">
<pre>
To<input type="text" name="to" value="${eml}"/>
Subject<input type ="text" name="sub"/>
Text
<textarea  name="msg" rows="4" cols="50">

</textarea>
<input type="submit" value="Send"/>

</pre>
</form>
${mms }
</body>
</html>