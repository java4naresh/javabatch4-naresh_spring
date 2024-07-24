package com.naresh.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.naresh.core.Person;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public Person createPerson() {
		Person p = new Person();
		p.setName("Naresh");
		p.setAge(31);
		return p;
	}

}
