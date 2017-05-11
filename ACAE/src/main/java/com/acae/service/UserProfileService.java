package com.acae.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acae.entity.UserProfile;
import com.acae.repositories.UserProfileRepository;

@Service
public class UserProfileService {
	@Autowired
	private UserProfileRepository repo;
	
	public void updateUserProfile(UserProfile userProfile, HttpSession session){
		
		UserProfile userFromSession=(UserProfile) session.getAttribute("userProfile");
		
		userProfile.setId(userFromSession.getId());
		userProfile.setRole(userFromSession.getRole());
		userProfile.setPassword(userFromSession.getPassword());
		
		UserProfile savedUserProfile = (UserProfile)repo.save(userProfile);
		session.setAttribute("userProfile", savedUserProfile);
		session.setAttribute("message", "User has been updated");
	}
	
}
