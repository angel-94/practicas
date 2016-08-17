package com.unsis.clinic.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.unsis.clinic.model.User;

@Transactional
public class UserDaoImpl implements UserDao {
	
	private JdbcTemplate jdbcTemplate;

	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void insertUser(User user) {
		logger.info("En el dao insertUser");
		String query = "INSERT INTO USER (IdentityCard, UserName, Password, StatusSession) VALUES(?, ?, ?, ?, ?);";
		jdbcTemplate.update(query, user.getUserName(), user.getPassword(), user.getStatusSession());
		logger.info("Datos insertados exitosamente :: metodo insertUser en el DAO");
	}

	@Override
	public List<User> getAllUser() {
		logger.info("En el dao getAllUser");
		List<User> userList = new ArrayList<User>();
		String query = "SELECT * FROM USERS;";
		userList = jdbcTemplate.query(query, new UserMapper());
		return userList;
	}

	@Override
	public void updateUser(User user) {
		logger.info("En el dao updateUser");
		String query = "UPDATE USER SET UserName = ?, Password = ?, StatusSession = ? WHERE UserId = ?;";
		jdbcTemplate.update(query, user.getUserName(), user.getPassword(), user.getStatusSession(), user.getUserId());
	}

	@Override
	public void deleteUser(int id) {
		logger.info("En el dao deleteUser");
		String query = "DELETE FROM USERS WHERE UserId = ?;";
		jdbcTemplate.update(query, id);
	}

	@Override
	public User getUserById(int id) {
		logger.info("En el dao getUserById");
		String query = "SELECT * FROM USERS WHERE UserId = ?;";
		User user = jdbcTemplate.queryForObject(query, new Object[]{id}, new UserMapper());
		return user;
	}

	@Override
	public User getLogin(String userName, String password) {
		logger.info("En el dao getLogin");
		BeanPropertyRowMapper<User> bprm = new BeanPropertyRowMapper<User>(User.class);
		User userLogin = new User();
		logger.info(userName);
		logger.info(password);
		String query = "SELECT * FROM USERS WHERE UserName = ? and Password = ?;";
		userLogin = jdbcTemplate.queryForObject(query, new Object[]{userName, password}, bprm);
		logger.info(userLogin.getUserName());
		return userLogin;
	}
	
}
