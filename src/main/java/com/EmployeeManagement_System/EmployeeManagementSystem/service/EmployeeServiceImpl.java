package com.EmployeeManagement_System.EmployeeManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagement_System.EmployeeManagementSystem.models.Employee;
import com.EmployeeManagement_System.EmployeeManagementSystem.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public void removeEmployee(Integer id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
	}

	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Employee editEmployee(Employee employee,Integer id) {
		// TODO Auto-generated method stub
		Employee oldEmp = employeeRepo.findById(id).get();
		oldEmp.setEmail(employee.getEmail());
		oldEmp.setEmpFirstName(employee.getEmpFirstName());
		oldEmp.setEmpFullNmae(employee.getEmpFullNmae());
		oldEmp.setEmpLastName(employee.getEmpLastName());
		oldEmp.setJoiningDate(employee.getJoiningDate());
		oldEmp.setMobile(employee.getMobile());
		return employeeRepo.save(oldEmp);
	}

}
