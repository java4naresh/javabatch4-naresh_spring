package com.naresh.core;

import org.springframework.stereotype.Component;

@Component
public class DTDC implements Courier {

	public void deliverOrder() {
		System.out.println("Order Delivered From DTDC");
		
	}

}
