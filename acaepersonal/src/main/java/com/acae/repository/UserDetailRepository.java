package com.acae.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.acae.model.UserDetail;

@Component
public interface UserDetailRepository extends
		JpaRepository<UserDetail, Serializable> {
	UserDetail findUserDetailById(int id);
}
