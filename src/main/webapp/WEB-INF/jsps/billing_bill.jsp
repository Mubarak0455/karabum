<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>generate Bill</title>
</head>
<body>
<h1>Generate | bill</h1>
<pre>

<form action="saveBill",method="post">
<pre>
firstName<input type ="text" name="firstName" value="${contact.firstName }"/>
lastName<input type ="text" name="lastName"value="${contact.lastName }"/>
email<input type ="text" name="email"value="${contact.email }"/>
mobile<input type ="text" name="mobile"value="${contact.mobile }"/>
product Name<input type="text" name="product"/>
quantity<input type="text" name="quantity"/>
amount<input type="text" name="amount"/>
<input type="submit" value ="saveBill"/>

</pre>
</form>

${msg }

</body>
</html>