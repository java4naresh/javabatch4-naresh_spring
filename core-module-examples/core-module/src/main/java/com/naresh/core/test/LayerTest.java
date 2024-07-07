package com.naresh.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.core.controller.EmployeeController;

public class LayerTest {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeController controller = (EmployeeController)container.getBean("controller");
		System.out.println(controller.getNames());
	}

}
