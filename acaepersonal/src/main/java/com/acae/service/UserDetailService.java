package com.acae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acae.model.UserDetail;
import com.acae.repository.UserDetailRepository;


@Service
public class UserDetailService {
	@Autowired
	UserDetailRepository repo;

	public UserDetail findUserDetailById() {
		return repo.findUserDetailById(1);
	}

	public void addUserDetail(UserDetail userdetail) {
		repo.save(userdetail);
	}

	public void updateUserDetail(UserDetail userdetail) {
		repo.save(userdetail);
	}
}
