package com.naresh.core;

public class Amazon {//dependent
	
	private Courier courier;//dependency
	
	public void sendOrderToCustomer() {
		courier.deliverOrder();
	}

	public Amazon(Courier courier) {
		super();
		this.courier = courier;
	}
	
	public Amazon() {
		
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	@Override
	public String toString() {
		return "Amazon [courier=" + courier + "]";
	}
	
	
	
	

}
