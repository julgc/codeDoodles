package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bean.User;
import com.example.bean.Users;

@Controller
public class HelloController {

	private String message = "Hello World";
	private List<String> messages;

	@RequestMapping("/hello")
	public String hello(ModelMap model) {
		model.put("message", this.message);
		messages = new ArrayList<String>();
		messages.add("This is added from controller list");
		messages.add("This is added from controller list too");
		model.put("messages", messages);

		return "example/hello";
	}

	@RequestMapping("/parameterizedhello")
	public String parameterizedHello(
			@RequestParam(name = "name", defaultValue = " Ma'am/Sir") String name,
			ModelMap model) {
		model.put("name", name);
		return "example/parameterizedhello";
	}

	@RequestMapping("/inputformhello")
	public String parameterizedHello(User user, ModelMap model) {
		model.put("user", user);
		return "example/inputformhello";
	}

	@RequestMapping("/arrayinputformhello")
	public String arrayInputFormHello(Users users, ModelMap model) {
		model.put("users", users);
		return "example/arrayinputformhello";
	}
}
