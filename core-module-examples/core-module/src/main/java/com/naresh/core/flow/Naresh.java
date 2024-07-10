package com.naresh.core.flow;

public class Naresh {
	
	private Srilatha srilatha;

	/*public Naresh(Pavan pavan) {
		super();
		System.out.println("naresh");
		this.pavan = pavan;
	}*/
	
	
	
	public Naresh() {
		System.out.println("naresh");
	}

	public Naresh(Srilatha srilatha) {
		super();
		this.srilatha = srilatha;
	}

	public Srilatha getSrilatha() {
		return srilatha;
	}

	public void setSrilatha(Srilatha srilatha) {
		this.srilatha = srilatha;
	}

	@Override
	public String toString() {
		return "Naresh [srilatha=" + srilatha + "]";
	}

	/*public Pavan getPavan() {
		return pavan;
	}

	public void setPavan(Pavan pavan) {
		System.out.println("setting pavan");
		this.pavan = pavan;
	}*/

	/*@Override
	public String toString() {
		return "Naresh [pavan=" + pavan + "]";
	}*/
	
	
	
	
	
	

}
