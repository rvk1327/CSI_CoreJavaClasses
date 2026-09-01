package chapter1;

public class ArrayDemo {

	public static void main(String[] str) {
		
		int[] x = new int[3];
		
		x[1] = 10;
		x[2] = 20;
		
		int[] y = {10,20,30,40};
		
		int lenx = x.length;
		int leny = y.length;
		
		System.out.println("Length of X: " + lenx);
		System.out.println("Length of Y: " + leny);
		
		System.out.println("Elements of X...");
		
		for(int i=0; i<lenx; i++) {
			
			int value = x[i];
			System.out.println(value);
		}
		
		
		System.out.println("Elements of Y...");
		
		for(int i=0; i<leny; i++) {
			
			int value = y[i];
			System.out.println(value);
		}
		
		
		
	}
}
