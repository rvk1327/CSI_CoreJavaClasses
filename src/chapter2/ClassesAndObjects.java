package chapter2;

public class ClassesAndObjects {
	
	static final int VALUE = 500;
	
	public void display() {
		
		System.out.println("This is class ClassesAndObjects");
	}

	public static void main(String[] str) {
		
		//Object creation
		
		Hello h1 = new Hello();
		
		System.out.println(h1);
		
		Hello h2 = null;
		
		//h2.calc1();
		
		h2 = new Hello();
		
		h2.calc1();
		
		Hello h3 = h2;
		
		
		//accessing elements
		
		int valuex = h1.x;
		System.out.println(valuex);
		int valuey = h1.y;
		System.out.println(valuey);
		
		h1.calc1(); //300
		h1.calc2(); //600
		
		ClassesAndObjects cls = new ClassesAndObjects();
		
		cls.display();
		
		System.out.println(VALUE);
	}
}

//class ClassesAndObjects end

class Hello {
	
	//class variables
	int x = 100, y = 200;
	
	//functions
	public void calc1() {		
		System.out.println(x+y);
		x = 200;
	}
	
	public void calc2() {
		
		int z = 300; //local variable
		
		System.out.println(x+y+z);
	}
	
}











