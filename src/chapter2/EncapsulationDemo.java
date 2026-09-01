package chapter2;

public class EncapsulationDemo {

	public static void main(String[] str) {
		
		LooselyCoupled lc = new LooselyCoupled();		
		lc.func2();
		System.out.println(lc.stname);
		lc.func1();
		
		TightlyCoupled tc = new TightlyCoupled();
		tc.disp1();
		tc.disp2();
	}
}

class TightlyCoupled {
	
	String stname;
	
	public void disp1() {
		
		stname = "DEF";
	}
	
	public void disp2() {
		
		System.out.println("Hi " + stname);
	}
}





class LooselyCoupled {
	
	String stname = "ABC";
	
	public void func1() {
		
		System.out.println("Welcome  " + stname);
	}
	
	public void func2() {
		
		System.out.println("Hello " + stname);
	}
}


class Bank {
	
	double cap_amt;
	
	public void deposit(double amt) {
		
		cap_amt = cap_amt + amt;
	}
	
	public void withdraw(double amt) {
		
		cap_amt = cap_amt - amt;
	}
}

















