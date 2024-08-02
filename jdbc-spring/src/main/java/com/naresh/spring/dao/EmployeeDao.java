package com.naresh.spring.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.naresh.spring.model.EmployeeModel;

@Component
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate template;
	
	public EmployeeDao() {
		
	}

	public EmployeeDao(JdbcTemplate template) {
		super();
		this.template = template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void saveEmployee(EmployeeModel emp) {
		template.execute("insert into employee values("+emp.getEmpId()+", "+"'"+emp.getEmpName()+"'"+")");
		System.out.println("Employee Saved Successfully");
	}
	
	

}
