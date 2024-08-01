package com.EmployeeManagement_System.EmployeeManagementSystem.models;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp-table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String empFirstName;
	private String empLastName;
	private String empFullNmae;
	private Date joiningDate;
	private String mobile;
	
//	@ManyToOne(mappedBy="employees", cascade = CascadeType.ALL)
//	private Project project; 
	
	
//	public Project getProject() {
//		return project;
//	}
//	public void setProject(Project project) {
//		this.project = project;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpFullNmae() {
		return empFullNmae;
	}
	public void setEmpFullNmae(String empFullNmae) {
		this.empFullNmae = empFullNmae;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Employee(int id, String email, String empFirstName, String empLastName, String empFullNmae, Date joiningDate,
			String mobile) {
		super();
		this.id = id;
		this.email = email;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empFullNmae = empFullNmae;
		this.joiningDate = joiningDate;
		this.mobile = mobile;
//		this.project = project;
	}
	public Employee() {
		super();
	}
	
	
	
	
}
