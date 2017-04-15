package com.acae.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acae.entity.UserProfile;
import com.acae.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;


	@RequestMapping(value = "/loginaction", method = RequestMethod.POST)
	public String loginAction(UserProfile user, HttpSession session) {

		UserProfile userProfile = loginService.getUserProfile(user.getUserId(),
				user.getPassword());
		if (userProfile != null) {
			session.setAttribute("userProfile", userProfile);
			return "/index";
		} else {
			session.setAttribute("errorMessage", "Wrong User ID or Password");
			return "/menu/login";
		}
	}

	@RequestMapping("/menu/logout")
	public String logoutAction(UserProfile user, HttpSession session) {
		session.removeAttribute("userProfile");
		session.setAttribute("errorMessage", "Logout sucessful");
		return "/menu/login";
	}
}
