package com.jbedu.test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("홍길동", 27, 3);
		
		//student.name = "홍길동";
		student.setName("홍길동");
		student.setAge(27);
		student.setGrade(3);
		
		System.out.println(student.getName());

	}

}
