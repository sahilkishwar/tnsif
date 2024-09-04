package Polymorphism;

 class Num {
	
	 int num1;
	 int num2;
	 int result;
	 
	 void sum(int a,int b) 
	 {
		 num1 =a;
		 num2 = b;
		 result = a+b;
		 System.out.println("The Result is:"+result);
	 }
	 
	
	 void sum(int a,double b) 
	 {
		 num1 =a;
		 num2 = (int)b;
		 result =a+(int)b;
		 System.out.println("The Result is:"+result);
		 
	 }
	 
	 void sum(double a,double b) 
	 {
		 num1 =(int)a;
		 num2 = (int)b;
		 result =(int)a+(int)b;
		 System.out.println("The Result is:"+result);
	 }
}
 
 
 }
 