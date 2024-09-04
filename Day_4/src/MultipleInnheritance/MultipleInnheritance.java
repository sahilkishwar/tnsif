package MultipleInnheritance;

interface one{
	void show();
}

interface two{
	void display();	
}

class Three{
	public void display() {
		System.out.println("This is child class");
	}
}

class four extends Three implements two,one
{
	public void show() {
		System.out.println("This is parent 1");
	}
	public void disp()
	{
		System.out.println("This si parent 2");
	}
}
	public class MultipleInnheritance {
		public static void main(String[]args) {
			
			four f = new four();
			f.disp();
			f.display();
			f.show();
		}
}


