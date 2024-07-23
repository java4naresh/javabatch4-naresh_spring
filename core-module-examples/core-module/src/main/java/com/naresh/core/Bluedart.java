package com.naresh.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Bluedart implements Courier {

	public void deliverOrder() {
		System.out.println("Order Delivered From Bluedart");
		
	}

}
