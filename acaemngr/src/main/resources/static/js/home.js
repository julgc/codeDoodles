$(document).ready(function() {

	//hide tab content
	$(".content").hide();

	//Tab behaviour
	$(".menu input").click(function() {
		//tab color
		$(".menu input").css("background-color", "#ff6666");
		$(this).css("background-color", "#ff0000");

		//tab visibility
		$(".content").hide();
		$("#" + $(this).attr("data-tab")).show();

		//tabcontent
		//loadTab($("#userInfo"));
	});

	loadTab($("#userInfo"));
	loadTab($("#acaeForMonth"));
	loadTab($("#monthlySummary"));

	//show initial tab (user info)
	$("#userInfo").show();
	$("[data-tab=userInfo]").css("background-color", "#ff0000");

});

function loadTab(tabContainer) {
	var vUrl = "";

	switch (tabContainer.attr("id")) {
	case "userInfo":
		vUrl = "/userprofile.html";
		break;
	case "acaeForMonth":
		vUrl = "/acaeformonth.html";
		break;
	case "monthlySummary":
		vUrl = "/monthlysummary.html";
		break;
	default:
		vUrl = "/userprofile.html";
	}

	$.ajax({
		url : vUrl,
		async : false,
		success : function(result) {
			tabContainer.html(result);
		}
	});
}

function ajaxActionGetLoader(container,vUrl,callback){
	$.ajax({
		url : vUrl,
		async : false,
		success : function(result) {
			container.html(result);
			callback();
		}
	});
}