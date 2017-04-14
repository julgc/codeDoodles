<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="/frontendresource" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Page</title>
</head>
<body id="mainBody">
	<div id="contentIncludingMenu" class="container-fluid">
		<c:if test="${not empty userProfile}">
			<h2>ACAE Manager</h2>
			<span data-href="/menu/home">Home|</span>
			<c:if test="${role eq 'USER'}">
				<span data-href="/menu/acaecurrent">Current|</span>
				<span data-href="/menu/acaehistorical">Historical|</span>
				<span data-href="/menu/acaesummary">Summary|</span>
				<span data-href="/menu/userprofile">User Profile|</span>
			</c:if>
			<c:if test="${role eq 'ADMIN'}">
				<span data-href="/menu/usermanager">User Manager|</span>
				<span data-href="/menu/acaeall">View All|</span>
			</c:if>
			<span data-href="/menu/logout">Logout</span>
			<div id="content"></div>
		</c:if>
	</div>
</body>
<script type="text/javascript">
	$(document).ready(
			function() {
				determineInitialPage();

				$("[data-href]").click(
						function() {
							var url = $(this).attr("data-href");
							if (!(url === "/menu/logout")) {
								execAjaxMenuCall(url, null, "GET", "content",
										null);
							} else {
								execAjaxMenuCall(url, null, "GET",
										"contentIncludingMenu", null);
							}
						});
			});
	//selects whether home or login page
	function determineInitialPage() {
		if (!("${role}" === "")) {
			execAjaxMenuCall("/menu/home", null, "GET", "content", null);
		}  else {
			execAjaxMenuCall("/menu/login", null, "GET",
					"contentIncludingMenu", null);
		}
	}

	/*
	 *ajax call pUrl->the url; pform->form to submit;
	 *target->id of target tag cointainer;
	 *callback->function() to call after ajax success
	 */
	function execAjaxMenuCall(pUrl, pform, pReqtype, target, callback) {
		var vData;
		try {
			vData = pform.serialize();
		} catch (err) {
			vData = null;
		}
		$.ajax({
			url : pUrl,
			success : function(result) {
				if (target != null) {
					$("#" + target).html(result);
				}
				if (callback != null) {
					callback();
				}
			},
			error : (function(jqXHR, textStatus, thrownError) {
				$("#" + target).html("Error " + jqXHR.status);
			}),
			data : vData,
			type : pReqtype
		});
	}
</script>
</html>