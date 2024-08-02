package com.naresh.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naresh.spring.controller.EmployeeController;
import com.naresh.spring.model.EmployeeModel;

public class EmployeeTest {

	public static void main(String[] args) {
		//ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext container = new AnnotationConfigApplicationContext("com.naresh.spring");
		EmployeeController controller = (EmployeeController)container.getBean("employeeController");
		controller.saveEmployee(new EmployeeModel(6, "Kalyan"));
	}

}
