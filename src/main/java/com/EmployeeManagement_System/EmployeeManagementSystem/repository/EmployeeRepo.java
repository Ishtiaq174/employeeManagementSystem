package com.EmployeeManagement_System.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeManagement_System.EmployeeManagementSystem.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
