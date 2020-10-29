package com.springboot.service;

import java.util.List;

import com.springboot.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
}
