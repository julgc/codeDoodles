<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h1>${message}</h1>
	<c:forEach items="${messages}" var="messageFromList">
		<h2>
			${messageFromList}
		</h2>
	</c:forEach>
    <a href="parameterizedHello?name=Gino">parameterizedHello?name=Gino</a>

</body>
</html>