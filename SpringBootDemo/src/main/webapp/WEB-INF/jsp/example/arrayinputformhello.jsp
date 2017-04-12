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
	<form action="arrayinputformhello">
		<p>
			First Name:<input type="text" name="users[1].firstName" />
		</p>
		<p>
			Last Name:<input type="text" name="users[1].lastName" />
		</p>
		<p>
			Age:<input type="text" name="users[1].age">
		</p>
		<br />
		<p>
			First Name:<input type="text" name="users[2].firstName" />
		</p>
		<p>
			Last Name:<input type="text" name="users[2].lastName" />
		</p>
		<p>
			Age:<input type="text" name="users[2].age">
		</p>
		<br />
		<input type="submit" />
	</form>
	<c:forEach items="${users.users}" var="user">
		<c:if test="${not empty user.firstName}">
			<h2>Hello User</h2>
			<p>first name: ${user.firstName}
			<p>last name: ${user.lastName}
			<p>age: ${user.age}
		</c:if>
	</c:forEach>
</body>
</html>