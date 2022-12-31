<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bill</title>
</head>
<body>
<table>
<tr>
<th>firstName</th>
<th>lastName</th>
<th>email</th>
<th>mobile</th>
<th>product Name</th>
<th>quantity</th>
<th>amount</th>
</tr>
<c:forEach var ="bill" items="${bill}">
<tr>
<td>${bill.firstName }</td>
<td>${bill.lastName }</td>
<td>${bill.email }</td>
<td>${bill.mobile }</td>
<td>${bill.product }</td>
<td>${bill.quantity }</td>
<td>${bill.amount }</td>
</tr>

</c:forEach>

</table>
</body>
</html>