package com.naresh.core.autowiring;

public class Traveller {//dependent
	
	private String name;
	private Train janmabhumi;//dependency
	
	public Traveller(String name, Train janmabhumi) {
		super();
		this.name = name;
		this.janmabhumi = janmabhumi;
	}
	public Traveller() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Train getJanmabhumi() {
		return janmabhumi;
	}
	public void setJanmabhumi(Train janmabhumi) {
		this.janmabhumi = janmabhumi;
	}
	@Override
	public String toString() {
		return "Traveller [name=" + name + ", train=" + janmabhumi + "]";
	}
	
	

}
