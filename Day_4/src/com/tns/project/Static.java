package com.tns.project;

 class Student {
	String name;
	int rollNo;
	static String teacherName;
	
	void display() {
		
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll No: "+rollNo);
		System.out.println("Teacher Name: "+teacherName);
	}
		
	static {
		Student.teacherName="Avase";
		
	}
	
public class Static{
	static void method() {
	
	System.out.println("Static keyword in the method");
}
public static void main(String[] args) {
	Student s1 = new Student();
	Student s2 = new Student();
	
	s1.name="Altaf";
	s1.rollNo= 21;
	
	s2.name = "Bossa";
	s2.rollNo = 22;
	
	s1.display();
	s2.display();
	
	method();
	
			
}
}}

 