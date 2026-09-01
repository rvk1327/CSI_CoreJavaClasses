package tasks;

public class SumOfArray {

	public static void main(String[] str) {
		
		int[] x = {10,20,30,40};
		int sum = 0;
		
		for(int i=0; i<x.length; i++) {
			
			int value = x[i];
			sum = sum + value;
		}
		
		System.out.println(sum);
	}
}
