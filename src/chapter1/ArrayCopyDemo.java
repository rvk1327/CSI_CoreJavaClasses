package chapter1;

public class ArrayCopyDemo {

	public static void main(String[] str) {
		
		int[] x = {10,20,30,40,50};
		
		int[] y = x;
		
		y[2] = 100;
		
		for(int i=0; i<y.length; i++) {
			
			System.out.println(y[i]);
		}
		
		for(int i=0; i<x.length; i++) {
			
			System.out.println(x[i]);
		}
	}
}
