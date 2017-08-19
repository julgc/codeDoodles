package com.acae.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import com.acae.model.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Serializable> {
	UserInfo findUserInfoById(int id);
}
