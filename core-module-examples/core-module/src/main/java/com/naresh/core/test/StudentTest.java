package com.naresh.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.core.collection.Student;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student naresh = (Student)container.getBean("studentNaresh");
		
		System.out.println(naresh);
		
		
		
		
		
		
		
		
		
	}

}
