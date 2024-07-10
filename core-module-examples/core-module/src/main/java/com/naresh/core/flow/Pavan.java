package com.naresh.core.flow;

public class Pavan {
	
	private Srilatha srilatha;

	public Pavan(Srilatha srilatha) {
		super();
		System.out.println("pavan");
		this.srilatha = srilatha;
	}
	
	public Pavan() {
		System.out.println("pavan");
	}

	public Srilatha getSrilatha() {
		return srilatha;
	}

	public void setSrilatha(Srilatha srilatha) {
		System.out.println("setting srilatha");
		this.srilatha = srilatha;
	}

	@Override
	public String toString() {
		return "Pavan [srilatha=" + srilatha + "]";
	}
	
	
	

}
