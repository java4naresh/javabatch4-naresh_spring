package com.naresh.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.naresh.spring.model.EmployeeModel;
import com.naresh.spring.service.EmployeeService;

@Component
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	public EmployeeController() {
		
	}
	
	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}

	public void setService(EmployeeService service) {
		this.service = service;
	}
	
	public void saveEmployee(EmployeeModel model) {
		service.saveEmployee(model);
	}

}
