<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<c:if test="${not empty errorMessage}">
		<h2>${errorMessage}</h2>
	</c:if>
	<c:remove var="errorMessage" scope="session" />
	<form id="loginForm">
		<p>
			User:<input type="text" name="userId" />
		<p>
			Pass:<input type="password" name="password" />
			<br/>
			<input class="btn btn-default" type="submit" value="SUBMIT"/>
	</form>
</body>
<script type="text/javascript">
	$(document).ready(function() {
		$("#loginForm").submit(function(){
			execAjaxMenuCall("/loginaction", $(this), "POST","page",null);
			return false;
		});
	});	
</script>
</html>
