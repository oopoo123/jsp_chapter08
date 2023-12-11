package com.jbedu.test;

import javax.management.loading.PrivateClassLoader;

public class Student {
	
	private String Name; // 학생이름
	private int Age;//나이
	private int Grade;//학년
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Name;
	}

	public Student(String name, int age, int grade) {
		super();
		Name = name;
		Age = age;
		Grade = grade;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getGrade() {
		return Grade;
	}

	public void setGrade(int grade) {
		Grade = grade;
	}
	
	
		

}
