package com.acae.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
	//TODO remove datas field for testing only
	@Autowired
	private TestData datas;

	@RequestMapping("/")
	public String index() {
		datas.createTestUsers();//TODO remove this
		return "/index";
	}
	
	@RequestMapping("/modules")
	public String main() {
		return "/modules/menu";
	}	

	@RequestMapping("/modules/{url}")
	public String menuSelector(@PathVariable String url) {
		return "/modules/"+url;
	}
	
}
