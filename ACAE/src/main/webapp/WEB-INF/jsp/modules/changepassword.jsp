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
	<form action="/modules/userprofile/changepasswordaction" id="changePW">
		<table>
			<tr>
				<th>Current Password:</th>
				<td><input type="password"></td>
			</tr>
			<tr>
				<th>New Password:</th>
				<td><input type="password"></td>
			</tr>
			<tr>
				<th>New Password:</th>
				<td><input type="password"></td>
			</tr>
		</table>
		</form>
		<input type="submit" value="submit" />
	</div>
</body>
<script type="text/javascript">
	$(document).ready(
			function() {
				$("#changePW").submit(
						function() {
							execAjaxMenuCall(
									"/modules/userprofile/changepasswordaction",
									$(this), "POST", "content", null);
							return false;
						});
				
			});
</script>
</html>