<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
</head>
<body>
	<div class="h2">ACAE Manager</div>
	<div class="row" id="menu">
		<div class="col-md-12">
			<span data-href="/modules/home">Home|</span>
			<c:if test='${userProfile.role eq "USER"}'>
				<span data-href="/modules/acaecurrent">Current|</span>
				<span data-href="/modules/acaehistorical">Historical|</span>
				<span data-href="/modules/acaesummary">Summary|</span>
				<span data-href="/modules/userprofile">User Profile|</span>
			</c:if>
			<c:if test='${userProfile.role eq "ADMIN"}'>
				<span data-href="/modules/usermanager">User Manager|</span>
				<span data-href="/modules/acaeall">View All|</span>
			</c:if>
			<span data-href="/modules/logout">Logout</span>
		</div>
	</div>
	<div id="content"></div>

	<c:choose>
		<c:when test="${not empty userProfile}">
			<script type="text/javascript">
				function initialContentView() {
					execAjaxMenuCall("/modules/home", null, "GET", "content", null);
				};
			</script>
		</c:when>
		<c:otherwise>
			<script type="text/javascript">
				function initialContentView() {
					execAjaxMenuCall("/modules/login", null, "GET", "content",
							null);
				};
			</script>
		</c:otherwise>
	</c:choose>
</body>
<script type="text/javascript">
	$(document).ready(function() {
		initialContentView();
		$("[data-href]").click(function() {
			var url = $(this).attr("data-href");
			if (!(url === "/modules/logout")) {
				execAjaxMenuCall(url, null, "GET", "content", null);
			} else {
				execAjaxMenuCall(url, null, "GET", "page", null);
			}
		});
	});
</script>
</html>
