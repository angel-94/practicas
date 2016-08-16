package com.unsis.clinic.dao;

import java.util.List;

import javax.sql.DataSource;

import com.unsis.clinic.model.Employee;

public interface EmployeeDao {
	
	void setDataSource(DataSource dataSource);

	void insertEmployee(Employee employee);

	List<Employee> getAllEmployee();

	void updateEmployee(Employee employee);

	void deleteEmployee(int id);

	Employee getEmployeeById(int id);
	
}
