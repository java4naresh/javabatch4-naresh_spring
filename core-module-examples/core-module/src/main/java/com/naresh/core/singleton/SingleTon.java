package com.naresh.core.singleton;

public class SingleTon {
	
	private static SingleTon singleTon = null;
	
	private SingleTon() {
		
	}
	
	public static synchronized SingleTon getSingleTon() {
		if(singleTon == null) singleTon = new SingleTon();
		return singleTon;
	}

}
