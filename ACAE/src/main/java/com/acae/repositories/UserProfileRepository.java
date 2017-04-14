package com.acae.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.acae.entity.UserProfile;
@Component
public interface UserProfileRepository extends
		JpaRepository<UserProfile, Serializable> {
	UserProfile findByUserIdAndPassword(String userid, String password);

}
