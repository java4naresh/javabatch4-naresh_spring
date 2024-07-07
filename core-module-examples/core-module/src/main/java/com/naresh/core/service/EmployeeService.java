package com.naresh.core.service;

import java.util.List;

import com.naresh.core.data.EmployeeData;

public class EmployeeService {
	
	private EmployeeData employeeData;
	
	public EmployeeService() {
		System.out.println("EmployeeService zero constructor");
	}
	
	public EmployeeService(EmployeeData employeeData) {
		System.out.println("EmployeeService param constructor");
		this.employeeData = employeeData;
	}
	
	public void setEmployeeData(EmployeeData employeeData) {
		System.out.println("EmployeeService setter");
		this.employeeData = employeeData;
	}
	
	public List<String> getNames() {
		return employeeData.getNames();
	}
	
	

}
