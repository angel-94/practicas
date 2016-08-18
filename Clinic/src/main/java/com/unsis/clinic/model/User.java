package com.unsis.clinic.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	@Size(min = 2, max = 30)
	private int userId;
	@Size(min = 7, max = 7)
	private int identityCard;
	@NotNull
	private String userName;
	@NotNull
	private String password;
	private String roleUser;

	private String statusSession;

	public User() {
		super();
	}

	public User(int userId, int identityCard, String userName, String password, String roleUser, String statusSession) {
		super();
		this.userId = userId;
		this.identityCard = identityCard;
		this.userName = userName;
		this.password = password;
		this.roleUser = roleUser;
		this.statusSession = statusSession;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(int identityCard) {
		this.identityCard = identityCard;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleUser() {
		return roleUser;
	}

	public void setRoleUser(String roleUser) {
		this.roleUser = roleUser;
	}

	public String getStatusSession() {
		return statusSession;
	}

	public void setStatusSession(String statusSession) {
		this.statusSession = statusSession;
	}

}
