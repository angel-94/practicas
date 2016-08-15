package com.unsis.clinic.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;

import com.unsis.clinic.model.User;

//@Repository
public class UserDaoImpl implements UserDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void insertUser(User user) {
		System.out.println(dataSource);
		String query = "INSERT INTO USER (UserName, Password, StatusSession) VALUES(?, ?, ?, ?);";
		jdbcTemplate.update(query, user.getUserName(), user.getPassword(), user.getStatusSession());
		logger.info("Datos insertados exitosamente :: metodo insertUser en el DAO");
	}

	@Override
	public List<User> getAllUser() {
		List<User> userList = new ArrayList<User>();
		String query = "SELECT * FROM USERS;";
		userList = jdbcTemplate.query(query, new UserMapper());
		return userList;
	}

	@Override
	public void updateUser(User user) {
		String query = "UPDATE USER SET UserName = ?, Password = ?, StatusSession = ? WHERE UserId = ?;";
		jdbcTemplate.update(query, user.getUserName(), user.getPassword(), user.getStatusSession(),user.getUserId());
	}

	@Override
	public void deleteUser(int id) {
		String query = "DELETE FROM USERS WHERE UserId = ?;";
		jdbcTemplate.update(query, id);
	}

	@Override
	public User getUserById(int id) {
		String query = "SELECT * FROM USERS WHERE UserId = ?;";
		User user = (User) jdbcTemplate.query(query, new Object[]{id}, new UserMapper());
		return user;
	}

	@Override
	public User getLogin(String name, String password) {
		User userLogin = new User();
		logger.info("nombre en el dao: ", name);
		String query = "SELECT * FROM USERS WHERE UserName = ? and Password = ?;";
		userLogin = (User) jdbcTemplate.query(query, new Object[]{name, password}, new UserMapper());
		return userLogin;
	}
	
}
