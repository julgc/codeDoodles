package com.acae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DummyController {

	@RequestMapping("/acaeformontheditor")
	public String redir2(ModelMap model) {
		model.put("variableFromController", "Value from Controller");
		return "/acaeformontheditor";
	}

	@RequestMapping("/home")
	public String redir3(ModelMap model) {
		model.put("variableFromController", "Value from Controller");
		return "/home";
	}

	@RequestMapping("/monthlysummary")
	public String redir4(ModelMap model) {
		model.put("variableFromController", "Value from Controller");
		return "/monthlysummary";
	}

}
