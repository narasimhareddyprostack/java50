package com.jpa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	@Id
	private String Id;
	private Integer empId;
	private String empName;
	private String empEmail;
	private double empSal;
	
	
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, Integer empId, String empName, String empEmail, double empSal) {
		super();
		Id = id;
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSal = empSal;
	}

	public Employee(Integer empId, String empName, String empEmail, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail
				+ ", empSal=" + empSal + "]";
	}
	
	//generate setters and getters
	//default const and parameterized const
	//toString method, to print object
	
	
}
