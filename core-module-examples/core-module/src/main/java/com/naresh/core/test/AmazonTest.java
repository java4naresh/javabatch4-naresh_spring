package com.naresh.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.core.Amazon;

public class AmazonTest {

	public static void main(String[] args) {
		//create IOC container
		ApplicationContext container = new ClassPathXmlApplicationContext("loose-coupling-spring-dependency.xml");
		Amazon order1 = (Amazon)container.getBean("order1");
		order1.sendOrderToCustomer();
		
		Amazon order2 = (Amazon)container.getBean("order2");
		order2.sendOrderToCustomer();
	}

}
