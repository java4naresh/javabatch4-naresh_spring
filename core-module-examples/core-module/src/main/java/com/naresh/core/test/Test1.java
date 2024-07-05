package com.naresh.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.core.Person;

public class Test1 {
	
	public static void main(String[] args) {
		//create a container(IOC)
		ApplicationContext container = new ClassPathXmlApplicationContext("spring-dependency.xml");
		Person person1 = (Person)container.getBean("person1");
		System.out.println(person1);
	}

}
