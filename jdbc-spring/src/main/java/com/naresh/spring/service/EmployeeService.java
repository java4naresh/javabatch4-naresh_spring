package com.naresh.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.naresh.spring.dao.EmployeeDao;
import com.naresh.spring.model.EmployeeModel;

@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeDao dao;
	
	public EmployeeService() {
		
	}
	
	public EmployeeService(EmployeeDao dao) {
		super();
		this.dao = dao;
	}



	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}



	public void saveEmployee(EmployeeModel model) {
		dao.saveEmployee(model);
	}

}
