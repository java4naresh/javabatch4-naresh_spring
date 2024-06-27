package com.naresh.core;

public class B {//dependent class {
	
	A a;//dependeny

	public B(A a) {
		super();
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
	
	public void addAndMultiply(int num1, int num2) {
		a.add(num1, num2);
		
		System.out.println(num1*num2);
	}
	
	
	

}
