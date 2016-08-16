package com.unsis.clinic.service;

import java.util.List;

import com.unsis.clinic.model.User;

public interface UserService {
	
	void insertUser(User user);

	List<User> getAllUser();

	void updateUser(User user);

	void deleteUser(int id);

	User getUserById(int id);
	
	User getLogin(String name, String password);
}
