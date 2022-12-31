<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
<h1>create | Lead</h1>
<pre>

<form action="saveLead",method="post">
<pre>
firstName<input type ="text" name="firstName"/>
lastName<input type ="text" name="lastName"/>
email<input type ="text" name="email"/>
mobile<input type ="text" name="mobile"/>
source<input type ="text" name="source"/>
<input type="submit" value ="save"/>

</pre>
</form>

${msg }

</body>
</html>