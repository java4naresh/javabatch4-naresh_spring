package com.naresh.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.naresh.core.data.EmployeeData;

@Component
@Scope("prototype")
public class EmployeeService {
	
	@Autowired
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

	public EmployeeData getEmployeeData() {
		return employeeData;
	}
	
	
	
	

}
