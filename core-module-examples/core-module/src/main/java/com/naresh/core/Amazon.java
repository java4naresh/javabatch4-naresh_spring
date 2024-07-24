package com.naresh.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Amazon {//dependent
	
	@Autowired
	//@Qualifier("DTDC")
	@Qualifier("bluedart")
	private Courier courier;//dependency
	
	public void sendOrderToCustomer() {
		courier.deliverOrder();
	}

	//@Autowired
	public Amazon(Courier courier) {
		super();
		this.courier = courier;
	}
	
	public Amazon() {
		
	}

	public Courier getCourier() {
		return courier;
	}

	//@Autowired
	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	@Override
	public String toString() {
		return "Amazon [courier=" + courier + "]";
	}

}
