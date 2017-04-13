package com.acae.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


	@RequestMapping("/frontendresource")
	public String frontendresource() {
		return "frontendresource";
	}

	@RequestMapping("/")
	public String index() {
		return "/index";
	}

	@RequestMapping("/menu/{url}")
	public String menuSelector(@PathVariable String url) {
		return "/menu/"+url;
	}
	
}
