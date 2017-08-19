package com.acae.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	int id;
	String userName;
	String team;
	int salary;

	public UserInfo() {
	}

	public UserInfo(boolean isDefault) {
		if (isDefault) {
			this.id = 1;
			this.userName = "Sample User";
			this.team = "Sample Team Data";
			this.salary = 50000;
		} else {
			return;
		}
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public String getTeam() {
		return team;
	}

	public String getUserName() {
		return userName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
