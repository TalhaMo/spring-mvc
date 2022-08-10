<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user Info</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/files/css/style.css"/>
</head>
<body>
Name: ${user.name}
<p>
Gender : ${user.gender }
</p>
Country: ${user.country}
<p/>
Introduction: ${user.introduction }
<p/>

<c:forEach items="${user.visitedCountry}" var="item">
<li>
${item}
</li>
</c:forEach>

</body>
</html>