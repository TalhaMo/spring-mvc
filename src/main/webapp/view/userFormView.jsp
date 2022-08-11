<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User form</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/files/css/style.css"/>
</head>
<body>
<h1>Submit your information</h1>
<hr/>
<form:form action="displayUserInfo" modelAttribute="user">
name: 
<form:input path="name" placeholder="enter name" required="true"/>
<form:errors path="name" cssStyle="color:red" />
<p>
Gender: 
<form:radiobuttons path="gender" items="${genderMap }" required="true"/>
</p>
Country: <form:select path="country" items="${countryMap }"/>
		<p/>
		Introduction: <form:textarea path="introduction" required="true"/>
		<p/>
		Visited country: <form:checkbox path="visitedCountry" value="USA" label="united state"/>
						 <form:checkbox path="visitedCountry" value="Germany" label="germany"/>
						 <form:checkbox path="visitedCountry" value="France" label="france"/>
						 <form:checkbox path="visitedCountry" value="Italy" label="italy"/>
						 <p/>
		Accept agreement: <form:checkbox path="" value="accept" required="true"/>
		<p/>
<input type="submit" value="submit"/>
</form:form>

</body>
</html>