package com.acae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acae.entity.UserProfile;
import com.acae.repositories.UserProfileRepository;

@Service
public class LoginService {
@Autowired
	UserProfileRepository repo;
	
	public UserProfile getUserProfile(String userid, String password) {
		final UserProfile userProfile = repo.findByUserIdAndPassword(userid, password);
		return userProfile;
	}
}