package com.naresh.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.naresh.core.service.EmployeeService;

@Component
@Scope("prototype")
public class EmployeeController {
	
	@Autowired
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
