$(document).ready(function() {
	execAjaxMenuCall("menu/login.html");

	$("#menu th").click(function() {
		if ($(this).attr("id") == "homeMenu") {
			alert("TODO\n login page if no session,\n else home page!!");
			execAjaxMenuCall("menu/login.html");
		}
		else if ($(this).attr("id") == "acaeInputMenu") {
			execAjaxMenuCall("menu/acaeInput.html");
		}
		else if ($(this).attr("id") == "monthlyMenu") {
			execAjaxMenuCall("menu/monthly.html");
		}
		else if ($(this).attr("id") == "summaryMenu") {
			execAjaxMenuCall("menu/summary.html");
		} else {
			isLogout = confirm("Are you sure you want to logout?");
			if (isLogout) {
				alert("TODO logout logic here");
				execAjaxMenuCall("menu/login.html");
			}
		}
	});
});

function execAjaxMenuCall(pUrl, pData) {
	var request = $.ajax({
		url : pUrl,
		success : function(result) {
			$("#content").html(result);
		},
		data : pData,
		type : "POST"
	});
	request.fail(function(jqXHR, textStatus,thrownError) {
		$("#content").html(thrownError);
	});
}
