package com.EmployeeManagement_System.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeManagement_System.EmployeeManagementSystem.models.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer>{

}
