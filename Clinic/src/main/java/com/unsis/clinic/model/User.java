package com.unsis.clinic.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	@Size(min=2, max=30)
	private int userId;
	private int identityCard;
	@NotNull
	private String userName;
	@NotNull
	private String password;
	private char statusSession;

	public User() {
		super();
	}

	public User(int userId, int identityCard, String userName, String password, char statusSession) {
		super();
		this.userId = userId;
		this.identityCard = identityCard;
		this.userName = userName;
		this.password = password;
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

	public char getStatusSession() {
		return statusSession;
	}

	public void setStatusSession(char statusSession) {
		this.statusSession = statusSession;
	}

}
