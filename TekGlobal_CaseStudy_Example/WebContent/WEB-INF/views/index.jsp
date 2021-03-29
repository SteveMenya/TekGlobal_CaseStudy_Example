<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
	<spring:url value="/resources/css/casestudy.css" var="mainCss"></spring:url>
	<link href="${mainCss}" rel="stylesheet" />
</head>
<body>
	<h1>Index Page</h1>
	<%@ include file="navigation_bar.html" %>
</body>
</html>