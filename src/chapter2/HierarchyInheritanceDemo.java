package chapter2;

public class HierarchyInheritanceDemo {

	public static void main(String[] str) {
		
		HierarchyC hc = new HierarchyC();
		hc.display();
		hc.calc1();
		
		Object obj = new Object();
	}
}


class HierarchyA {
	
	public void display() {
		
		System.out.println("Class Hierarchy-A");
	}
}


class HierarchyB extends HierarchyA {
	
	public void calc() {
		
		System.out.println(100+200);
	}
}


class HierarchyC extends HierarchyA {
	
	public void calc1() {
		
		System.out.println(300+400);
	}
}




