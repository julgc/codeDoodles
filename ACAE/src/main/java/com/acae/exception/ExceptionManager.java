package com.acae.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionManager {
	//TODO remove this for debugging only
	@ExceptionHandler(Exception.class)
	public ModelAndView exception(Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("error",ex.getStackTrace());
		return mv;
	}
}
