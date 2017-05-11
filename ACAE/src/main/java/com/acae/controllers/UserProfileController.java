package com.acae.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acae.entity.UserProfile;
import com.acae.service.UserProfileService;

@Controller
public class UserProfileController {
	@Autowired
	UserProfileService service;

	@RequestMapping(value = "/modules/userprofile/userupdateaction", method = RequestMethod.POST)
	public String updateUserProfile(UserProfile userProfile, HttpSession session) {
		service.updateUserProfile(userProfile, session);
		session.setAttribute("errorMessage", "User Updated");
		return "modules/userprofile";
	}
	
	@RequestMapping(value = "/modules/userprofile/changepasswordaction", method = RequestMethod.POST)
	public String changePasswordAction(HttpSession session) {
		//TODO
		return "modules/changepassword"; 
	}	
	
	@RequestMapping(value = "/modules/userprofile/changepassword", method = RequestMethod.GET)
	public String updatepassword() {
		return "modules/changepassword";
	}	
}
