package com.naresh.core.data;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
	
	private static List<String> names = new ArrayList<>();
	
	static {
		names.add("Naresh");
		names.add("Pavan");
		names.add("Srilatha");
		names.add("Shyamala");
		
	}
	
	public List<String> getNames() {
		return names;
	}

}
