package chapter2;

public class AbstractionDemo {

	public static void main(String[] str) {
		
		Abs2 ab2 = new Abs2();
		ab2.calc1();
		ab2.calc2();
		
		
	}
}

abstract class Abs1 {
	
	public void calc1() {
		
		System.out.println(100+200);
	}
	
	abstract public void calc2(); //function declaration		
	
}



class Abs2 extends Abs1 {
	
	public void calc2() {
		
		System.out.println(500+600);
	}
}













