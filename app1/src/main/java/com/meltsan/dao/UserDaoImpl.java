package com.meltsan.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.meltsan.controller.HomeController;
import com.meltsan.domain.User;
import com.meltsan.jdbc.UserRowMapper;

public class UserDaoImpl implements UserDao {

	@Autowired
	DataSource dataSource;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Override
	public void insertData(User user) {
		logger.info("Insertamos un usuario dao");
		String query = "INSERT INTO user (first_name, last_name, gender, city) VALUES(?, ?, ?, ?);";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(query,
				new Object[] { user.getFirstName(), user.getLastName(), user.getGender(), user.getCity() });

	}

	@Override
	public List<User> getUserList() {
		logger.info("obtenemos la lista de usuario dao");
		List<User> userList = new ArrayList<User>();
		String query = "SELECT * FROM user;";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		userList = jdbcTemplate.query(query, new UserRowMapper());
		return userList;
	}

	@Override
	public void updateData(User user) {
		logger.info("Actualizamos a un usuario dao");
		String sql = "UPDATE user set first_name = ?, last_name = ?, gender = ?, city = ? WHERE user_id = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//Preparando el jdbc template para realizar la actuaizacion de los datos.
		jdbcTemplate.update(sql, new Object[] { user.getFirstName(), user.getLastName(), user.getGender(),
				user.getCity(), user.getUserId() });
	}

	@Override
	public void deleteData(String id) {
		logger.info("Eliminamos a un usuario dao");
		String sql = "DELETE FROM user WHERE user_id = " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);
	}

	@Override
	public User getUser(String id) {
		logger.info("Obtenemos un usuario por su id dao");
		List<User> userList = new ArrayList<User>();
		String sql = "SELECT * FROM user WHERE user_id= " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		userList = jdbcTemplate.query(sql, new UserRowMapper());
		return userList.get(0);
	}

}
