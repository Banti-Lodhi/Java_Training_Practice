<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>second file system</title>
</head>
<body>
<%
String name = (String)pageContext.getAttribute("user", PageContext.SESSION_SCOPE);
out.println("Hello "+name);
%>
</body>
</html>