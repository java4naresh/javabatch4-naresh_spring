package com.naresh.spring.model;

public class EmployeeModel {
	
	private Integer empId;
	private String empName;
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
	public EmployeeModel(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	

}
