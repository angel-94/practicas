package com.unsis.clinic.model;

public class User {
	private int userId;
	private String userName;
	private String password;
	private char statusSession;

	public User() {
		super();
	}

	public User(int userId, String userName, String password, char statusSession) {
		super();
		this.userId = userId;
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
