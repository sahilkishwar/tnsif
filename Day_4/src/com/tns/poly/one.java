package com.tns.poly;

 class three {
	 void disp(int c) {
		 System.out.println("class one");
	 }
 }	 
class Two extends one{
	void disp(int c) {
		System.out.println(c);
	}
}
public class one{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Two t= new Two();
		t.disp(17);
	}
	
}
	 
	 
	

 
