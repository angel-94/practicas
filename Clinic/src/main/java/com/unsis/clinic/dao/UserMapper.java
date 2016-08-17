package com.unsis.clinic.dao;

import com.unsis.clinic.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {
	
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUserId(rs.getInt("UserId"));
		user.setIdentityCard(rs.getInt("IdentityCard"));
		user.setUserName(rs.getString("UserName"));
		user.setPassword(rs.getString("Password"));
		user.setStatusSession(rs.getString("StatusSession").charAt(rowNum));
		return user;
	}
}
