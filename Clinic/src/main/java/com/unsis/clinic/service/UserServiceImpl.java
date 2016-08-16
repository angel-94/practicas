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
		logger.info("Inserta usario -- class => UserServiceImpl");
		userDao.insertUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	@Override
	public User getLogin(String name, String password){
		return userDao.getLogin(name, password);
	}

}
