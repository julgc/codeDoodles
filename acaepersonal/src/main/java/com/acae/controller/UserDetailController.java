package com.acae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acae.model.UserDetail;
import com.acae.service.UserDetailService;

@RestController
public class UserDetailController {
	@Autowired
	UserDetailService userDetailService;

	@RequestMapping(value = "/acae/user", method = RequestMethod.GET)
	public UserDetail getUser() {
		if (userDetailService.findUserDetailById() == null) {
			userDetailService.addUserDetail(new UserDetail());
		}
		return userDetailService.findUserDetailById();
	}

	@RequestMapping(value = "/acae/user", method = RequestMethod.POST)
	public void updateUser(UserDetail userDetail) {
		userDetail.setId(1);
		userDetailService.updateUserDetail(userDetail);
	}

}
