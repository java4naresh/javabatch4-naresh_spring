package com.naresh.core.construcor.injection;

public class Customer {
	
	private String name;
	private Integer age;
	private String qualification;
	
	public Customer(String name, Integer age, String qualification) {
		super();
		this.name = name;
		this.age = age;
		this.qualification = qualification;
	}
	
	public Customer(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public Customer() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", qualification=" + qualification + "]";
	}

	
	
	

}
