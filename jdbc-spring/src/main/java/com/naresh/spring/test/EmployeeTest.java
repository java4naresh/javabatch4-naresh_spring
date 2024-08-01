package com.naresh.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.spring.dao.EmployeeDao;
import com.naresh.spring.model.EmployeeModel;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao = (EmployeeDao)container.getBean("empDao");
		dao.saveEmployee(new EmployeeModel(2, "Pavan"));
	}

}
