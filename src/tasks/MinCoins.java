package tasks;

public class MinCoins {

	public static void main(String[] str) {
		
		int[] x = {1,5,6,9};
		int target = 11;
		
		int start = 0;
		int end = x.length-1;
		int flag = 0;
		
		while(start < end) {
			
			if((x[start]+x[end] == target)) {
				
				System.out.println(x[start] + " ," + x[end]);
			
			}else {
				flag=-1;
			}
			
			start++;
			end--;
		}
	}
	

}
