<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Name</title>
</head>
<body> 
Today is : ${date }<br/>
hello ${name }<br/>
the list of the team :
<c:forEach var="temp" items="${team }">
<br/>${temp}
</c:forEach>
</body>
</html>