package com.EmployeeManagement_System.EmployeeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement_System.EmployeeManagementSystem.models.Employee;
import com.EmployeeManagement_System.EmployeeManagementSystem.models.Project;
import com.EmployeeManagement_System.EmployeeManagementSystem.service.EmployeeService;
import com.EmployeeManagement_System.EmployeeManagementSystem.service.ProjectService;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/")
	public ResponseEntity<List<Project>> getAllEmployees(){
		List<Project> projects=projectService.getAllProject();
		return ResponseEntity.ok(projects);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Project> getEmployee(@PathVariable Integer id){
		Project project=projectService.getProject(id);
		return ResponseEntity.ok(project);
	}
	
	@PostMapping("/")
	public ResponseEntity<Project> createEmployee( @RequestBody Project project){
		Project emp = projectService.addProject(project);
		return ResponseEntity.ok(emp);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		projectService.deleteProject(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Project> editEmployee(@RequestBody Project project, @PathVariable Integer id){
		Project emp=projectService.editProject(project, id);
		return ResponseEntity.ok(emp);
	}
}
