package com.unsis.clinic.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.unsis.clinic.dao.UserDao;
import com.unsis.clinic.model.User;

public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserDao userDao;

	@Override
	public void insertUser(User user) {
		logger.info("Inserta usario -- class => UserServiceImpl");
		userDao.insertUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public void updateUser(int id) {
		userDao.updateUser(id);
	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

}
