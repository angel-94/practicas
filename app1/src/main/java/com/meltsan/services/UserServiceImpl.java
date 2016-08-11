package com.meltsan.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.meltsan.controller.HomeController;
import com.meltsan.dao.UserDao;
import com.meltsan.domain.User;

public class UserServiceImpl  implements UserService{
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	 UserDao userdao;
	
	@Override
	public void insertData(User user) {
		// TODO Auto-generated method stub
		logger.info("insert data: dcsfd");
		userdao.insertData(user);
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		logger.info("Lista de usuarios");
		return userdao.getUserList();
	}

	@Override
	public void deleteData(String id) {
		// TODO Auto-generated method stub
		logger.info("Eliminar usuario");
		userdao.deleteData(id);
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		logger.info("obteer usuario por su id");
		return userdao.getUser(id);
	}

	@Override
	public void updateData(User user) {
		// TODO Auto-generated method stub
		logger.info("Editar los datos de un usuario");
		userdao.updateData(user);
	}

}
