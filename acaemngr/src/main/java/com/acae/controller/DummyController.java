package com.acae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DummyController {
	@RequestMapping("/{url}")
	public String redir(@PathVariable String url,ModelMap model) {
		model.put("variableFromController", "Value from Controller");
		return url;
	}
}
