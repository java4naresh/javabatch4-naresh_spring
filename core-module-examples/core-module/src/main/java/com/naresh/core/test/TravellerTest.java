package com.naresh.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.core.autowiring.Traveller;

public class TravellerTest {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Traveller t1 = (Traveller)container.getBean("traveller1");
        System.out.println(t1);
	}

}
