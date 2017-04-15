<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%-- <jsp:include page="frontendresource" /> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/common.css">
<script src="/bootstrap/js/jquery-3.2.1.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<title>Index Page</title>
</head>
<body id="mainBody">
	<header class="bgimage">
	<div id="header" class="container-fluid" />
	</header>
	<div id="page" class="container-fluid"></div>
</body>
<c:choose>
	<c:when test="${not empty userProfile}">
		<script type="text/javascript">
			function initialPageView() {
				execAjaxMenuCall("/menu", null, "GET", "page", null);
			};
		</script>
	</c:when>
	<c:otherwise>
		<script type="text/javascript">
			function initialPageView() {
				execAjaxMenuCall("/menu/login", null, "GET", "page", null);
			};
		</script>
	</c:otherwise>
</c:choose>
<script type="text/javascript">
	$(document).ready(function() {
		initialPageView();
	});
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
