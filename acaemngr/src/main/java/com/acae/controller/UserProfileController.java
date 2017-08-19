package com.acae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acae.model.UserInfo;
import com.acae.services.UserInfoService;

@Controller
public class UserProfileController {
	private static final int USER_ID = 1;
	@Autowired
	UserInfoService service;

	@RequestMapping(value = "/userprofilesave", method = RequestMethod.POST)
	public String saveUser(UserInfo userInfo, ModelMap model) {
		userInfo.setId(1);
		service.saveUserInfo(userInfo);
		return "/userprofile";
	}

	@RequestMapping("/userprofile")
	public String userPofile(ModelMap model) {
		UserInfo dbUserInfo = service.findUserInfoById(USER_ID);
		model.put("userInfo", dbUserInfo);
		return "/userprofile";
	}

}