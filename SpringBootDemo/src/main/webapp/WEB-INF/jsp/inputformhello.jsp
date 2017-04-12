<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Input form</title>
</head>
<body style="text-align: center">
	<form action="inputformhello">
		<p>
			First Name:<input type="text" name="firstName" />
		<p>
			Last Name:<input type="text" name="lastName" />
		<p>
			Age:<input type="text" name="age"><br /> <input
				type="submit" />
	</form>
	<c:if test="${not empty user.firstName}">
		<h2>Hello</h2>
		<p>first name: ${user.firstName}
		<p>last name: ${user.lastName}
		<p>age: ${user.age}
	</c:if>
</body>
</html>