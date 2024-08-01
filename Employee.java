package com.EmployeeManagement_System.EmployeeManagementSystem.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp_Table")
public class Employee {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int id;
	private String EmpFirstName;
	private String EmpLastName;
	private String EmpFullNmae;
	private String email;
	private String mobile;
	private Date joiningDate;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmpFirstName() {
		return EmpFirstName;
	}



	public void setEmpFirstName(String empFirstName) {
		EmpFirstName = empFirstName;
	}



	public String getEmpLastName() {
		return EmpLastName;
	}



	public void setEmpLastName(String empLastName) {
		EmpLastName = empLastName;
	}



	public String getEmpFullNmae() {
		return EmpFullNmae;
	}



	public void setEmpFullNmae(String empFullNmae) {
		EmpFullNmae = empFullNmae;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public Date getJoiningDate() {
		return joiningDate;
	}



	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}




	@ManyToOne
	@JoinColumn(name = "EmpId")
	private Project project;



	public Employee(int id, String empFirstName, String empLastName, String empFullNmae, String email, String mobile,
			Date joiningDate) {
		super();
		this.id = id;
		EmpFirstName = empFirstName;
		EmpLastName = empLastName;
		EmpFullNmae = empFullNmae;
		this.email = email;
		this.mobile = mobile;
		this.joiningDate = joiningDate;
	}
	
}
