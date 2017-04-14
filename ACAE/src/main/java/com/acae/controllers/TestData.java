package com.acae.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acae.entity.UserProfile;
import com.acae.repositories.UserProfileRepository;
//TODO delete this class for testing only
@Component
public class TestData {

	@Autowired
	UserProfileRepository userRepo;
	
	public void createTestUsers(){
		if(userRepo.findAll().isEmpty()){
		List<UserProfile> users = new ArrayList<UserProfile>(
				Arrays.asList(new UserProfile[] {
						new UserProfile("user1", "password", "USER"),
						new UserProfile("admin1", "password", "ADMIN"), }));
		userRepo.save(users);
		}
	}
}
