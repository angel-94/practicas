package com.unsis.clinic.service;

import java.util.List;

import com.unsis.clinic.model.Employee;

public interface EmployeeService {
	
	void insertEmployee(Employee employee);

	List<Employee> getAllEmployee();

	void updateEmployee(Employee employee);

	void deleteEmployee(int id);

	Employee getEmployeeById(int id);
}
