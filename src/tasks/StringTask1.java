package tasks;

public class StringTask1 {

	public static void main(String[] str) {
		
		String st = "***********welcome************to*************java**************";
		
		//output: welcome*to*java
		
		//CharSet:  UTF-8, UTF-16
		/*
		 * UTF : Unicode Text Format
		 * UTF-8: 0-127
		 * UTF-16: 0-255:  Streaming
		 */
		
		String st1 = "welcome";
		int start =0, end= st1.length()-1;
		char[] ch = st1.toCharArray();
		
		while(start < end) {
			
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;			
			start ++;
			end--;
		}
		
		String rev_str = "";
		for(int i=0; i<ch.length; i++) {
			rev_str = rev_str + ch[i];
		}
		System.out.println(rev_str);
		
	}
}
