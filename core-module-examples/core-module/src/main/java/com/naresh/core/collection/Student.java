package com.naresh.core.collection;

import java.util.List;
import java.util.Map;

public class Student {
	
	private String studentName;
	//private List<String> marks;
	private Map<String, Integer> marks;
	
	public Student(String studentName, Map<String, Integer> marks) {
		super();
		this.studentName = studentName;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", marks=" + marks + "]";
	}
	
	

}
