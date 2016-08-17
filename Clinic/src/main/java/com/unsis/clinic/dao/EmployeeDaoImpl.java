package com.unsis.clinic.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.unsis.clinic.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void insertEmployee(Employee employee) {
		String query = "";
		jdbcTemplate.update(query);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return null;
	}

	@Override
	public void updateEmployee(Employee employee) {
		
	}

	@Override
	public void deleteEmployee(int id) {
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		return null;
	}

}
