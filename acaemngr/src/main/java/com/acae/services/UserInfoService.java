package com.acae.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acae.model.UserInfo;
import com.acae.repository.UserInfoRepository;

@Service
public class UserInfoService {
	@Autowired
	UserInfoRepository repo;

	public UserInfo findUserInfoById(int id) {
		UserInfo userInfo = repo.findUserInfoById(id);
		if (userInfo == null) {
			userInfo = new UserInfo(true);
			repo.save(userInfo);
		}
		return userInfo;
	}

	public void saveUserInfo(UserInfo userInfo) {
		repo.save(userInfo);
	}
}
