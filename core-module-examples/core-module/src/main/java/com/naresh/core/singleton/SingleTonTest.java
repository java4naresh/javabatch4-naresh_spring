package com.naresh.core.singleton;

public class SingleTonTest {

	public static void main(String[] args) {
		SingleTon s1 = SingleTon.getSingleTon();
		SingleTon s2 = SingleTon.getSingleTon();
		SingleTon s3 = SingleTon.getSingleTon();
		SingleTon s4 = SingleTon.getSingleTon();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

	}

}
