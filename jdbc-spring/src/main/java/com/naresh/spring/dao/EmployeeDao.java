package com.naresh.spring.dao;
import org.springframework.jdbc.core.JdbcTemplate;

import com.naresh.spring.model.EmployeeModel;

public class EmployeeDao {
	
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
