package com.EmployeeManagement_System.EmployeeManagementSystem.service;

import java.util.List;

import com.EmployeeManagement_System.EmployeeManagementSystem.models.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	public void removeEmployee(Integer id);
	
	public Employee getEmployee(Integer id);
	
	public List<Employee> getAllEmployees();
	
	public Employee editEmployee(Employee employee,Integer id);
}
