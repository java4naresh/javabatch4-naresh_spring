package com.naresh.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.core.lifecycle.Test;

public class Test1 {
	
	public static void main(String[] args) {
		//create a container(IOC)
		/*ApplicationContext container = new ClassPathXmlApplicationContext("spring-dependency.xml");
		Person person1 = (Person)container.getBean("person1");
		System.out.println(person1);*/
		
		//ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext container = new AnnotationConfigApplicationContext("com.naresh.core");
		Test t1 = (Test)container.getBean("test");
		//System.out.println(t1);
		//container.cl
	}

}
