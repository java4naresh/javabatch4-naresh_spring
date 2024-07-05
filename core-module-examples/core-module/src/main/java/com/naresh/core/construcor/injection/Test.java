package com.naresh.core.construcor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("loose-coupling-spring-dependency.xml");
		Customer customer1 = (Customer)container.getBean("customer1");

		System.out.println(customer1);
	}

}
