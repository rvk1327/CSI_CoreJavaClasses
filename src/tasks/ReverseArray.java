package tasks;

public class ReverseArray {

	public static void main(String[] str) {
		
		int[] x = {8,7,10,15,5,2,20};
		
		int start = 0, end = x.length-1;
	
		while(start < end) {
			
			int temp = x[start];
			x[start] = x[end];
			x[end] = temp;
			
			start++;
			end--;
		}
		
		
		
		for(int i=0; i<x.length; i++) {
			
			System.out.println(x[i]);
		}
		
	}
}
