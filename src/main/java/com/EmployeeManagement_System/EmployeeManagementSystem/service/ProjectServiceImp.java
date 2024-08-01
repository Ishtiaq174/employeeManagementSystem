package com.EmployeeManagement_System.EmployeeManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagement_System.EmployeeManagementSystem.models.Project;
import com.EmployeeManagement_System.EmployeeManagementSystem.repository.ProjectRepo;

@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	private ProjectRepo projectRepo;
	
	@Override
	public Project getProject(Integer id) {
		// TODO Auto-generated method stub
		
		return projectRepo.findById(id).get();
	}

	@Override
	public List<Project> getAllProject() {
		// TODO Auto-generated method stub
		 return projectRepo.findAll();
	}

	@Override
	public Project addProject(Project project) {
		// TODO Auto-generated method stub
		return projectRepo.save(project);
	}

	@Override
	public void deleteProject(Integer id) {
		// TODO Auto-generated method stub
		projectRepo.deleteById(id);
	}

	@Override
	public Project editProject(Project project, Integer id) {
		// TODO Auto-generated method stub
		Project oldPro=projectRepo.findById(id).get();
		oldPro.setDuration(project.getDuration());
		oldPro.setProjectName(project.getProjectName());
		oldPro.setStartDate(project.getStartDate());
		projectRepo.save(oldPro);
		return oldPro;
	}

}
