<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<div class="container-fluid">
		<form id="userProfileForm">
			<c:if test="${not empty errorMessage}">
				<h2>${errorMessage}</h2>
			</c:if>
			<c:remove var="message" scope="session" />
			<h2>User Profile for ${userProfile.userId}</h2>
			<table>
				<tr>
					<th>User ID:</th>
					<td><input type="text" name="userId"
						value="${userProfile.userId}" /></td>
				</tr>
				<tr>
					<th>First Name:</th>
					<td><input type="text" name="firstName"
						value="${userProfile.firstName}" /></td>
				</tr>
				<tr>
					<th>Last Name:</th>
					<td><input type="text" name="lastName"
						value="${userProfile.lastName}" /></td>
				</tr>
				<tr>
					<th>Team:</th>
					<td><input type="text" name="team" value="${userProfile.team}" /></td>
				</tr>
			</table>
			<a href="#" id="changePW">change password</a><br /> <input
				type="submit" value="Submit" />
		</form>
	</div>
</body>
<script type="text/javascript">
	$(document).ready(
			function() {
				$("#userProfileForm").submit(
						function() {
							execAjaxMenuCall(
									"/modules/userprofile/userupdateaction",
									$(this), "POST", "content", null);
							return false;
						});
				
				$("#changePW").click(
						function() {
							execAjaxMenuCall(
									"/modules/userprofile/changepassword",
									$(this), "GET", "content", null);
							return false;
						});
				
			});
</script>
</html>