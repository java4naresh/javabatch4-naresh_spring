package com.naresh.core.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.naresh.core.flow.Naresh;

public class FlowTest {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("applicationContext.xml");
        //ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Naresh naresh = (Naresh)container.getBean("naresh");
		//System.out.println(naresh);
		BeanFactory container = new XmlBeanFactory(resource);
		Naresh naresh = (Naresh)container.getBean("naresh");
		

	}

}
