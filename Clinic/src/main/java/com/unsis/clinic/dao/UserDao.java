package com.unsis.clinic.dao;

import java.util.List;

import javax.sql.DataSource;

import com.unsis.clinic.model.User;

public interface UserDao {
	void setDataSource(DataSource dataSource);

	void insertUser(User user);

	List<User> getAllUser();

	void updateUser(int id);

	void deleteUser(int id);

	User getUserById(int id);
}
