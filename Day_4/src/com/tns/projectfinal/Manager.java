package com.tns.projectfinal;

class Final {
	
	void show() {
		System.out.println("Show method inn paresn class");
	}
}
class Employee extends Final{
	void show() {
		System.out.println("Show method i child class");
		
	}
	
}

public class Manager{
	public static void main(String[]args) {
		
		Employee emp = new Employee();
		
		emp.show();
	}
}

