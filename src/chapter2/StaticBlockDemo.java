package chapter2;

public class StaticBlockDemo {
	
	static String stname  = "ABC";

	public static void main(String[] str) {
		
		System.out.println("Welcome");
		System.out.println(stname);
	}
	
	static {
		
		System.out.println("Hello");
		System.out.println(stname);
	}
	
	static {
		
		System.out.println("Java");
	}
}
