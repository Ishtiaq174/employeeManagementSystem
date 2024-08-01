package com.EmployeeManagement_System.EmployeeManagementSystem.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Project_Table")
public class Project {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int projectId;
	private String projectName;
	private Date startDate;
	private String duration;
	
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="empId",referencedColumnName = "projectId")
	private List<Employee> employees;


	public List<Employee> getEmployees() {
		return employees;
	}



	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}



	public int getProjectId() {
		return projectId;
	}



	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public String getDuration() {
		return duration;
	}



	public void setDuration(String duration) {
		this.duration = duration;
	}



	public Project(int projectId, String projectName, Date startDate, String duration, List<Employee> employees) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.startDate = startDate;
		this.duration = duration;
		this.employees = employees;
	}



	public Project() {
		super();
	}


}
