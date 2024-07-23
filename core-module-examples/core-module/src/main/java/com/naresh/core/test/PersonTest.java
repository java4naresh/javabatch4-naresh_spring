package com.naresh.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.naresh.core.Person;


public class PersonTest {

	public static void main(String[] args) {
		//ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext container = new AnnotationConfigApplicationContext(com.naresh.core.config.SpringConfiguration.class);
		Person p1 = (Person)container.getBean("createPerson");
		System.out.println(p1);
	}

}
