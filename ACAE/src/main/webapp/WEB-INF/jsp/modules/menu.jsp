<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
</head>
<body>
	<div id="pan-container" class="container-fluid">
		<table cellpadding="0" cellspacing="0">
			<tr>
				<td>
					<div class="col-md-12" id="menu">
					<c:if test="${not empty userProfile}">
						<ul class="menu">
							<li><span data-href="/modules/home" role="tab" data-toggle="tab">Home</span></li>
							<c:if test='${userProfile.role eq "USER"}'>
								<li><span data-href="/modules/acaecurrent" role="tab" data-toggle="tab">Current</span></li>
								<li><span data-href="/modules/acaehistorical" role="tab" data-toggle="tab">Historical</span></li>
								<li><span data-href="/modules/acaesummary" role="tab" data-toggle="tab">Summary</span></li>
								<li><span data-href="/modules/userprofile" role="tab" data-toggle="tab">User Profile</span></li>
							</c:if>
							<c:if test='${userProfile.role eq "ADMIN"}'>
								<li><span data-href="/modules/usermanager" role="tab" data-toggle="tab">User Manager</span></li>
								<li><span data-href="/modules/acaeall" role="tab" data-toggle="tab">View All</span></li>
							</c:if>
							<li><span data-href="/modules/logout" role="tab" data-toggle="tab">Logout</span></li>
						</ul>
						</c:if>
					</div>
				</td>
			</tr>
		</table>
	</div>
	<div id="content" class="container"></div>

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
