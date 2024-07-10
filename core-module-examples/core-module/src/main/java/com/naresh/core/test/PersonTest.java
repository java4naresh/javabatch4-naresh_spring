package com.naresh.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.core.collection.Person;

public class PersonTest {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p1 = (Person)container.getBean("person1");
		System.out.println(p1);
	}

}
