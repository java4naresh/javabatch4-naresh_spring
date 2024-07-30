package com.naresh.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Test {
	
	public Test() {
		System.out.println("Test Object Creating");
	}
	
	@PostConstruct
	public void m1() {
		System.out.println("Test Object Created");
	}
	
	@PreDestroy
	public void m2() {
		System.out.println("Test Object Destroyed");
	}

}
