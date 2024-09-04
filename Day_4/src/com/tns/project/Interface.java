package com.tns.project;


interface stud1{
	int age =25;// final and static
	void display();
}
class stud2 implements stud1{
	public void display() {
		System.out.println("The student ");
	}
}
class Interface {


	public static void main(String[] args) {
		stud1 st = new stud2();//reference for interface
		st.display();
		
		
		
		
		

	}

}
