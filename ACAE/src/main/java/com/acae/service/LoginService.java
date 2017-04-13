package com.acae.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.acae.entity.UserProfile;

@Service
public class LoginService {
	private List<UserProfile> users = new ArrayList<UserProfile>(
			Arrays.asList(new UserProfile[] {
					new UserProfile("user1", "password", "USER"),
					new UserProfile("admin1", "password", "ADMIN"), }));

	public UserProfile getUserProfile(String user, String pw) {

		UserProfile userProfile = users
				.stream()
				.filter(u -> u.getUserid().equals(user)
						&& u.getPassword().equals(pw)).findFirst().get();
		return userProfile;
	}
}