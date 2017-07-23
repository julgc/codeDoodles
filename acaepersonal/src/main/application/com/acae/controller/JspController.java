package com.acae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JspController {

	@RequestMapping(value = "${com.acae.controller.jsplocation}/{path1}",method=RequestMethod.GET)
	public String mapToJsp(@PathVariable("path1") String path1) {
		return "/"+path1;
	}
	
	@RequestMapping(value = "${com.acae.controller.jsplocation}/{path1}/{path2}",method=RequestMethod.GET)
	public String mapToJsp(@PathVariable("path1") String path1, @PathVariable("path2") String path2) {
			return "/"+path1+"/"+path2;
	}	
}
