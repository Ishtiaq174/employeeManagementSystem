package com.EmployeeManagement_System.EmployeeManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.EmployeeManagement_System.EmployeeManagementSystem.models.Project;
import com.EmployeeManagement_System.EmployeeManagementSystem.repository.ProjectRepo;

@Service
public interface ProjectService {

	public Project getProject(Integer id);
	
	public List<Project> getAllProject();
	
	public Project addProject(Project project);
	
	public void deleteProject(Integer id);
	
	public Project editProject(Project project, Integer id);
	
	
}
