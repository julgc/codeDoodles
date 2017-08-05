$(document).ready(function() {
	$("#recordEditorDiv").hide();

	$("[class=editIcon]").click(function() {
		transitionToEdit($(this));
	});

	$("#addNewRecord").click(function() {
		transitionToEdit(null);
	});
});

function transitionToEdit(obj) {
	callback = function() {
		$(".shadowedAcaeForMonthDiv").fadeOut("slow", function() {
			$("#recordEditorDiv").fadeIn("slow");
		});
	}

	var vUrl = "/acaeformontheditor.html";
	if (obj != null) {
		vUrl += "?id=" + obj.attr("data-id");
	}

	ajaxActionGetLoader($("#recordEditorDiv"), vUrl, callback);
}