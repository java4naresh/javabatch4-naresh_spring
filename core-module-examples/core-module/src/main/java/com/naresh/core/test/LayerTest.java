package com.naresh.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.core.controller.EmployeeController;

public class LayerTest {

	public static void main(String[] args) {
		//ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext container = new AnnotationConfigApplicationContext("com.naresh.core");
		EmployeeController controller = (EmployeeController)container.getBean("employeeController");
		//System.out.println(controller.hashCode());
		EmployeeController controller2 = (EmployeeController)container.getBean("employeeController");
		//System.out.println(controller2.hashCode());
		System.out.println(controller.getNames());
		System.out.println(controller.getNames());
		
		//what are the scopes available in spring?
		//1) singleton
		//2) prototype
	}

}
