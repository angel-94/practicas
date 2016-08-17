package com.unsis.clinic.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import com.unsis.clinic.dao.UserDao;
import com.unsis.clinic.model.User;

//@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserDao userDao;

	@Override
	public void insertUser(User user) {
		logger.info("En el service insertUser");
		userDao.insertUser(user);
	}

	@Override
	public List<User> getAllUser() {
		logger.info("En el service getAllUser");
		return userDao.getAllUser();
	}

	@Override
	public void updateUser(User user) {
		logger.info("En el service updateUser");
		userDao.updateUser(user);
	}

	@Override
	public void deleteUser(int id) {
		logger.info("En el service deleteUser");
		userDao.deleteUser(id);
	}

	@Override
	public User getUserById(int id) {
		logger.info("En el service getUserById");
		return userDao.getUserById(id);
	}

	@Override
	public User getLogin(String userName, String password){
		logger.info("En el service getLogin");
		logger.info(userName);
		logger.info(password);
		return userDao.getLogin(userName, password);
	}

}
