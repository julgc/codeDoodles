package com.acae.entity;

import org.springframework.stereotype.Component;

@Component
public class UserProfile {
	private String userid;
	private String password;
	private String role;
	private String firstName;
	private String lastName;
	private String team;

	public UserProfile(){}
	public UserProfile(String userid, String password,String role) {
		super();
		this.userid = userid;
		this.password = password;
		this.role=role;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
}
