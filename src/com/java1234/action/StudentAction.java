package com.java1234.action;


import java.util.List;

import com.java1234.model.Student;
import com.opensymphony.xwork2.Action;

public class StudentAction implements Action{

	private List<Student> students;
	
	
	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	@Override
	public String execute() throws Exception {
		System.out.println("执行了StudentAction方法");
		
		for(Student s:students){
			System.out.println(s);
		}
		
		return null;
	}

}
