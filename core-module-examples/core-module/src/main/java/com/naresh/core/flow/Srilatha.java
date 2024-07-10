package com.naresh.core.flow;

public class Srilatha {
	
	private Naresh naresh;
	
	public Srilatha() {
		System.out.println("srilatha");
	}
	
	public Srilatha(Naresh naresh) {
		this.naresh = naresh;
		System.out.println("srilatha");
	}

	public Naresh getNaresh() {
		return naresh;
	}

	public void setNaresh(Naresh naresh) {
		this.naresh = naresh;
	}

	@Override
	public String toString() {
		return "Srilatha [naresh=" + naresh + "]";
	}
	
	

}
