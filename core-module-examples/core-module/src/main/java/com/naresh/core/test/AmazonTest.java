package com.naresh.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naresh.core.Amazon;

public class AmazonTest {

	public static void main(String[] args) {
		//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
		//create IOC container
		//ApplicationContext container = new ClassPathXmlApplicationContext("loose-coupling-spring-dependency.xml");
		ApplicationContext container = new AnnotationConfigApplicationContext("com.naresh.core");
		Amazon order1 = (Amazon)container.getBean("amazon");
		order1.sendOrderToCustomer();
		
		//Amazon order2 = (Amazon)container.getBean("order2");
		//order2.sendOrderToCustomer();
	}
}
