package com.naresh.core.controller;

import java.util.List;

import com.naresh.core.service.EmployeeService;

public class EmployeeController {
	
	private EmployeeService service;
	
	public EmployeeController() {
		System.out.println("EmployeeController zero param constructor");
	}
	
	public EmployeeController(EmployeeService service) {
		System.out.println("EmployeeController param constructor");
		this.service = service;
	}
	
	public void setService(EmployeeService service) {
		System.out.println("EmployeeController setter");
		this.service = service;
	}
	
	public List<String> getNames() {
		return service.getNames();
	}

}
