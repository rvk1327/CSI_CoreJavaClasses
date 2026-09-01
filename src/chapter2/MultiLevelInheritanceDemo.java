package chapter2;

public class MultiLevelInheritanceDemo {

	public static void main(String[] str) {
		
		MultiC mc = new MultiC();
		mc.display1();
		mc.display2();
		mc.display3();
	}
}

class MultiA {
	
	public void display1() {
		
		System.out.println("This is class Multi-A");
	}
}

class MultiB extends MultiA {
	
	public void display2() {
		
		System.out.println("This is class Multi-B");
	}
}

class MultiC extends MultiB {
	
	public void display3() {
		
		System.out.println("This is class Multi-C");
	}
}







